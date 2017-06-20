package com.clinicalresearch.controller;



import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clinicalresearch.core.bean.CreateExportPlan;
import com.clinicalresearch.core.bean.ExportFile;
import com.clinicalresearch.core.bean.ExportPlanBean;
import com.clinicalresearch.core.bean.ExportVariable;
import com.clinicalresearch.core.bean.FileMessage;
import com.clinicalresearch.core.service.CreateFileService;
import com.clinicalresearch.core.service.DataExportService;
import com.clinicalresearch.model.CreateExportPlanRequest;
import com.google.gson.Gson;

/**
 * 数据下载的控制器
 * @author ztq_2016
 *
 */

@Controller
public class ExportDataController {
	
	@Autowired
	private DataExportService dataExportService;
	
	@Autowired
	private CreateFileService createFileService;
	
	private static final Gson gson = new Gson();
	
	
	@RequestMapping("/saveFile")
	@ResponseBody
	public void saveFile(@RequestBody Map<String,Object> map) {
		createFileService.createFile(map.get("userId").toString(), map.get("fileContent").toString());
	}
	
	@RequestMapping("/deleteFile")
	@ResponseBody
	public Object deleteFile(HttpServletRequest request,@RequestBody Map<String,Object> map) {
		Object object = map.get("fileId");
		if (object != null) {
			int parseInt = Integer.parseInt(object.toString());
			createFileService.deleteDownLoadFile(parseInt);
		}
		String userId = (String)request.getSession().getAttribute("userId");
		List<ExportFile> queryExportFileList = dataExportService.queryExportFileList(userId);
		return queryExportFileList;
	}
	
	/**
	 * 查询已经存在的变量导出计划与变量列表
	 * @return
	 */
	@RequestMapping(value="/queryexportplan",method=RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public Object queryExportVariable(@RequestBody()Map<String, String> map,HttpServletRequest request) {
		String expIdstr = map.get("expId");
		String userId = (String)request.getSession().getAttribute("userId");
		Integer expId = null;
		if (expIdstr != null && !expIdstr.isEmpty()) {
			expId = Integer.parseInt(expIdstr);
		}
		ExportPlanBean allExportVariablesByUserId = dataExportService.getExportPlanByUserId(userId, expId);
		return allExportVariablesByUserId;
	}
	
	/**
	 * 根据关键字查询当前变量列表
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/queryexportvariable",method=RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public Object createExportPlan(@RequestBody()Map<String, String> map, HttpServletRequest request) {
		String keyWord = map.get("keyWord");
		String expId = map.get("expId");
		ExportPlanBean queryByKeyWord = new ExportPlanBean();
		
		Integer parseInt = null;
		if (expId != null && !expId.isEmpty()) {
			parseInt = Integer.parseInt(expId);
		}
		queryByKeyWord = dataExportService.queryByKeyWord(keyWord, parseInt);
		return queryByKeyWord;
	}
	
	/**
	 * 创建并且拉取数据
	 * @param cepr
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/createplanandexport",method=RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public Object createPlanAndExport(@RequestBody()CreateExportPlanRequest cepr, HttpServletRequest request) {
		
		/*生成导出计划*/
		String userId = (String) request.getSession().getAttribute("userId");
		Boolean needCreate = cepr.getNeedCreate();
		if (needCreate != null && needCreate) {
			dataExportService.createExportPlan(cepr.getPlanName(), cepr.getExportType(), userId, cepr.getVariableList());
		}
		/*根据表达式和选中的导出变量，进行数据导出*/
		Object exp = cepr.getExp();
		String json = gson.toJson(exp);
		dataExportService.wirteFile(userId, json, cepr.getExportType());
		return "nihao";
	}
	
	/**
	 * 删除导出计划
	 * @param map
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/deleteexportplan",method=RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public Object deleteExportPlan(@RequestBody() Map<String, String> map, HttpServletRequest request) {
		String expIdStr = map.get("expId");
		if (expIdStr != null && !expIdStr.isEmpty()) {
			Integer expId = Integer.parseInt(expIdStr);
			dataExportService.deleteExportPlan(expId);
		}
		String userId = (String)request.getSession().getAttribute("userId");
		ExportPlanBean allExportVariablesByUserId = dataExportService.getExportPlanByUserId(userId, null);
		return allExportVariablesByUserId;
	}	
	
	/**
	 * 查询下载文档列表
	 * @param request
	 * @return
	 */
	@RequestMapping(value="querydownlist",method=RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public Object queryDownList(HttpServletRequest request) {
		String userId = (String)request.getSession().getAttribute("userId");
		List<ExportFile> queryExportFileList = dataExportService.queryExportFileList(userId);
		return queryExportFileList;
	}
	
	/**
	 * 下载文件接口
	 * @param fileId
	 * @return
	 */
	@RequestMapping(value="downfile",method=RequestMethod.GET)
	public ResponseEntity<byte[]> downFile(@RequestParam(required=true)Integer fileId) {
		FileMessage filePathByFileId = dataExportService.getFilePathByFileId(fileId);
		if (filePathByFileId == null) {
			return null;
		}
		String filePath = filePathByFileId.getFilePath();
		File file = new File(filePath);
		if (!file.exists()) {
			return null;
		}
		HttpHeaders headers = new HttpHeaders();  
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);  
		headers.setContentDispositionFormData("attachment", filePathByFileId.getFileName());
		
		try {
			return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),  
			        headers, HttpStatus.CREATED);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}

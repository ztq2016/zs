package com.clinicalresearch.core.thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.clinicalresearch.utils.HttpClientUtils;

import com.clinicalresearch.core.bean.ExpressBean;
import com.clinicalresearch.dao.entity.ExportFileMeta;
import com.clinicalresearch.dao.manager.ExportFileMetaMapper;
import com.google.gson.Gson;

public class ExportThread extends Thread {
	
	private final Gson gson = new Gson();
	
	private String exp;
	
	private String filePath;
	
	private ExportFileMetaMapper exportFileMetaMapper;
	
	private Integer fileId;
	
	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public ExportFileMetaMapper getExportFileMetaMapper() {
		return exportFileMetaMapper;
	}

	public void setExportFileMetaMapper(ExportFileMetaMapper exportFileMetaMapper) {
		this.exportFileMetaMapper = exportFileMetaMapper;
	}

	public Gson getGson() {
		return gson;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	@Override
	public void run() {
		super.run();
		
		ExpressBean expressBean = gson.fromJson(exp, ExpressBean.class);
		Object resultFieldObject = expressBean.getResultField();
		List<String> queryFieldList = new ArrayList<>();
		if (resultFieldObject != null) {
			List<Object> resultObjectList = gson.fromJson(gson.toJson(resultFieldObject), List.class);
			for (Object fieldObject:resultObjectList) {
				String resultField = gson.toJson(fieldObject);
				String fieldString = gson.fromJson(resultField, String.class);
				queryFieldList.add(fieldString);
			}
		}
		
		StringBuffer resultText = new StringBuffer();
		if (!queryFieldList.isEmpty()) {
			for (String resultFiled:queryFieldList) {
				if (resultFiled.equals("fieldId")) {
					resultFiled = "患者编号";
				}
				resultText.append(resultFiled).append(",");
			}
			resultText.replace(resultText.length() - 1, resultText.length(), System.lineSeparator());
		} else {
			resultText.append("患者编号,病历_基本信息_出院年龄,病历_基本信息_性别,诊断_诊断_出院诊断,就诊批次");
			resultText.append(System.lineSeparator());
		}
		
		//文件进度与状态修改
		//按照分页查询
		Integer pageSize = Integer.parseInt(expressBean.getSize());
		Integer totalRecord = 0;
		ExportFileMeta fileMetaInfo = new ExportFileMeta();
		fileMetaInfo.setFileId(fileId);
		for (int currentPageSize = 0; currentPageSize <= totalRecord/pageSize; currentPageSize ++) {
			if (currentPageSize == 0) {
				fileMetaInfo.setFileStatus("1");
				exportFileMetaMapper.updateByPrimaryKeySelective(fileMetaInfo);
			} else {
				Double downloadPercent = (currentPageSize * pageSize * 1.0) / (totalRecord * 1.0);
				fileMetaInfo.setFileProcessPer(downloadPercent.toString());
				exportFileMetaMapper.updateByPrimaryKeySelective(fileMetaInfo);
			}
			expressBean.setPage(new Integer(currentPageSize).toString());
			expressBean.setSize(pageSize.toString());
			String queryExpression = gson.toJson(expressBean);
			String queryResult = HttpClientUtils.getByPatients(queryExpression);
			String formatString = getFormatString(queryResult, queryFieldList);
			resultText.append(formatString);
			
			
			Map<String, Object> map = gson.fromJson(queryResult, Map.class);
			Double double1 = (Double) map.get("total");
			totalRecord = double1.intValue();
		}
		
//		String byPatients = HttpClientUtils.getByPatients(exp);
//		String formatString = getFormatString(byPatients, fields);
//		Map<String, Object> map = gson.fromJson(byPatients, Map.class);
//		total = (Integer) map.get("total");
//		stringBuffer.append(formatString);
		writeToFile(fileId,filePath,resultText.toString(), exportFileMetaMapper);
		
	}
	
	private void writeToFile(Integer fileId,String filePath, String text, ExportFileMetaMapper exportFileMetaMapper) {
		try {

			File file = new File(filePath);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"gb2312");
//			FileWriter fileWriter = new FileWriter(file);
//			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			outputStreamWriter.write(text);
			outputStreamWriter.flush();
			outputStreamWriter.close();
			fileOutputStream.close();
//			bufferedWriter.write(text);
//			bufferedWriter.flush();
//			bufferedWriter.close();
//			fileWriter.close();
			ExportFileMeta record = new ExportFileMeta();
			record.setFileId(fileId);
			record.setFileStatus("4");
			record.setFileProcessPer("1.00");
			record.setFileEndTime(new Date());
			//文件大小
//			Long length = file.length();
//			String size = getFileSize(length,0);
//			record.setFileSize(size);
			exportFileMetaMapper.updateByPrimaryKeySelective(record);
		} catch (IOException e) {
			ExportFileMeta record = new ExportFileMeta();
			record.setFileId(fileId);
			record.setFileStatus("2");
			record.setFileEndTime(new Date());
			exportFileMetaMapper.updateByPrimaryKeySelective(record);
			e.printStackTrace();
		}
	}
	//文件大小的需要修改
//	public static void main(String[] args) {
//		ExportThread exportThread = new ExportThread();
//		Long length = 100000000L;
//		String fileSize = exportThread.getFileSize(length, 0);
//	}
	public String getFileSize(Long length , int times) {
		String size = null;
		Long temp = null;
		temp = length / 1000;
		if (length != null) {
			if (temp < 1000 && temp > 0) {
				size = temp.toString() + SIZETYPE.getValue(times + 1);
				return size;
			} else if (temp == 0) {
				size = length + SIZETYPE.getValue(times);
				return size;
			} else {
				getFileSize(temp,times + 1);	
			}
			return null;
		} else {
			return null;
		}
		
	}
	//单位枚举
	private enum SIZETYPE{
		B(0),
		KB(1),
		MB(2),
		GB(3);
		private int times;
		
		private SIZETYPE(int times) {
			this.times = times;
		}
		
		public int getTimes() {
			return times;
		}

		public void setTimes(int times) {
			this.times = times;
		}

		public static String getValue(int times) {
			SIZETYPE[] values = SIZETYPE.values();
			for (SIZETYPE sizetype : values) {
				if (sizetype.getTimes() == times) {
					return sizetype.name();
				}
			}
			return null;
		}
	}
	
	private String getFormatString(String queryResult , List<String> queryFieldList) {
		System.out.println("进入格式化" + queryResult);
		StringBuffer resultString = new StringBuffer();
		if (queryResult != null) {
			Map<String, Object> resultMap = gson.fromJson(queryResult, Map.class);
			Object allPatientObject = resultMap.get("hits");
			String allPatientJson = gson.toJson(allPatientObject);
			List<Object> patientObjectList = gson.fromJson(allPatientJson, List.class);
			for (Object patientObject:patientObjectList) {
				
				StringBuffer onePatientText = new StringBuffer();
				if (!queryFieldList.isEmpty()) {
					Map<String,String> patientMap = getPatientFromObjectToMap(patientObject);
					
					for (String field:queryFieldList) {
						String fieldValue = patientMap.get(field);
						onePatientText.append(fieldValue);
						onePatientText.append(",");
					}
					onePatientText.replace(onePatientText.length() - 1, onePatientText.length(), System.lineSeparator());
					resultString.append(onePatientText.toString());
				} else {
					String patientJson = gson.toJson(patientObject);
					Map<String, String> patientMap = gson.fromJson(patientJson, Map.class);
					String patientId = patientMap.get("patientid");
					onePatientText.append(patientId);
					onePatientText.append(",");
					
					String age = patientMap.get("age");
					onePatientText.append(age);
					onePatientText.append(",");
					
					String gender = patientMap.get("gender");
					onePatientText.append(gender);
					onePatientText.append(",");
					
					String disease = patientMap.get("disease");
					if (disease != null) {
						disease = disease.replace(",", "，");
					}
					onePatientText.append(disease);
					onePatientText.append(",");
					
					String visitNum = patientMap.get("visitNum");
					onePatientText.append(visitNum);
					onePatientText.append(System.lineSeparator());
					resultString.append(onePatientText.toString());
				}
			}
		}
		return resultString.toString();
	}

	private Map<String, String> getPatientFromObjectToMap(Object patientObject) {
		Map<String, String> patientMap = new HashMap<>();
		String patientJson = gson.toJson(patientObject);
		List<Object> patientFieldList = gson.fromJson(patientJson, List.class);
		if (patientFieldList != null && !patientFieldList.isEmpty()) {
			for (Object field:patientFieldList) {
				String fieldJson = gson.toJson(field);
				Map<String,String> fieldMap = gson.fromJson(fieldJson,Map.class);
				patientMap.putAll(fieldMap);
			}
		}
		return patientMap;
	}
	
}

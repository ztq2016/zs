package com.clinicalresearch.core.serviceImpl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicalresearch.core.service.CreateFileService;
import com.clinicalresearch.core.service.DataExportService;
import com.clinicalresearch.dao.entity.ExportFileMeta;
import com.clinicalresearch.dao.manager.ExportFileMetaMapper;
@Service
public class CreateFileServiceImpl implements CreateFileService {

	@Autowired
	private DataExportService dataExportService;
	
	@Autowired
	private ExportFileMetaMapper exportFileMetaMapper;
	
	@Override
	public void createFile(String userId, String fileContent) {
		String type = "html";
		dataExportService.wirteFile(userId, fileContent, type);
	}

	@Override
	public void deleteDownLoadFile(Integer fileId) {
		//查询文件信息
		ExportFileMeta selectByPrimaryKey = exportFileMetaMapper.selectByPrimaryKey(fileId);
		String filePath = selectByPrimaryKey.getFilePath();
		//删除文件
		File file = new File(filePath);
		if (file.exists()) {
			file.delete();
		}
		//删除记录
		exportFileMetaMapper.deleteByPrimaryKey(fileId);
	}
	
}

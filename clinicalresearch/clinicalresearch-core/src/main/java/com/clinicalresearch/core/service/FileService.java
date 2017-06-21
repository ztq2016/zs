package com.clinicalresearch.core.service;

import java.io.File;

/**
 * 文件接口
 * @author root
 *
 */
public interface FileService {
	/**
	 * 添加文件
	 * @param file
	 * @param fileName
	 * @return
	 */
	String addFile(File file,String fileName);
}

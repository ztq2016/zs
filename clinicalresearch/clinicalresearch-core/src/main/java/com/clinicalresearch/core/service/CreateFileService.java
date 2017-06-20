package com.clinicalresearch.core.service;
/**
 * 创建文件的服务
 * @author root
 *
 */
public interface CreateFileService {
	/**
	 * 当前内容保存为html文档
	 * @param userId
	 * @param fileContent
	 */
	void createFile(String userId, String fileContent);
	
	/**
	 * 删除文件与文件对应信息
	 * @param fileId
	 */
	void deleteDownLoadFile(Integer fileId);
}

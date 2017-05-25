package com.clinicalresearch.core.service;

import java.util.List;
import java.util.Map;


import com.clinicalresearch.core.bean.STUDYSTYPE;
import com.clinicalresearch.core.bean.StudyInfo;
import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.StudysInf;

public interface StudysService {

	int getStatusByIdCount(StudysInf studys);

	List<StudysInf> selectStudysList(StudysInf studys, Page page);
	
	/**
	 * 获取不同类型的课题个数
	 * @param userId 用户id
	 * @return
	 */
	Map<STUDYSTYPE, List<Integer>> getStudyCountByType(String userId);
	
	/**
	 * 查询用户所有的课题个数
	 * @param userId 用户id
	 * @return 返回用户的课题个数，当userid为空时返回0。
	 */
	int getAllStudyCount(String userId);
	
	/**
	 * 根据课题名称进行搜索
	 * @param userId 用户id
	 * @param keyWord 课题关键字
	 * @param page 分页信息
	 * @return
	 */
	List<StudysInf> getStudyByName(String userId, String keyWord,String currentPage, String pageSize);
	
	/**
	 * 根据id查询所有study列表
	 * @param userId
	 * @return
	 */
	List<StudysInf> getAllStudyByUserId(String userId,Page page);
	
	/**
	 * 条件查询用户下的study列表
	 * @param userId 用户id 如果为空则抛异常
	 * @param studyType 研究类型，可以为空，为空时查所有满足其他条件的study
	 * @param keyWord 搜索输入关键字，为空时查询所有满足其他条件的study,目前查询内容与项目pi搜索
	 * @param page 分页情况，为空查询所有。
	 * @return
	 */
	List<Studys> getStudy(String userId,STUDYSTYPE studyType, String keyWord, Page page);
	
	/**
	 * studybean转换，并查询了一些额外的参数
	 * @param list
	 * @return 
	 */
	List<StudyInfo> convertFromStudys(List<Studys> list);
	/**
	 * 根据关键词查询用户的课题数目
	 * @param userId
	 * @param keyWord
	 * @return
	 */
	int getAllStudyCountByKeyWord(String userId, String keyWord,STUDYSTYPE studsytype);
	
	/**
	 * 根据分页和关键词查询课题列表
	 * @param userId
	 * @param keyWord
	 * @param page
	 * @return
	 */
	List<Studys> getAllStudysByKeyWord(String userId, String keyWord, STUDYSTYPE studsytype, Page page);
	
	/**
	 * 删除用户下的课题
	 * @param userId
	 * @param studyId
	 * @return 返回的为删除条数
	 */
	int deleteStudy(String userId, String studyId);
	
	StudyInfo getStudyInfoById(String userId,String studyId);
	
	/**
	 * 解析json字符串
	 * @param entryCriteria
	 * @return
	 */
	String getJsonFromEntryCriteria(String entryCriteria);
}

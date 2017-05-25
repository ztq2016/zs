package com.clinicalresearch.core.servicetest;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.core.bean.STUDYSTYPE;
import com.clinicalresearch.core.bean.StudyInfo;
import com.clinicalresearch.core.service.StudysService;
import com.clinicalresearch.dao.entity.Page;
import com.clinicalresearch.dao.entity.Studys;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class StudysServiceTest {
	
	private static final Logger logger = Logger.getLogger(PatientServiceTest.class);
	
	private static final Gson gson = new Gson();
	
	@Autowired
	private StudysService studysService;
	
	@Test
	public void getStudyTypeCountTest() {
		String userId = "000001";
		Map<STUDYSTYPE, List<Integer>> studyCountByType = studysService.getStudyCountByType(userId);
		logger.info("studyCount:" + gson.toJson(studyCountByType));
		int allStudyCount = studysService.getAllStudyCount(userId);
		logger.info("usercount:" + allStudyCount);
	}
	
	@Test
	public void getStudyList() {
		studysService.getStudyByName("000001", "课题PI", "1", "10");
	}
	
	@Test
	public void getStudy() {
//		List<Studys> study = studysService.getStudy("000001", null, null, null);
//		logger.info(gson.toJson(study.size()));
//		List<Studys> study2 = studysService.getStudy("000001", STUDSYTYPE.RCS, null, null);
//		logger.info(gson.toJson(study2.size()));
//		List<Studys> study3 = studysService.getStudy("000001", STUDSYTYPE.RCS, "nimei", null);
//		logger.info(gson.toJson(study3.size()));
		List<Studys> study4 = studysService.getStudy("000001", null, null, null);
		int size = study4.size();
		Page page = new Page("1", size, "5");
		List<Studys> study = studysService.getStudy("000001", null, null, page);
		logger.info(gson.toJson(size));
		logger.info(gson.toJson(study.size()));
	}
	
	@Test
	public void getAllStudyByUserId() {
		int allStudyCount = studysService.getAllStudyCount("000001");
		logger.info(allStudyCount);
		
		String string = "STATISTICALMODEL";
		String lowerCase = string.toLowerCase();
		System.out.println(lowerCase);
	}
	
	@Test
	public void convert() {
		List<Studys> study = studysService.getStudy("000001", null, null, null);
		System.out.println("size:" + study.size());
		List<StudyInfo> convertFromStudys = studysService.convertFromStudys(study);
		logger.info("result:" + gson.toJson(convertFromStudys));
	}
	
	@Test
	public void resource() {
		String entryCriteria = "(男    ||   年龄：10-30) &&  冠状动脉造影  &&   诊断=心肌梗死   &&  诊断=糖尿病  &&  (大汗=True   || 胸闷=true)";
		studysService.getJsonFromEntryCriteria(entryCriteria);
	}
}

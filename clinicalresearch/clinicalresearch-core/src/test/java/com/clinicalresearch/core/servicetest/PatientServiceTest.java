package com.clinicalresearch.core.servicetest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.core.bean.PatientInfo;
import com.clinicalresearch.core.service.PatientService;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class PatientServiceTest {
	
	private static final Logger logger = Logger.getLogger(PatientServiceTest.class);
	
	private static final Gson gson = new Gson();
	
	@Autowired
	private PatientService patientService;
	
	
	@Test
	public void patientServiceTest() {
		long currentTimeMillis = System.currentTimeMillis();
		String studyId = "000001test";
		
		List<String> itemList = new ArrayList<>();
		List<String> groupList = new ArrayList<>();
		itemList.add("体重");
		itemList.add("肺病");
		groupList.add("000001test");
		groupList.add("000002test");
		List<PatientInfo> patientBeanList = patientService.getPatientBeanList(studyId, itemList, groupList);
		logger.info("result:" + gson.toJson(patientBeanList.size()));
		long l = System.currentTimeMillis() - currentTimeMillis;
		logger.info("endtime：" + (l /1000));
	}
	
//	@Test
//	public void RServiceTest() {
//		long currentTimeMillis = System.currentTimeMillis();
//		String studyId = "000001test";
//		List<String> itemList = new ArrayList<>();
//		List<String> groupList = new ArrayList<>();
//		itemList.add("体重");
//		itemList.add("肺病");
//		groupList.add("000001test");
//		groupList.add("000002test");
//		List<String> independentSampleSampleTTest = RService.independentSampleSampleTTest(studyId, itemList, groupList);
////		logger.info(independentSampleSampleTTest);
//	}
}

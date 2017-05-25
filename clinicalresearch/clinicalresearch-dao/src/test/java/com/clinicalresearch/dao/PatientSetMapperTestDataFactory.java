package com.clinicalresearch.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.InclusionCriteria;
import com.clinicalresearch.dao.entity.PatientSet;
import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.manager.InclusionCriteriaMapper;
import com.clinicalresearch.dao.manager.PatientSetMapper;
import com.clinicalresearch.dao.manager.StudysMapper;
import com.clinicalresearch.dao.manager.SubjectGroupsMapper;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class PatientSetMapperTestDataFactory {

	private static final Logger logger = Logger.getLogger(PatientSetMapperTestDataFactory.class);
	
	private static Gson gson = new Gson();
	
	
	@Autowired
	private PatientSetMapper patientSetMapper;
	
	@Autowired
	private StudysMapper studyMapper;
	
	@Autowired
	private InclusionCriteriaMapper inclusionCriteriaMapper;
	
	@Autowired
	private SubjectGroupsMapper subjectGroupsMapper;
	
	@Test
	public void createContextForPatientSet() {
		
		List<String> studyKeys = getStudyKeys(0,1);
		logger.info(gson.toJson(studyKeys));
		for (String str:studyKeys) {
			
			Studys studyRecord = new Studys();
			studyRecord.setStudyid(str);
			studyRecord.setStudytname("测试课题" + str);
			studyRecord.setStudytype("test");
			studyRecord.setStudyobjective("test");
			studyRecord.setPrincipalinvestigator("test");
			studyRecord.setBriefsummary("test");
			studyRecord.setCollaborators("test");
			studyRecord.setAllocation("test");
			studyRecord.setMasking("test");
			studyRecord.setInterventionmodel("test");
			studyRecord.setControl("test");
			studyRecord.setStudystatus("0");
			studyRecord.setStudystartdate(new Date());
			studyRecord.setStudycompletiondate(new Date());
			studyRecord.setSponsor("嘉和美康");
			studyRecord.setStatisticalmodel("卡方检测");
			studyRecord.setUserid("000001");
			studyRecord.setTimestamp(new Date());
			
			studyMapper.insert(studyRecord);
			
			InclusionCriteria irecord = new InclusionCriteria();
			irecord.setCriteriaid(str);
			irecord.setCriteriaexpression("");
			irecord.setIstrue("true");
			irecord.setStudyid(str);
			inclusionCriteriaMapper.insert(irecord);
			
			
			SubjectGroups gRecord = new SubjectGroups();
			gRecord.setCriteriaid(str);
			gRecord.setGroupid(str);
			gRecord.setGroupcondition("test");
			gRecord.setGroupname("test");
			gRecord.setGroupnum("1000");
			gRecord.setPatientset("");
			gRecord.setRemark("test");
			gRecord.setStudyid(str);
			
			subjectGroupsMapper.insert(gRecord);
			
		}

		
		
	}

	@Test
	public void createPatientSetTest() {
		long currentTimeMillis = System.currentTimeMillis();
		List<String> studyKeys = getStudyKeys(1,10000);
		for (String str:studyKeys) {
			PatientSet record = new PatientSet();
			record.setGroupid("000001test");
			record.setStudyid("000001test");
			record.setVisitid(str);
			record.setPatientid(str);
			record.setItemname("肺病");
			record.setItemtype("boolean");
			int i = (int)(Math.random() * 2);
			
			switch (i) {
				case 0:record.setItemvalue("0");break;
				case 1:record.setItemvalue("1");break;
			}
			
			patientSetMapper.insert(record);
		}
		Long time = System.currentTimeMillis() - currentTimeMillis;
		logger.info("总用时：" + time);
	}
	@Test
	public void createPatientSetTest1() {
		long currentTimeMillis = System.currentTimeMillis();
		List<String> studyKeys = getStudyKeys(10001,20000);
		for (String str:studyKeys) {
			PatientSet record = new PatientSet();
			record.setGroupid("000002test");
			record.setStudyid("000001test");
			record.setVisitid(str);
			record.setPatientid(str);
			record.setItemname("肺病");
			record.setItemtype("boolean");
			int i = (int)(Math.random() * 2);
			
			switch (i) {
				case 0:record.setItemvalue("0");break;
				case 1:record.setItemvalue("1");break;
			}
			
			patientSetMapper.insert(record);
		}
		Long time = System.currentTimeMillis() - currentTimeMillis;
		logger.info("总用时：" + time);
	}
	@Test
	public void createPatientSetTestWithAnotherValue() {
		List<String> studyKeys = getStudyKeys(1,10000);
		for (String str:studyKeys) {
			PatientSet record = new PatientSet();
			record.setGroupid("000001test");
			record.setStudyid("000001test");
			record.setVisitid(str);
			record.setPatientid(str);
			record.setItemname("体重");
			record.setItemtype("double");
			
			Double i = Math.random() * 30 + 45;
			record.setItemvalue(String.format("%.2f", i));
//			logger.info("double:" + String.format("%.2f", i));
			patientSetMapper.insert(record);
		}
	}
	
	@Test
	public void createPatientSetTestWithAnotherValue1() {
		List<String> studyKeys = getStudyKeys(10001,20000);
		for (String str:studyKeys) {
			PatientSet record = new PatientSet();
			record.setGroupid("000002test");
			record.setStudyid("000001test");
			record.setVisitid(str);
			record.setPatientid(str);
			record.setItemname("体重");
			record.setItemtype("double");
			
			Double i = Math.random() * 30 + 45;
			record.setItemvalue(String.format("%.2f", i));
//			logger.info("double:" + String.format("%.2f", i));
			patientSetMapper.insert(record);
		}
	}
	
	private List<String> getStudyKeys(int start,int end) {
		List<String> studyKeys = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			
			StringBuffer sBuffer = new StringBuffer(new Integer(i).toString());
			
			if (sBuffer.length() < 6) {
				logger.info(gson.toJson("shotsBuffer:" + sBuffer));
				char[] carr = new char[6 - sBuffer.length()];
				for (int j = 0 ;j < carr.length; j++) {
					carr[j] = '0';
				}
				logger.info(gson.toJson("carr:" + new String(carr)));
				sBuffer = new StringBuffer(new String(carr)).append(sBuffer.toString());
				sBuffer.append("test");
				logger.info(gson.toJson("sBuffer:" + sBuffer));
			}
			studyKeys.add(sBuffer.toString());
		}
		return studyKeys;
	}
	
	@Test
	public void getTestData() {
		
//		List<String> studyKeys = getStudyKeys(100);
		
		Map<String,List<String>> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(new Integer(i).toString());
		}
		map.put("tizhong", list);
		logger.info(gson.toJson(map));
	}
	
}

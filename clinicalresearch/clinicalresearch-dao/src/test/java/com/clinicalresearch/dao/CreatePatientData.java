package com.clinicalresearch.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.PatientBasic;
import com.clinicalresearch.dao.entity.PatientSet;
import com.clinicalresearch.dao.manager.PatientBasicMapper;
import com.clinicalresearch.dao.manager.PatientSetMapper;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.google.gson.Gson;

/**
 * 
 * @author ztq_2016
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class CreatePatientData {
	
	private static Integer Id = 1; 
	
	@Autowired
	private PatientBasicMapper patientBasicMapper;
	
	@Autowired
	private PatientSetMapper patientSetMapper;
	
	@Test
	public void insertData() {
		File file = new File("C:\\Users\\ztq_2016\\Desktop\\data.csv");
		List<PatientBasic> pbList = new ArrayList<>();
		List<PatientSet> psList = new ArrayList<>();
		try {
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String readLine = null;
			System.out.println(readLine = bReader.readLine());
//			System.out.println(readLine = bReader.readLine());
			while ((readLine = bReader.readLine()) != null) {
				String id = getId();
				String[] split = readLine.split(",");
				PatientBasic record = new PatientBasic();
				record.setAge(split[0]);
				record.setPatientid(id);
				record.setStudyid("000021");
				if (split[1].equals("1")) {
					record.setGender("男");
				} else {
					record.setGender("女");
				}
				pbList.add(record);
				List<PatientSet> list = new ArrayList<>();
				PatientSet pRecord = new PatientSet();
				pRecord.setGroupid(split[11]);
				pRecord.setItemname("gaoxueya");
				pRecord.setItemvalue(split[2]);
				pRecord.setPatientid(id);
				pRecord.setStudyid("000021");
				
				PatientSet pRecord1 = new PatientSet();
				pRecord1.setGroupid(split[11]);
				pRecord1.setItemname("tangniaobing");
				pRecord1.setItemvalue(split[3]);
				pRecord1.setPatientid(id);
				pRecord1.setStudyid("000021");
				
				PatientSet pRecord2 = new PatientSet();
				pRecord2.setGroupid(split[11]);
				pRecord2.setItemname("gaodanguchun");
				pRecord2.setItemvalue(split[4]);
				pRecord2.setPatientid(id);
				pRecord2.setStudyid("000021");
				
				PatientSet pRecord3 = new PatientSet();
				pRecord3.setGroupid(split[11]);
				pRecord3.setItemname("smoke");
				pRecord3.setItemvalue(split[5]);
				pRecord3.setPatientid(id);
				pRecord3.setStudyid("000021");
				
				PatientSet pRecord4 = new PatientSet();
				pRecord4.setGroupid(split[11]);
				pRecord4.setItemname("gaohcy");
				pRecord4.setItemvalue(split[6]);
				pRecord4.setPatientid(id);
				pRecord4.setStudyid("000021");
				
				PatientSet pRecord5 = new PatientSet();
				pRecord5.setGroupid(split[11]);
				pRecord5.setItemname("hcy");
				pRecord5.setItemvalue(split[7]);
				pRecord5.setPatientid(id);
				pRecord5.setStudyid("000021");
				
				PatientSet pRecord6 = new PatientSet();
				pRecord6.setGroupid(split[11]);
				pRecord6.setItemname("hscrp");
				pRecord6.setItemvalue(split[8]);
				pRecord6.setPatientid(id);
				pRecord6.setStudyid("000021");
				
				PatientSet pRecord7 = new PatientSet();
				pRecord7.setGroupid(split[11]);
				pRecord7.setItemname("fib");
				pRecord7.setItemvalue(split[9]);
				pRecord7.setPatientid(id);
				pRecord7.setStudyid("000021");
				
				PatientSet pRecord8 = new PatientSet();
				pRecord8.setGroupid(split[11]);
				pRecord8.setItemname("ddt");
				pRecord8.setItemvalue(split[10]);
				pRecord8.setPatientid(id);
				pRecord8.setStudyid("000021");
				
				psList.add(pRecord);
				psList.add(pRecord1);
				psList.add(pRecord2);
				psList.add(pRecord3);
				psList.add(pRecord4);
				psList.add(pRecord5);
				psList.add(pRecord6);
				psList.add(pRecord7);
				psList.add(pRecord8);
				System.out.println(new Gson().toJson(split));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
//		PatientBasic record = new PatientBasic();
//		patientBasicMapper.insert(record);
		
//		PatientSet pRecord = new PatientSet();
//		patientSetMapper.insert(pRecord);
		for (PatientBasic pb:pbList) {
			patientBasicMapper.insert(pb);
		}
		for (PatientSet ps:psList) {
			ps.setVisitid("000001");
			patientSetMapper.insert(ps);
		}
	}
	
	private String getId() {
		Id++;
		return Id.toString();
	}
}

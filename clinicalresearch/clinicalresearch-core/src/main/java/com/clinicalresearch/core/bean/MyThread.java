package com.clinicalresearch.core.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.clinicalresearch.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.clinicalresearch.dao.entity.PatientBasic;
import com.clinicalresearch.dao.manager.PatientBasicMapper;
import com.google.gson.Gson;

public class MyThread extends Thread {
	
	
	private PatientBasicMapper patientBasicMapper;
	
	private final Gson gson = new Gson();
	
	private String studyId;
	
	private String exp;
	
	public PatientBasicMapper getPatientBasicMapper() {
		return patientBasicMapper;
	}

	public void setPatientBasicMapper(PatientBasicMapper patientBasicMapper) {
		this.patientBasicMapper = patientBasicMapper;
	}

	public String getStudyId() {
		return studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
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
		SavePatientsQueryBean fromJson = gson.fromJson(exp, SavePatientsQueryBean.class);
		fromJson.setResultField("fieldId");
		fromJson.setSize(10);
		int i = 1;
		List<FieldId> patientsIdList = new ArrayList<FieldId>();
		
		for (int m = 0; m <= i ; m ++) {
			fromJson.setPage(m);
			String json = gson.toJson(fromJson);
			String byPatients = HttpClientUtils.getByPatients(gson.toJson(fromJson));
			Map<String,Object> fromJson3 = gson.fromJson(byPatients, Map.class);
			Object object = fromJson3.get("hits");
			Double total = (Double) fromJson3.get("total");
			List<Object> hits = gson.fromJson(gson.toJson(object), List.class);
			for (Object o:hits) {
				String json2 = gson.toJson(o);
				List<FieldId> fromJson2 = gson.fromJson(json2, List.class);
				patientsIdList.addAll(fromJson2);
			}
			i = (int) (total / 10);
		}
		
		List<String> strings = new ArrayList<String>();
		String json2 = gson.toJson(patientsIdList);
		for (Object fieldId:patientsIdList) {
			String json = gson.toJson(fieldId);
			Map<String, String> map = gson.fromJson(json, Map.class);
			strings.add(map.get("fieldId"));
		}
		String json = gson.toJson(strings);
		String replace = json.replace("[", "").replace("]", "");
		PatientBasic record = new PatientBasic();
		record.setPatientid(UUID.randomUUID().toString().replace("-", ""));
		record.setPatientids(replace);
		record.setStudyid(studyId);
		patientBasicMapper.insert(record);
	}
}

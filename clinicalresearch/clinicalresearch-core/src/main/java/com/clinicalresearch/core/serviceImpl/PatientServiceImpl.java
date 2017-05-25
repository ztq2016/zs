package com.clinicalresearch.core.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinicalresearch.core.bean.PatientInfo;
import com.clinicalresearch.core.service.PatientService;
import com.clinicalresearch.dao.entity.PatientSet;
import com.clinicalresearch.dao.entity.PatientSetExample;
import com.clinicalresearch.dao.manager.PatientSetMapper;


@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientSetMapper patientSetMapper;
	
	@Override
	public List<PatientInfo> getPatientBeanList(String studyId, List<String> itemList, List<String> groupList) {
		List<PatientInfo> resultList = new ArrayList<PatientInfo>();
		if (itemList == null || groupList == null) {
			return null;
		}
		
		PatientSetExample example = new PatientSetExample();
		example.createCriteria().andStudyidEqualTo(studyId).andGroupidIn(groupList).andItemnameIn(itemList);
		List<PatientSet> selectByExample = patientSetMapper.selectByExample(example);
		Map<String,PatientInfo> resultMap = new HashMap<String,PatientInfo>();
		
		if (selectByExample != null) {
			for (PatientSet ps:selectByExample) {
				PatientInfo patientInfo = resultMap.get(ps.getPatientid());
				if (patientInfo == null) {
					patientInfo = new PatientInfo();
					resultMap.put(ps.getPatientid(), patientInfo);
					patientInfo.setGroupId(ps.getGroupid());
					patientInfo.setPatientId(ps.getPatientid());
					patientInfo.setStudyId(ps.getStudyid());
					patientInfo.setVisitidId(ps.getVisitid());
				} 
				patientInfo.setItemKeyAndValue(ps.getItemname(), ps.getItemvalue());
			}
		}
		
		Collection<PatientInfo> values = resultMap.values();
		PatientInfo[] array = values.toArray(new PatientInfo[values.size()]);
		resultList = Arrays.asList(array);
		return resultList;
	}

}

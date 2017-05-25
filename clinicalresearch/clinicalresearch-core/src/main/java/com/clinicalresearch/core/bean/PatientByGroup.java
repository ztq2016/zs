package com.clinicalresearch.core.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 放置查询返回数据
* @ClassName: PatientByGroup  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author A18ccms a18ccms_gmail_com  
* @date 2017年3月14日 下午5:47:54  
*
 */
public class PatientByGroup {
	
	private List<PatientFieldBean> fieldList;
	
	private String patientId;
	
	private String groupId;
	
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<PatientFieldBean> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<PatientFieldBean> fieldList) {
		this.fieldList = fieldList;
	}
	
	public void setField(PatientFieldBean patientFieldBean) {
		if (fieldList == null) {
			fieldList = new ArrayList<>();
		}
		fieldList.add(patientFieldBean);
	}
	
}

package com.clinicalresearch.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.ConfusionControl;
import com.clinicalresearch.dao.manager.ConfusionControlMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class ConfusionControlMapperTest {

	@Autowired
	private ConfusionControlMapper confusionControlMapper;
	
	@Test
	public void confusionControlMapperTest() {
		ConfusionControl record = new ConfusionControl();
		record.setControlid("000001");
		record.setIndicatorid("nimei");
		record.setItemname("ceshi");
		record.setItemvalue("gansha");
		record.setStudyid("buxing");
		confusionControlMapper.insertSelective(record);
	}
	
}

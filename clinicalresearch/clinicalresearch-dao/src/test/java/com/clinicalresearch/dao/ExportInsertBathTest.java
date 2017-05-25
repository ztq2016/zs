package com.clinicalresearch.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.ExportPlanVariables;
import com.clinicalresearch.dao.manager.ExportPlanVariablesExtendsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class ExportInsertBathTest {
	
	@Autowired
	private ExportPlanVariablesExtendsMapper exportPlanVariablesExtendsMapper;
	
	@Test
	public void test(){
		List<ExportPlanVariables> list = new ArrayList<>();
		ExportPlanVariables exportPlanVariables = new ExportPlanVariables();
		exportPlanVariables.setExpId(100);
		exportPlanVariables.setVariableId("000001");
		exportPlanVariables.setVariableName("test");
		exportPlanVariables.setVariableOtherName("anothername");
		list.add(exportPlanVariables);
		exportPlanVariablesExtendsMapper.insertBatch(list);
	}
}

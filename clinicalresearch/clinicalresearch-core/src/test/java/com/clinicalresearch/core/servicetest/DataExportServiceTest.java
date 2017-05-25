package com.clinicalresearch.core.servicetest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.core.bean.ExportPlanBean;
import com.clinicalresearch.core.service.DataExportService;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class DataExportServiceTest {
	
	@Autowired
	private DataExportService dataExportService;
	
	@Autowired
	private static final Gson gson = new Gson();
	
	@Test
	public void testGetAllVariables() {
		String userId = "000001";
		ExportPlanBean exportPlanByUserId = dataExportService.getExportPlanByUserId(userId,null);
		System.out.println(gson.toJson(exportPlanByUserId));
	}
	
	@Test
	public void testSearchVariable() {
		String keyWord = "zz";
		Integer expid = 1;
		ExportPlanBean queryByKeyWord = dataExportService.queryByKeyWord(keyWord, expid);
		System.out.println(gson.toJson(queryByKeyWord));
	}
}

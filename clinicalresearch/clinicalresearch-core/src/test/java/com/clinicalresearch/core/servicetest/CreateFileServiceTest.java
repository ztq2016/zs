package com.clinicalresearch.core.servicetest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.core.service.CreateFileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class CreateFileServiceTest {
	
	@Autowired
	private CreateFileService createFileService;
	
	@Test
	public void createFileTest() {
		String userId = "00000001";
		String fileContent="ceshi";
		createFileService.createFile(userId, fileContent);
	}
	
	@Test
	public void deleteDownLoadFileTest() {
		Integer fileId = 78;
		createFileService.deleteDownLoadFile(fileId);
	}
}

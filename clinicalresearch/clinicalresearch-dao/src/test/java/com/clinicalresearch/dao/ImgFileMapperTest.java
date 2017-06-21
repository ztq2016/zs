package com.clinicalresearch.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.ImgFile;
import com.clinicalresearch.dao.manager.ImgFileMapper;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class ImgFileMapperTest {
	
	private static final Gson gson = new Gson();
	
	@Autowired
	private ImgFileMapper imgFileMapper;
	
	@Test
	public void imgFileMapperTest() {
		List<ImgFile> selectByExample = imgFileMapper.selectByExample(null);
		System.out.println(gson.toJson(selectByExample));
	}
	
}

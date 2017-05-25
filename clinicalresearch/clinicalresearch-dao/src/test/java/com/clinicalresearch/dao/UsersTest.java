package com.clinicalresearch.dao;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.Users;
import com.clinicalresearch.dao.manager.UsersMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class UsersTest {
	
	@Autowired
	private UsersMapper usersMapper;
	
	@Test
	public void usersTest() {
		Users record = new Users();
		record.setPosition("");
		record.setPwd("nimei");
		record.setRealname("wky");
		record.setStatus("男");
		record.setTimestamp(new Date());
		record.setUserid("000003");
		record.setUsername("wky");
		usersMapper.insert(record);
	}
	
}

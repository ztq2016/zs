package org.clinicalresearch.utils;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class MD5Test {

	public static final Logger logger = Logger.getLogger(MD5Test.class);
	
	@Test
	public void testMd5() {
		String s = "nihao";
		String encode = MD5.encode(s);
		logger.info(encode);
	}
	
	
}

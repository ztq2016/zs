package org.clinicalresearch.utils;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class PropertiesUtilTest {
	
	public static final Logger logger = Logger.getLogger(PropertiesUtilTest.class);
	
	@Test
	public void getValueTest() {
		PropertiesUtil.setPropertiesName("R.properties");
		String value = PropertiesUtil.getValue("url");
		String value2 = PropertiesUtil.getValue("port");
		logger.info(value);
		logger.info(value2);
	}
	
}

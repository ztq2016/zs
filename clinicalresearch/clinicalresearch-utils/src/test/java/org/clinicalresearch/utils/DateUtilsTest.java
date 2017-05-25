package org.clinicalresearch.utils;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class DateUtilsTest {
	@Test
	public void test() {
		String formatDate = DateUtils.formatDate(new Date(), "YYYY-MM-dd HH:mm:ss");
		System.out.println(formatDate);
	}
}

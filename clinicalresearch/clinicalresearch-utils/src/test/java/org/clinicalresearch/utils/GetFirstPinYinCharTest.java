package org.clinicalresearch.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class GetFirstPinYinCharTest {
	
	@Test
	public void testGetPinYinChar() {
		String chineseStr = "你妹。";
		String pinYInChar = GetFirstPinYinChar.getPinYInChar(chineseStr , false);
		System.out.println(pinYInChar);
	}
}

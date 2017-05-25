package com.clinicalresearch.core.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class VariableTypeTest {
	
	@Test
	public void test() {
		System.out.println(VariableType.five.value());
		VariableType five = VariableType.five;
		switch (five) {
		case zero:
			
			break;
			
		default:
			break;
		}
	}
}

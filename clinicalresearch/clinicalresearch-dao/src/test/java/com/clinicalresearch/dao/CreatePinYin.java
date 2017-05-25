package com.clinicalresearch.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.HierarchicalVariable;
import com.clinicalresearch.dao.manager.HierarchicalVariableMapper;
import com.google.gson.Gson;

import net.sourceforge.pinyin4j.PinyinHelper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class CreatePinYin {
	
	@Autowired
	private HierarchicalVariableMapper hierarchicalVariableMapper;
	
	private static final Gson gson = new Gson();
	
	@Test
	public void test() {
		List<HierarchicalVariable> selectByExample = hierarchicalVariableMapper.selectByExample(null);
		String json = gson.toJson(selectByExample);
		List<String> list = new ArrayList<>();
		StringBuffer sBuffer = new StringBuffer();
		for (HierarchicalVariable hVariable:selectByExample) {
			String variablename = hVariable.getVariablename();
			String vpycode = hVariable.getVpycode();
			String py = getPinYin(variablename);
			if (!vpycode.equals(py)) {
				list.add(hVariable.getVariableid());	
				sBuffer.append(hVariable.getVariableid());
				sBuffer.append(",");
			}
		}
		System.out.println(sBuffer.toString());
	}

	private String getPinYin(String variablename) {
		StringBuffer sBuffer = new StringBuffer();
		for (char ch:variablename.toCharArray()) {
			String[] hanyuPinyinStringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
			if (hanyuPinyinStringArray != null){
				String string = hanyuPinyinStringArray[0];
				char charAt = string.charAt(0);
				sBuffer.append(charAt);
			}
		}
		return sBuffer.toString().toUpperCase();
	}
	
}

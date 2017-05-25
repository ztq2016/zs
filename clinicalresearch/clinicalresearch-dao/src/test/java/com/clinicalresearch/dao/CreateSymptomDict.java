package com.clinicalresearch.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.IndicatorFieldsExample;
import com.clinicalresearch.dao.manager.IndicatorFieldsMapper;
import com.google.gson.Gson;

import net.sourceforge.pinyin4j.PinyinHelper;

/**
 * 将病症字典放入INDICATORFIELDS表中
 * @author admin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class CreateSymptomDict {
	
	@Autowired
	private IndicatorFieldsMapper indicatorFieldsMapper;
	
	private static final Gson gson = new Gson();
	
	@Test
	public void createSymptomDict() {
		IndicatorFieldsExample example = new IndicatorFieldsExample();
		example.setOrderByClause(" fieldtableid desc limit 100");
		List<IndicatorFields> selectByExample = indicatorFieldsMapper.selectByExample(example);
		System.out.println(gson.toJson(selectByExample));
		File file = new File("C:\\Users\\tianqi\\Desktop\\字典\\symptom.txt");
		List<String> list = new ArrayList<>();
		try {
			Reader r = new FileReader(file);
			BufferedReader br = new BufferedReader(r);
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				list.add(readLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<IndicatorFields> subList = new ArrayList(); 
		int i = 140484;
		int n = 1;
		for (String str:list) {
			Integer temp = i + n;
			IndicatorFields inf = new IndicatorFields();
			inf.setFieldtableid(temp.toString());
			inf.setFieldname(str);
			inf.setFielddesc("symptom");
			inf.setFieldversion("0");
			String fpycode = getPyCode(str);
			inf.setFpycode(fpycode);
			inf.setFieldorder(new Integer(n).toString());
			subList.add(inf);
			n++;
		}
		
		System.out.println(gson.toJson(subList));
		
		for (IndicatorFields inf:subList) {
			IndicatorFields record = inf;
			indicatorFieldsMapper.insert(record);
		}
		
	}

	private String getPyCode(String str) {
		if (str != null && !str.isEmpty()) {
			char[] charArray = str.toCharArray();
			StringBuffer sb = new StringBuffer();
			int i = 0;
			for (char c:charArray) {
				System.out.println("$$$" + c + "$$$");
				String[] hanyuPinyinStringArray = PinyinHelper.toHanyuPinyinStringArray(c);
				if (hanyuPinyinStringArray != null && hanyuPinyinStringArray.length != 0) {
					sb.append(hanyuPinyinStringArray[0].substring(0, 1).toUpperCase());
				}
			}
			return sb.toString();
		}
		return null;
	}
}

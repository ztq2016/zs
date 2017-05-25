package com.clinicalresearch.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.manager.IndicatorFieldsMapper;
import com.google.gson.Gson;

import net.sourceforge.pinyin4j.PinyinHelper;

/**
 * 创建检验字典
 * 替换完全版检验字典，此字典从病历中提取
 * @author ztq_2016
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class CreateTestDict {
	
	@Autowired
	private IndicatorFieldsMapper indicatorFieldsMapper; 
	
	private static final Logger logger = Logger.getLogger(CreateTestDict.class);
	
	private static final Gson gson = new Gson();
	
	private static Integer fieldTableId = 140895;
	
	@Test
	public void testDict() {
		String pathname = "C:\\Users\\ztq_2016\\Desktop\\inspection_relationship.csv";
		File file = new File(pathname);
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fileReader);
			String readLine = null;
			Map<String, List<String>> relationShip = new LinkedHashMap<>();
			while ((readLine = bReader.readLine()) != null) {
				
				String[] split = readLine.split(",");
				List<String> list = relationShip.get(split[1]);
				if (list == null) {
					list = new ArrayList<>();
					list.add(split[0]);
					relationShip.put(split[1], list);
				} else {
					list.add(split[0]);
				}
			}
//			logger.info(gson.toJson(relationShip));
			List<IndicatorFields> resultList = new ArrayList<>();
			Integer count = 1;
			for (String str:relationShip.keySet()) {
				
				IndicatorFields indicatorFields = new IndicatorFields();
				indicatorFields.setFieldname(str);
				indicatorFields.setFielddesc("病历提取检验项");
				String id = getFieldTableId();
				indicatorFields.setFieldtableid(id);
				indicatorFields.setFieldorder(count.toString());
				resultList.add(indicatorFields);
				
				List<String> list = relationShip.get(str);
				Integer num = 1;
				for (String strr:list) {
					IndicatorFields subif = new IndicatorFields();
					subif.setFieldname(strr);
					subif.setFielddesc("病历提取检验结果项");
					subif.setFieldtableid(getFieldTableId());
					subif.setFatherid(id);
					subif.setFieldorder(num.toString());
					resultList.add(subif);
					num ++;
				}
				count ++;
			}
			for (IndicatorFields inff:resultList) {
				String fieldname = inff.getFieldname();
				String pinYin = getPinYin(fieldname);
				if (pinYin != null) {
					inff.setFpycode(pinYin);
				}
			}
			
			
			logger.info("resultList:" + gson.toJson(resultList));
			for (IndicatorFields inff:resultList) {
				indicatorFieldsMapper.insertSelective(inff);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getPinYin(String fieldname) {
		if (fieldname == null) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for (char c:fieldname.toCharArray()) {
			String[] py = PinyinHelper.toHanyuPinyinStringArray(c);
			
			if (py != null) {
				String string = py[0];
				String upperCase = string.toUpperCase();
				sb.append(upperCase.charAt(0));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	private String getFieldTableId() {
		fieldTableId ++;
		return fieldTableId.toString();
	}
}

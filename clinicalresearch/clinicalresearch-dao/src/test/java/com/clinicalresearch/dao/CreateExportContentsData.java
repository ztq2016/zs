package com.clinicalresearch.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clinicalresearch.dao.entity.ExportContents;
import com.clinicalresearch.dao.entity.ExportContentsExample;
import com.clinicalresearch.dao.manager.ExportContentsMapper;
import com.google.gson.Gson;

import net.sourceforge.pinyin4j.PinyinHelper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/root-context.xml")
public class CreateExportContentsData {
	
	@Autowired
	private ExportContentsMapper exportContentsMapper;
	
	private static final Gson gson = new Gson();
	
	@Test
	public void insertData() {
		
		List<ExportContents> selectByExample = exportContentsMapper.selectByExample(null);
		Map<String, ExportContents> level1 = new LinkedHashMap<>();
		for (ExportContents ec:selectByExample) {
			level1.put(ec.getEcName(), ec);
		}
		
		List<String[]> list = readFile();
		list.remove(0);
		
		Map<String, ExportContents> map = new LinkedHashMap<>();
		
		Integer id = 9;
		Integer order = 1;
		
		for (String[] s:list) {
			
			String string = s[1];
			ExportContents exportContents2 = level1.get(s[0]);
			ExportContents ecContents = new ExportContents();
			ecContents.setEcId(id);
			ecContents.setEcLevel("2");
			ecContents.setEcName(string);
			ecContents.setEcOrder(order);
			ecContents.setEcFatherId(exportContents2.getEcId());
			String ecPycode = getPinYin(string);
			ecContents.setEcPycode(ecPycode.toUpperCase());
			string =exportContents2.getEcName() + "_" + string  ;
			ExportContents exportContents = map.get(string);
			if (map.get(string) == null) {
				map.put(string, ecContents);
				id ++;
				order ++;
			}
			
		}
		
		System.out.println(gson.toJson(map));
		for (ExportContents record:map.values()) {
			exportContentsMapper.insert(record);
		}
	}

	private List<String[]> readFile() {
		String pathname = "C:\\Users\\ztq_2016\\Desktop\\导出变量20170217.csv";
		File file = new File(pathname);
		FileReader fReader;
		List<String[]> list = new ArrayList<>();
		try {
			fReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fReader);
			String readLine = null;
			while ((readLine = bufferedReader.readLine()) != null) {
				String[] split = readLine.split(",");
				list.add(split);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	private String getPinYin(String key) {
		StringBuffer sBuffer = new StringBuffer();
		for (char ch:key.toCharArray()) {
			String[] hanyuPinyinStringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
			if (hanyuPinyinStringArray != null) {
				sBuffer.append(hanyuPinyinStringArray[0].charAt(0));
			}
		}
		return sBuffer.toString();
	}
	
	@Test
	public void createThreeLevel() {
		List<String[]> readFile = readFile();
		readFile.remove(0);
		Integer id = 26;
		Integer order = 1;
		List<ExportContents> eContentsList = new ArrayList<>();
		for (String[] s:readFile) {
			ExportContentsExample example = new ExportContentsExample();
			example.createCriteria().andEcNameEqualTo(s[0]);
			List<ExportContents> selectByExample = exportContentsMapper.selectByExample(example);
			Integer ecId = selectByExample.get(0).getEcId();
			ExportContentsExample example1 = new ExportContentsExample();
			example1.createCriteria().andEcFatherIdEqualTo(ecId).andEcNameEqualTo(s[1]);
			List<ExportContents> selectByExample2 = exportContentsMapper.selectByExample(example1);
//			System.out.println(gson.toJson(selectByExample2));
			ExportContents eContents = new ExportContents();
			eContents.setEcId(id);
			id++;
			String string = s[2];
			if (s.length == 4){
				String string2 = s[3];
				eContents.setEcEsCode(string2);
			}
			eContents.setEcFatherId(selectByExample2.get(0).getEcId());
			eContents.setEcLevel("3");
			eContents.setEcName(string);
			eContents.setEcOrder(order);
			String ecPycode = getPinYin(string);
			eContents.setEcPycode(ecPycode.toUpperCase());
//			System.out.println(gson.toJson(eContents));
			eContentsList.add(eContents);
		}
		
//		System.out.println(gson.toJson(eContentsList));
		Map<Integer, List<ExportContents>> ecMap = new LinkedHashMap<>();
		for (ExportContents ec:eContentsList) {
			List<ExportContents> list = ecMap.get(ec.getEcFatherId());
			if (list == null) {
				list = new ArrayList<>();
				list.add(ec);
				ec.setEcOrder(1);
				ecMap.put(ec.getEcFatherId(), list);
			} else {
				int size = list.size();
				ec.setEcOrder(size + 1);
				list.add(ec);
			}
		}
		List<ExportContents> result = new ArrayList<>();
		for ( List<ExportContents> level2:ecMap.values()){
			result.addAll(level2);
		}
		System.out.println(gson.toJson(result));
		for (ExportContents ec:result) {
			exportContentsMapper.insert(ec);
		}
	}
	
}

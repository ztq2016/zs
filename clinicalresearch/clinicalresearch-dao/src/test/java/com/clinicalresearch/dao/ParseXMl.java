package com.clinicalresearch.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.HierarchicalConfiguration.Node;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.configuration.tree.ConfigurationNode;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clinicalresearch.dao.entity.HierarchicalVariable;
import com.clinicalresearch.dao.entity.HierarchicalVariableExample;
import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.IndicatorFieldsExample;
import com.clinicalresearch.dao.entity.StatisticalModel;
import com.clinicalresearch.dao.entity.VariableFieldsUnits;
import com.clinicalresearch.dao.entity.VariableFieldsUnitsExample;
import com.clinicalresearch.dao.manager.HierarchicalVariableMapper;
import com.clinicalresearch.dao.manager.IndicatorFieldsExtendsMapper;
import com.clinicalresearch.dao.manager.IndicatorFieldsMapper;
import com.clinicalresearch.dao.manager.VariableFieldsUnitsExtendsMapper;
import com.clinicalresearch.dao.manager.VariableFieldsUnitsMapper;
import com.google.gson.Gson;


public class ParseXMl {
	
	private static final Logger logger = Logger.getLogger(ParseXMl.class);
	
	private static final Gson gson = new Gson();
	
	@Autowired
	private static IndicatorFieldsExtendsMapper indicatorFieldsExtendsMapper;
	
	@Autowired
	private static IndicatorFieldsMapper indicatorFieldsMapper;
	
	@Autowired
	private static HierarchicalVariableMapper hierarchicalVariableMapper;
	
	@Autowired
	private static VariableFieldsUnitsMapper variableFieldsUnitsMapper;
	
	@Autowired
	private static VariableFieldsUnitsExtendsMapper variableFieldsUnitsExtendsMapper;
	
	
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("root-context.xml");
//		indicatorFieldsExtendsMapper = (IndicatorFieldsExtendsMapper) aContext.getBean("indicatorFieldsExtendsMapper");
		hierarchicalVariableMapper = (HierarchicalVariableMapper) aContext.getBean("hierarchicalVariableMapper");
		indicatorFieldsMapper = (IndicatorFieldsMapper) aContext.getBean("indicatorFieldsMapper");
		variableFieldsUnitsExtendsMapper = (VariableFieldsUnitsExtendsMapper) aContext.getBean("variableFieldsUnitsExtendsMapper");
//		deleteConfusion();
//		fromXMLToBean();
		createRelationShip();
	}
	
	/**
	 * 根据dict.xml中的描述的关系，进行变量与字典对应。
	 */
	private static void createRelationShip() {
		try {
			XMLConfiguration xmlConfiguration = new XMLConfiguration("dict.xml");
			boolean empty = xmlConfiguration.isEmpty();
			Node root = xmlConfiguration.getRoot();
			List<ConfigurationNode> children = root.getChildren().get(0).getChildren();
			
			List<Map<String, String>> dictList = new ArrayList<>();
			int i = 0;
			Map<String, String> e = null;
			for (ConfigurationNode configurationNode:children) {
				if (i % 3 == 0) {
					e = new HashMap<>();
					dictList.add(e);
				}
				if (configurationNode.getName().contains("name")) {
					String value = (String)configurationNode.getValue();
					e.put(configurationNode.getValue().toString(), "");
				} 
				if (configurationNode.getName().contains("value")) {
					Set<String> keySet = e.keySet();
					boolean is = keySet.size() == 1;
					if (is) {
						String next = keySet.iterator().next();
						e.put(next, configurationNode.getValue().toString());
					}
				}
				i++;
			}
			System.out.println(dictList.size());
			
			
			List<VariableFieldsUnits> resultList = new ArrayList<>();
			for (Map<String, String> map:dictList) {
				Set<String> keySet = map.keySet();
				
				for (String str:keySet) {
					System.out.println("str:" + str);
					
					HierarchicalVariableExample example = new HierarchicalVariableExample();
					example.createCriteria().andVariablenameEqualTo(str).andVariabletypeIsNotNull();
					List<HierarchicalVariable> selectByExample = hierarchicalVariableMapper.selectByExample(example);
					
					if (selectByExample == null || selectByExample.isEmpty()) {
						continue;
					}
//					
					for (HierarchicalVariable hv:selectByExample) {
						String variableid = hv.getVariableid();
						String string = map.get(str);
						IndicatorFieldsExample iExample = new IndicatorFieldsExample();
						System.out.println("desc:" + string);
						iExample.createCriteria().andFielddescEqualTo(string);
						int countByExample = indicatorFieldsMapper.countByExample(iExample);
						List<IndicatorFields> selectByExample2 = null;
						
						if (countByExample > 10000) {
							selectByExample2 = getFields(iExample);
						} else {
							selectByExample2 = indicatorFieldsMapper.selectByExample(iExample);
						}
						
						if (selectByExample2 == null || selectByExample2.isEmpty()) {
							continue;
						}
						
						for (IndicatorFields inf:selectByExample2) {
							VariableFieldsUnits variableFieldsUnits = new VariableFieldsUnits();
							variableFieldsUnits.setVariableid(hv.getVariableid());
							variableFieldsUnits.setRelationid(inf.getFieldtableid());
							variableFieldsUnits.setRelationtype("0");
							resultList.add(variableFieldsUnits);
						}
					}
				}
				
			}
			/*去重*/
			/*在VariableFieldsUnits中重写了hashcode和equals*/
			Set<VariableFieldsUnits> set = new HashSet<>();
			for (VariableFieldsUnits vFieldsUnits:resultList) {
				set.add(vFieldsUnits);
			}
			/*增加id*/
			resultList = new ArrayList<>(set);
			int count = 0;
			List<VariableFieldsUnits> subList = new ArrayList<>();
			for (VariableFieldsUnits v:resultList) {
				if ((count != 0 && (count % 1000 == 0)) || (count == resultList.size() - 1)) {
					variableFieldsUnitsExtendsMapper.insertBatch(subList);
					subList.removeAll(subList);
				}
				subList.add(v);
				count++;
			}
			
//			logger.info("names:" + gson.toJson(dictList));
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 字典个数过多的分段拉取
	 * @param iExample
	 * @return
	 */
	private static List<IndicatorFields> getFields(IndicatorFieldsExample iExample) {
		List<IndicatorFields> resultList = new ArrayList<>();
		int countByExample = indicatorFieldsMapper.countByExample(iExample);
		for (int i = 0; i < 1000; i ++) {
			iExample.setOrderByClause("fieldtableid  limit " + i * 1000 + "," + 999 + ";");
			List<IndicatorFields> selectByExample = indicatorFieldsMapper.selectByExample(iExample);
			if (selectByExample == null || selectByExample.isEmpty()) {
				break;
			}
			resultList.addAll(selectByExample);
		}
		return resultList;
	}

	/**
	 * 从xml转换成bean
	 */
	public static void fromXMLToBean() {
		Gson gson = new Gson();
		File file = new File("C:\\Users\\ztq_2016\\Desktop\\科研平台\\北医三院字典\\changedict");
		File[] listFiles = file.listFiles();
//		int i = 0;
		List<IndicatorFields> resultList = new ArrayList<>();
		for (File f:listFiles) {
			String absolutePath = f.getAbsolutePath();
			String fileName = absolutePath + "\\" + f.getName();
			System.out.println(fileName);
			
			try {
				XMLConfiguration xmlConfiguration = new XMLConfiguration(f);
				Node root = xmlConfiguration.getRoot();
				System.out.println(root.getName());
				List<ConfigurationNode> children = root.getChildren();
				for (ConfigurationNode subNode:children) {
					/*封装成bean*/
					IndicatorFields record = new IndicatorFields();
					List<ConfigurationNode> beanList = subNode.getChildren();
					for (ConfigurationNode beanNode:beanList) {
						if (beanNode.getName().equals("itemVersion")) {
							record.setFieldversion(beanNode.getValue().toString());
						} 
						if (beanNode.getName().equals("pyCode")) {
							record.setFpycode(beanNode.getValue().toString());
						}
						if (beanNode.getName().equals("DICT_ITEM_CODE")) {
							record.setFieldorder(beanNode.getValue().toString());
						}
						if (beanNode.getName().equals("DICT_NAME")) {
							record.setFielddesc(f.getName().replace(".xml", ""));
						}
						if (beanNode.getName().equals("DICT_ITEM_VALUE")) {
							record.setFieldname(beanNode.getValue().toString());
						}
						
					}
					resultList.add(record);
				}
				
//				logger.debug("resultList：" + gson.toJson(resultList));
				
			} catch (ConfigurationException e) {
				e.printStackTrace();
			}
//			i ++;
//			if (i == 1) {
//				break;
//			}
				
		}
		
		/*输入id*/
		int id = 50;
		for (IndicatorFields idFields:resultList) {
			id++;
			String fieldtableid = getFieldTableId(id);
			idFields.setFieldtableid(fieldtableid);
		}
		int m = 0;
		System.out.println(resultList.size());
		List<IndicatorFields> subList = new ArrayList<>();
		/*数据插入表中*/
		for (IndicatorFields idFields:resultList) {
			subList.add(idFields);
			if ((m != 0 && (m % 1000 == 0)) || (m == resultList.size() - 1)) {
				System.out.println("zheli");
				indicatorFieldsExtendsMapper.insertBatch(subList);
				subList.removeAll(subList);
			}
			m ++;
		}
	}

	private static String getFieldTableId(int id) {
		Integer integer = id;
		int length = integer.toString().length();
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 6 - length;i > 0; i--) {
			sBuffer.append("0");
		}
		sBuffer.append(integer.toString());
		return sBuffer.toString();
	}

	private static void inserIntoDB() {
		
		
	}

	public static void deleteConfusion() {
		File file = new File("C:\\Users\\ztq_2016\\Desktop\\科研平台\\北医三院字典\\load_result\\load_result");
		File tartfile = new File("C:\\Users\\ztq_2016\\Desktop\\科研平台\\北医三院字典\\changedict");
		File[] listFiles = file.listFiles();
		for (File f:listFiles) {
			String name = f.getName();
			System.out.println(name);
			FileReader fReader = null;
			BufferedReader bReader = null;
			FileWriter fileWriter = null;
			BufferedWriter bufferedWriter = null;
			try {
				/*读取文件内容*/
				fReader = new FileReader(f);
				bReader = new BufferedReader(fReader);
				StringBuffer sBuffer = new StringBuffer();
				String readLine = null;
				while ((readLine = bReader.readLine()) != null) {
					sBuffer.append(readLine);
				}
				
				/*正则处理*/
				StringBuffer resultBuffer = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
				resultBuffer.append(getResultString(sBuffer));
				
				
				/*写出到文件*/
				String absolutePath = tartfile.getAbsolutePath();
				String resultName = absolutePath + "\\" + f.getName();
				fileWriter = new FileWriter(resultName);
				bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(resultBuffer.toString());
				
			
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				/*关闭流*/
				try {
					fReader.close();
					bReader.close();
					bufferedWriter.flush();
					fileWriter.close();
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/*截取结果集*/
	private static StringBuffer getResultString(StringBuffer sBuffer) {
		String compile = "<ArrayList xmlns=\"\">.*</ArrayList>";
		
		Pattern pattern = Pattern.compile(compile); 
		Matcher matcher = pattern.matcher(sBuffer);
		boolean find = matcher.find();
		String replaceAll = null;
		if (find) {
			int start = matcher.start();
			int end = matcher.end();
			CharSequence subSequence = sBuffer.subSequence(start, end);
			replaceAll = subSequence.toString();
		}
		pattern = Pattern.compile("<[ ]{0,}>");
		matcher = pattern.matcher(replaceAll);
		replaceAll = matcher.replaceAll("<updateCount>");
		
		pattern = Pattern.compile("</[ ]{0,}>");
		matcher = pattern.matcher(replaceAll);
		replaceAll = matcher.replaceAll("</updateCount>");
		
		return new StringBuffer(replaceAll);
	}
	

}

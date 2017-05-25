package org.clinicalresearch.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class OSName {
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		int indexOf = System.getProperty("os.name").toLowerCase().indexOf("windows");
		System.out.println(indexOf);
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperties());
		File file = new File("C:\\Users\\ztq_2016\\Desktop\\新建文本文档 (12).txt");
		Properties properties = System.getProperties();
		StringBuffer stringBuffer = new StringBuffer();
		for (Object object:properties.keySet()) {
			String string = (String) object;
			String property = properties.getProperty(string);
			stringBuffer.append(string);
			stringBuffer.append("=");
			stringBuffer.append(property);
			stringBuffer.append(System.lineSeparator());
		}
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(stringBuffer.toString());
			bufferedWriter.flush();
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

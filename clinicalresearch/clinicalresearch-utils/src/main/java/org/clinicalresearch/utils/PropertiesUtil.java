package org.clinicalresearch.utils;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesUtil {
	
	private static Properties properties = null; 
	
	public static void setPropertiesName(String propertiesName) {
		try {
			 properties = PropertiesLoaderUtils.loadAllProperties(propertiesName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key) {
		if (properties != null) {
			String value = properties.getProperty(key);
			return value;
		} else {
			throw new RuntimeException("err : properties not find.");
		}
	}
}

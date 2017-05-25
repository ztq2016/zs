package org.clinicalresearch.utils;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import net.sourceforge.pinyin4j.PinyinHelper;

public class GetFirstPinYinChar {
	/**
	 * 根据传入的拼音返回
	 * @param chineseStr 汉字字符串
	 * @param isUpperCase 是否大写 默认false
	 * @return
	 */
	public static String getPinYInChar(String chineseStr,Boolean isUpperCase) {
		if (chineseStr == null) {
			return null;
		} else {
			StringBuffer sBuffer = new StringBuffer();
			for (char ch : chineseStr.toCharArray()) {
				String[] hanyuPinyinStringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
				if (hanyuPinyinStringArray != null) {
					String string = hanyuPinyinStringArray[0];
					sBuffer.append(string.charAt(0));
				}
			}
			if (isUpperCase != null && isUpperCase) {
				return sBuffer.toString().toUpperCase();
			} else {
				return sBuffer.toString().toLowerCase();
			}
		}
	}
}

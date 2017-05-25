package com.clinicalresearch.dao;

import com.google.gson.Gson;

import net.sourceforge.pinyin4j.PinyinHelper;

public class Pinyin4jTest {
	public static void main(String[] args) {
		String[] hanyuPinyinStringArray = PinyinHelper.toHanyuPinyinStringArray('长');
		System.out.println(new Gson().toJson(hanyuPinyinStringArray));
	}
}

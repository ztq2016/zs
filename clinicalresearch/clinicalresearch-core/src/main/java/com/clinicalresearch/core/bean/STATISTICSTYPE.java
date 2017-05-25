package com.clinicalresearch.core.bean;
/**
 * 统计模型的类型
 * @author ztq_2016
 *
 */
public enum STATISTICSTYPE {
	sttest(3);
	
	/**
	 * 每几个参数取一次
	 */
	private int group;
	
	private STATISTICSTYPE(int group) {
		this.group = group;
	}
	
}

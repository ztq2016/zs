package com.clinicalresearch.core.bean;

public enum STUDYSTYPE {
	/**非随机对照试验*/
	NRCT("非随机对照试验","nrct"),
	/**回顾性队列研究*/
	RCS("回顾性队列研究","rcs"),
	/**病例对照研究*/
	CCS("病例对照研究","ccs"),
	/**横断面调查*/
	CSS("横断面调查","css");
	
	private String value;
	private String code;
	
	private STUDYSTYPE(String name, String code) {
		this.value = name;
		this.code = code;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String getCode() {
		return this.code;
	}
	
	
	
	public static STUDYSTYPE getValue(String value) {
		STUDYSTYPE[] values = STUDYSTYPE.values();
		for (STUDYSTYPE studsytype:values) {
			if (studsytype.value.equals(value)) {
				return studsytype;
			}
		}
		return null;
	}
}

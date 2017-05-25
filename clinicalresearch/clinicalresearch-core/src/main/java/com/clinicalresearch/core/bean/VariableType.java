package com.clinicalresearch.core.bean;

public enum VariableType {
	/**数值型*/
	zero("数值型", 0),
	/**文本型*/
	two("文本型", 1),
	/**时间型*/
	three("时间型", 2),
	/**布尔型*/
	four("布尔型",3),
	/**
	 * 少量枚举，个数少于10个
	 */
	five("少量枚举",4),
	/**海量枚举*/
	six("海量枚举",5);
	/**
	 * 类型描述
	 */
	private String typeDescribe;
	
	private Integer value;
	
	private VariableType (String typeDescribe, Integer typeValue) {
		this.typeDescribe = typeDescribe;
		this.value = typeValue;
	}
	
	public Integer value(){
		return this.value;
	}
	
	public VariableType getType(String value) {
		VariableType[] values = VariableType.values();
		for (VariableType vt:values) {
			boolean equals = vt.value.toString().equals(value);
			if (equals) {
				return vt;
			}
		}
		return null;
	}
	
	
}

package com.clinicalresearch.core.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 存放变量的树形结构
 * @author ztq_2016
 *
 */
public class VariableTree {
	/*变量id*/
	private String id;
	
	/*变量名称*/
	private String text;
	
	private String variableType;
	
	private String fatherId;
	
	private String vpyCode;
	
	private String source;
	
	private String now;
	
	private Integer variableLevel;
	
	private Integer variableOrder;
	
	/*是否选中*/
	private boolean isSelected;
	
	List<VariableTree> children;
	
	/*是否有图标*/
	private boolean icon;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

	public boolean isIcon() {
		return icon;
	}

	public void setIcon(boolean icon) {
		this.icon = icon;
	}

	public boolean isSelected() {
		return isSelected;
	}

	
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public List<VariableTree> getChildren() {
		return children;
	}

	public void setChildren(List<VariableTree> children) {
		this.children = children;
	}


	public String getVariableType() {
		return variableType;
	}

	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}

	public String getFatherId() {
		return fatherId;
	}

	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

	public String getVpyCode() {
		return vpyCode;
	}

	public void setVpyCode(String vpyCode) {
		this.vpyCode = vpyCode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}

	public Integer getVariableLevel() {
		return variableLevel;
	}

	public void setVariableLevel(Integer variableLevel) {
		this.variableLevel = variableLevel;
	}

	public Integer getVariableOrder() {
		return variableOrder;
	}

	public void setVariableOrder(Integer variableOrder) {
		this.variableOrder = variableOrder;
	}
	
	public void setChild (VariableTree vTree) {
		if (vTree != null) {
			if (children == null) {
				children = new ArrayList<>();
			}
			children.add(vTree);
		}
	}
}

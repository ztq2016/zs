package com.clinicalresearch.core.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 导出方案的总的bean
 * @author ztq_2016
 *
 */
public class ExportPlanBean {
	
	/*当前导出计划*/
	private ExportPlanView exportPlanView; 
	
	/*所有导出方案*/
	private List<ExportPlanView> exportPlans;
	
	/*变量树型结构*/
	private List<VariableTree> variableTrees;
	
	/*已选导出变量列表*/
	private List<ExportPlanSelectVariable> exportPlanSelectVariables;

	public ExportPlanView getExportPlanView() {
		return exportPlanView;
	}
	/**
	 * 设置当前选中方案
	 * @param exportPlanView
	 */
	public void setExportPlanView(ExportPlanView exportPlanView) {
		this.exportPlanView = exportPlanView;
	}

	public List<ExportPlanView> getExportPlans() {
		return exportPlans;
	}

	public void setExportPlans(List<ExportPlanView> exportPlans) {
		this.exportPlans = exportPlans;
	}

	public List<VariableTree> getVariableTrees() {
		return variableTrees;
	}

	public void setVariableTrees(List<VariableTree> variableTrees) {
		this.variableTrees = variableTrees;
	}

	public List<ExportPlanSelectVariable> getExportPlanSelectVariables() {
		return exportPlanSelectVariables;
	}

	public void setExportPlanSelectVariables(List<ExportPlanSelectVariable> exportPlanSelectVariables) {
		this.exportPlanSelectVariables = exportPlanSelectVariables;
	}
	
	/**
	 * 添加方案到当前方案列表中
	 * @param exportPlanView
	 */
	public void setExportPlanViews(ExportPlanView exportPlanView) {
		if (exportPlans == null) {
			exportPlans = new ArrayList<>();
		}
		exportPlans.add(exportPlanView);
	}
	
	/**
	 * 将选中变量放入变量列表中
	 * @param exportPlanSelectVariable
	 */
	public void setExportPlanSelectVariable(ExportPlanSelectVariable exportPlanSelectVariable) {
		if (exportPlanSelectVariables == null) {
			exportPlanSelectVariables = new ArrayList<>();
		}
		exportPlanSelectVariables.add(exportPlanSelectVariable);
	}
}

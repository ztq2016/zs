package com.clinicalresearch.dao.manager;

import java.util.List;

import com.clinicalresearch.dao.entity.ExportPlanVariables;

public interface ExportPlanVariablesExtendsMapper {
	/**
	 * 批量插入列表
	 * @param list
	 */
	void insertBatch(List<ExportPlanVariables> list);
}
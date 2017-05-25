package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.VariableFieldsUnits;
import com.clinicalresearch.dao.entity.VariableFieldsUnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariableFieldsUnitsExtendsMapper {
	/**
	 * 批量插入
	 * @param list
	 */
    void insertBatch(List<VariableFieldsUnits> list);
}
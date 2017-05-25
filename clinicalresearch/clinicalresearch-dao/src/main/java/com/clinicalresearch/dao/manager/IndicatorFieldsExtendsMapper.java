package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.IndicatorFields;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IndicatorFieldsExtendsMapper {
	void insertBatch(List<IndicatorFields> list);
}
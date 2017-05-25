package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.VariableFieldsUnits;
import com.clinicalresearch.dao.entity.VariableFieldsUnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariableFieldsUnitsMapper {
    int countByExample(VariableFieldsUnitsExample example);

    int deleteByExample(VariableFieldsUnitsExample example);

    int insert(VariableFieldsUnits record);

    int insertSelective(VariableFieldsUnits record);

    List<VariableFieldsUnits> selectByExample(VariableFieldsUnitsExample example);

    int updateByExampleSelective(@Param("record") VariableFieldsUnits record, @Param("example") VariableFieldsUnitsExample example);

    int updateByExample(@Param("record") VariableFieldsUnits record, @Param("example") VariableFieldsUnitsExample example);
}
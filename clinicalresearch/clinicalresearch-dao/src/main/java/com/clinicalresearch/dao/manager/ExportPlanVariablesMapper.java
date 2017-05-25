package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ExportPlanVariables;
import com.clinicalresearch.dao.entity.ExportPlanVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportPlanVariablesMapper {
    int countByExample(ExportPlanVariablesExample example);

    int deleteByExample(ExportPlanVariablesExample example);

    int deleteByPrimaryKey(Integer linkId);

    int insert(ExportPlanVariables record);

    int insertSelective(ExportPlanVariables record);

    List<ExportPlanVariables> selectByExample(ExportPlanVariablesExample example);

    ExportPlanVariables selectByPrimaryKey(Integer linkId);

    int updateByExampleSelective(@Param("record") ExportPlanVariables record, @Param("example") ExportPlanVariablesExample example);

    int updateByExample(@Param("record") ExportPlanVariables record, @Param("example") ExportPlanVariablesExample example);

    int updateByPrimaryKeySelective(ExportPlanVariables record);

    int updateByPrimaryKey(ExportPlanVariables record);
}
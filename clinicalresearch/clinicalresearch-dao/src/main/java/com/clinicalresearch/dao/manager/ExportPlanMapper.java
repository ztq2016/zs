package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ExportPlan;
import com.clinicalresearch.dao.entity.ExportPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportPlanMapper {
    int countByExample(ExportPlanExample example);

    int deleteByExample(ExportPlanExample example);

    int deleteByPrimaryKey(Integer expId);

    int insert(ExportPlan record);

    int insertSelective(ExportPlan record);

    List<ExportPlan> selectByExample(ExportPlanExample example);

    ExportPlan selectByPrimaryKey(Integer expId);

    int updateByExampleSelective(@Param("record") ExportPlan record, @Param("example") ExportPlanExample example);

    int updateByExample(@Param("record") ExportPlan record, @Param("example") ExportPlanExample example);

    int updateByPrimaryKeySelective(ExportPlan record);

    int updateByPrimaryKey(ExportPlan record);
}
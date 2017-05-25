package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.StatisticalResult;
import com.clinicalresearch.dao.entity.StatisticalResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticalResultMapper {
    int countByExample(StatisticalResultExample example);

    int deleteByExample(StatisticalResultExample example);

    int insert(StatisticalResult record);

    int insertSelective(StatisticalResult record);

    List<StatisticalResult> selectByExample(StatisticalResultExample example);

    int updateByExampleSelective(@Param("record") StatisticalResult record, @Param("example") StatisticalResultExample example);

    int updateByExample(@Param("record") StatisticalResult record, @Param("example") StatisticalResultExample example);
}
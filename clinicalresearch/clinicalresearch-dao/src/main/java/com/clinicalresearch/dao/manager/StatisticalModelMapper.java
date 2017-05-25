package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.StatisticalModel;
import com.clinicalresearch.dao.entity.StatisticalModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticalModelMapper {
    int countByExample(StatisticalModelExample example);

    int deleteByExample(StatisticalModelExample example);

    int deleteByPrimaryKey(String modelid);

    int insert(StatisticalModel record);

    int insertSelective(StatisticalModel record);

    List<StatisticalModel> selectByExample(StatisticalModelExample example);

    StatisticalModel selectByPrimaryKey(String modelid);

    int updateByExampleSelective(@Param("record") StatisticalModel record, @Param("example") StatisticalModelExample example);

    int updateByExample(@Param("record") StatisticalModel record, @Param("example") StatisticalModelExample example);

    int updateByPrimaryKeySelective(StatisticalModel record);

    int updateByPrimaryKey(StatisticalModel record);
}
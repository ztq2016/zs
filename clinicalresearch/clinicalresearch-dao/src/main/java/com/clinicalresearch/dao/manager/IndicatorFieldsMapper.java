package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.IndicatorFields;
import com.clinicalresearch.dao.entity.IndicatorFieldsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndicatorFieldsMapper {
    int countByExample(IndicatorFieldsExample example);

    int deleteByExample(IndicatorFieldsExample example);

    int deleteByPrimaryKey(String fieldtableid);

    int insert(IndicatorFields record);

    int insertSelective(IndicatorFields record);

    List<IndicatorFields> selectByExample(IndicatorFieldsExample example);

    IndicatorFields selectByPrimaryKey(String fieldtableid);

    int updateByExampleSelective(@Param("record") IndicatorFields record, @Param("example") IndicatorFieldsExample example);

    int updateByExample(@Param("record") IndicatorFields record, @Param("example") IndicatorFieldsExample example);

    int updateByPrimaryKeySelective(IndicatorFields record);

    int updateByPrimaryKey(IndicatorFields record);
}
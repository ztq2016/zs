package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.RelativeTimevariable;
import com.clinicalresearch.dao.entity.RelativeTimevariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelativeTimevariableMapper {
    int countByExample(RelativeTimevariableExample example);

    int deleteByExample(RelativeTimevariableExample example);

    int deleteByPrimaryKey(String indicatorid);

    int insert(RelativeTimevariable record);

    int insertSelective(RelativeTimevariable record);

    List<RelativeTimevariable> selectByExample(RelativeTimevariableExample example);

    RelativeTimevariable selectByPrimaryKey(String indicatorid);

    int updateByExampleSelective(@Param("record") RelativeTimevariable record, @Param("example") RelativeTimevariableExample example);

    int updateByExample(@Param("record") RelativeTimevariable record, @Param("example") RelativeTimevariableExample example);

    int updateByPrimaryKeySelective(RelativeTimevariable record);

    int updateByPrimaryKey(RelativeTimevariable record);
}
package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.Powers;
import com.clinicalresearch.dao.entity.PowersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowersMapper {
    int countByExample(PowersExample example);

    int deleteByExample(PowersExample example);

    int deleteByPrimaryKey(String powerid);

    int insert(Powers record);

    int insertSelective(Powers record);

    List<Powers> selectByExample(PowersExample example);

    Powers selectByPrimaryKey(String powerid);

    int updateByExampleSelective(@Param("record") Powers record, @Param("example") PowersExample example);

    int updateByExample(@Param("record") Powers record, @Param("example") PowersExample example);

    int updateByPrimaryKeySelective(Powers record);

    int updateByPrimaryKey(Powers record);
}
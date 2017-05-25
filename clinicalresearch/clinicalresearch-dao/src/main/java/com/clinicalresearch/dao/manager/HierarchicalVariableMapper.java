package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.HierarchicalVariable;
import com.clinicalresearch.dao.entity.HierarchicalVariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HierarchicalVariableMapper {
    int countByExample(HierarchicalVariableExample example);

    int deleteByExample(HierarchicalVariableExample example);

    int deleteByPrimaryKey(String variableid);

    int insert(HierarchicalVariable record);

    int insertSelective(HierarchicalVariable record);

    List<HierarchicalVariable> selectByExample(HierarchicalVariableExample example);

    HierarchicalVariable selectByPrimaryKey(String variableid);

    int updateByExampleSelective(@Param("record") HierarchicalVariable record, @Param("example") HierarchicalVariableExample example);

    int updateByExample(@Param("record") HierarchicalVariable record, @Param("example") HierarchicalVariableExample example);

    int updateByPrimaryKeySelective(HierarchicalVariable record);

    int updateByPrimaryKey(HierarchicalVariable record);
}
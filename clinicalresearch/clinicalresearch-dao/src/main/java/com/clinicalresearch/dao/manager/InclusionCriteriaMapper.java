package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.InclusionCriteria;
import com.clinicalresearch.dao.entity.InclusionCriteriaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InclusionCriteriaMapper {
    int countByExample(InclusionCriteriaExample example);

    int deleteByExample(InclusionCriteriaExample example);

    int deleteByPrimaryKey(String criteriaid);

    int insert(InclusionCriteria record);

    int insertSelective(InclusionCriteria record);

    List<InclusionCriteria> selectByExample(InclusionCriteriaExample example);

    InclusionCriteria selectByPrimaryKey(String criteriaid);

    int updateByExampleSelective(@Param("record") InclusionCriteria record, @Param("example") InclusionCriteriaExample example);

    int updateByExample(@Param("record") InclusionCriteria record, @Param("example") InclusionCriteriaExample example);

    int updateByPrimaryKeySelective(InclusionCriteria record);

    int updateByPrimaryKey(InclusionCriteria record);
}
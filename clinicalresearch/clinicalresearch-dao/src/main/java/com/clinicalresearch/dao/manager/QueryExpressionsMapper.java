package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.QueryExpressions;
import com.clinicalresearch.dao.entity.QueryExpressionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueryExpressionsMapper {
    int countByExample(QueryExpressionsExample example);

    int deleteByExample(QueryExpressionsExample example);

    int deleteByPrimaryKey(String queryid);

    int insert(QueryExpressions record);

    int insertSelective(QueryExpressions record);

    List<QueryExpressions> selectByExample(QueryExpressionsExample example);

    QueryExpressions selectByPrimaryKey(String queryid);

    int updateByExampleSelective(@Param("record") QueryExpressions record, @Param("example") QueryExpressionsExample example);

    int updateByExample(@Param("record") QueryExpressions record, @Param("example") QueryExpressionsExample example);

    int updateByPrimaryKeySelective(QueryExpressions record);

    int updateByPrimaryKey(QueryExpressions record);
}
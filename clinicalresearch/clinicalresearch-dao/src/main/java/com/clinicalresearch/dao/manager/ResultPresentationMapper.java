package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ResultPresentation;
import com.clinicalresearch.dao.entity.ResultPresentationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultPresentationMapper {
    int countByExample(ResultPresentationExample example);

    int deleteByExample(ResultPresentationExample example);

    int deleteByPrimaryKey(String presentationid);

    int insert(ResultPresentation record);

    int insertSelective(ResultPresentation record);

    List<ResultPresentation> selectByExample(ResultPresentationExample example);

    ResultPresentation selectByPrimaryKey(String presentationid);

    int updateByExampleSelective(@Param("record") ResultPresentation record, @Param("example") ResultPresentationExample example);

    int updateByExample(@Param("record") ResultPresentation record, @Param("example") ResultPresentationExample example);

    int updateByPrimaryKeySelective(ResultPresentation record);

    int updateByPrimaryKey(ResultPresentation record);
}
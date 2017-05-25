package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ModelTitestResult;
import com.clinicalresearch.dao.entity.ModelTitestResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelTitestResultMapper {
    int countByExample(ModelTitestResultExample example);

    int deleteByExample(ModelTitestResultExample example);

    int deleteByPrimaryKey(Integer titId);

    int insert(ModelTitestResult record);

    int insertSelective(ModelTitestResult record);

    List<ModelTitestResult> selectByExample(ModelTitestResultExample example);

    ModelTitestResult selectByPrimaryKey(Integer titId);

    int updateByExampleSelective(@Param("record") ModelTitestResult record, @Param("example") ModelTitestResultExample example);

    int updateByExample(@Param("record") ModelTitestResult record, @Param("example") ModelTitestResultExample example);

    int updateByPrimaryKeySelective(ModelTitestResult record);

    int updateByPrimaryKey(ModelTitestResult record);
}
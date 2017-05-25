package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ModelIstestResult;
import com.clinicalresearch.dao.entity.ModelIstestResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelIstestResultMapper {
    int countByExample(ModelIstestResultExample example);

    int deleteByExample(ModelIstestResultExample example);

    int deleteByPrimaryKey(Integer isttId);

    int insert(ModelIstestResult record);

    int insertSelective(ModelIstestResult record);

    List<ModelIstestResult> selectByExample(ModelIstestResultExample example);

    ModelIstestResult selectByPrimaryKey(Integer isttId);

    int updateByExampleSelective(@Param("record") ModelIstestResult record, @Param("example") ModelIstestResultExample example);

    int updateByExample(@Param("record") ModelIstestResult record, @Param("example") ModelIstestResultExample example);

    int updateByPrimaryKeySelective(ModelIstestResult record);

    int updateByPrimaryKey(ModelIstestResult record);
}
package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ConfusionControl;
import com.clinicalresearch.dao.entity.ConfusionControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfusionControlMapper {
    int countByExample(ConfusionControlExample example);

    int deleteByExample(ConfusionControlExample example);

    int deleteByPrimaryKey(String controlid);

    int insert(ConfusionControl record);

    int insertSelective(ConfusionControl record);

    List<ConfusionControl> selectByExample(ConfusionControlExample example);

    ConfusionControl selectByPrimaryKey(String controlid);

    int updateByExampleSelective(@Param("record") ConfusionControl record, @Param("example") ConfusionControlExample example);

    int updateByExample(@Param("record") ConfusionControl record, @Param("example") ConfusionControlExample example);

    int updateByPrimaryKeySelective(ConfusionControl record);

    int updateByPrimaryKey(ConfusionControl record);
}
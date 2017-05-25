package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.EmPi;
import com.clinicalresearch.dao.entity.EmPiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmPiMapper {
    int countByExample(EmPiExample example);

    int deleteByExample(EmPiExample example);

    int insert(EmPi record);

    int insertSelective(EmPi record);

    List<EmPi> selectByExample(EmPiExample example);

    int updateByExampleSelective(@Param("record") EmPi record, @Param("example") EmPiExample example);

    int updateByExample(@Param("record") EmPi record, @Param("example") EmPiExample example);
}
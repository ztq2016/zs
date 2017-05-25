package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.Logs;
import com.clinicalresearch.dao.entity.LogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogsMapper {
    int countByExample(LogsExample example);

    int deleteByExample(LogsExample example);

    int deleteByPrimaryKey(String logid);

    int insert(Logs record);

    int insertSelective(Logs record);

    List<Logs> selectByExample(LogsExample example);

    Logs selectByPrimaryKey(String logid);

    int updateByExampleSelective(@Param("record") Logs record, @Param("example") LogsExample example);

    int updateByExample(@Param("record") Logs record, @Param("example") LogsExample example);

    int updateByPrimaryKeySelective(Logs record);

    int updateByPrimaryKey(Logs record);
}
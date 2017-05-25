package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.SystemConf;
import com.clinicalresearch.dao.entity.SystemConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemConfMapper {
    int countByExample(SystemConfExample example);

    int deleteByExample(SystemConfExample example);

    int deleteByPrimaryKey(Integer sysconfId);

    int insert(SystemConf record);

    int insertSelective(SystemConf record);

    List<SystemConf> selectByExample(SystemConfExample example);

    SystemConf selectByPrimaryKey(Integer sysconfId);

    int updateByExampleSelective(@Param("record") SystemConf record, @Param("example") SystemConfExample example);

    int updateByExample(@Param("record") SystemConf record, @Param("example") SystemConfExample example);

    int updateByPrimaryKeySelective(SystemConf record);

    int updateByPrimaryKey(SystemConf record);
}
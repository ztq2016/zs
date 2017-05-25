package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.RolesPowersExample;
import com.clinicalresearch.dao.entity.RolesPowersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolesPowersMapper {
    int countByExample(RolesPowersExample example);

    int deleteByExample(RolesPowersExample example);

    int deleteByPrimaryKey(RolesPowersKey key);

    int insert(RolesPowersKey record);

    int insertSelective(RolesPowersKey record);

    List<RolesPowersKey> selectByExample(RolesPowersExample example);

    int updateByExampleSelective(@Param("record") RolesPowersKey record, @Param("example") RolesPowersExample example);

    int updateByExample(@Param("record") RolesPowersKey record, @Param("example") RolesPowersExample example);
}
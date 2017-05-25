package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.SubjectGroups;
import com.clinicalresearch.dao.entity.SubjectGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectGroupsMapper {
    int countByExample(SubjectGroupsExample example);

    int deleteByExample(SubjectGroupsExample example);

    int deleteByPrimaryKey(String groupid);

    int insert(SubjectGroups record);

    int insertSelective(SubjectGroups record);

    List<SubjectGroups> selectByExample(SubjectGroupsExample example);

    SubjectGroups selectByPrimaryKey(String groupid);

    int updateByExampleSelective(@Param("record") SubjectGroups record, @Param("example") SubjectGroupsExample example);

    int updateByExample(@Param("record") SubjectGroups record, @Param("example") SubjectGroupsExample example);

    int updateByPrimaryKeySelective(SubjectGroups record);

    int updateByPrimaryKey(SubjectGroups record);
}
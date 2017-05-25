package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.StudyType;
import com.clinicalresearch.dao.entity.StudyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyTypeMapper {
    int countByExample(StudyTypeExample example);

    int deleteByExample(StudyTypeExample example);

    int deleteByPrimaryKey(String typeid);

    int insert(StudyType record);

    int insertSelective(StudyType record);

    List<StudyType> selectByExample(StudyTypeExample example);

    StudyType selectByPrimaryKey(String typeid);

    int updateByExampleSelective(@Param("record") StudyType record, @Param("example") StudyTypeExample example);

    int updateByExample(@Param("record") StudyType record, @Param("example") StudyTypeExample example);

    int updateByPrimaryKeySelective(StudyType record);

    int updateByPrimaryKey(StudyType record);
}
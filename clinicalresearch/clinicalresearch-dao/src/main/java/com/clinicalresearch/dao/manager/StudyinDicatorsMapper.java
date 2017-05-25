package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.StudyinDicators;
import com.clinicalresearch.dao.entity.StudyinDicatorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyinDicatorsMapper {
    int countByExample(StudyinDicatorsExample example);

    int deleteByExample(StudyinDicatorsExample example);

    int deleteByPrimaryKey(String indicatorid);

    int insert(StudyinDicators record);

    int insertSelective(StudyinDicators record);

    List<StudyinDicators> selectByExample(StudyinDicatorsExample example);

    StudyinDicators selectByPrimaryKey(String indicatorid);

    int updateByExampleSelective(@Param("record") StudyinDicators record, @Param("example") StudyinDicatorsExample example);

    int updateByExample(@Param("record") StudyinDicators record, @Param("example") StudyinDicatorsExample example);

    int updateByPrimaryKeySelective(StudyinDicators record);

    int updateByPrimaryKey(StudyinDicators record);
}
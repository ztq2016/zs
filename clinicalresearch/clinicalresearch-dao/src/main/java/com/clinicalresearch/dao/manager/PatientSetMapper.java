package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.PatientSet;
import com.clinicalresearch.dao.entity.PatientSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientSetMapper {
    int countByExample(PatientSetExample example);

    int deleteByExample(PatientSetExample example);

    int deleteByPrimaryKey(Long pId);

    int insert(PatientSet record);

    int insertSelective(PatientSet record);

    List<PatientSet> selectByExample(PatientSetExample example);

    PatientSet selectByPrimaryKey(Long pId);

    int updateByExampleSelective(@Param("record") PatientSet record, @Param("example") PatientSetExample example);

    int updateByExample(@Param("record") PatientSet record, @Param("example") PatientSetExample example);

    int updateByPrimaryKeySelective(PatientSet record);

    int updateByPrimaryKey(PatientSet record);
}
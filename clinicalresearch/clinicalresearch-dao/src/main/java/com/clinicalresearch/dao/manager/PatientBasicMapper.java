package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.PatientBasic;
import com.clinicalresearch.dao.entity.PatientBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientBasicMapper {
    int countByExample(PatientBasicExample example);

    int deleteByExample(PatientBasicExample example);

    int insert(PatientBasic record);

    int insertSelective(PatientBasic record);

    List<PatientBasic> selectByExampleWithBLOBs(PatientBasicExample example);

    List<PatientBasic> selectByExample(PatientBasicExample example);

    int updateByExampleSelective(@Param("record") PatientBasic record, @Param("example") PatientBasicExample example);

    int updateByExampleWithBLOBs(@Param("record") PatientBasic record, @Param("example") PatientBasicExample example);

    int updateByExample(@Param("record") PatientBasic record, @Param("example") PatientBasicExample example);
}
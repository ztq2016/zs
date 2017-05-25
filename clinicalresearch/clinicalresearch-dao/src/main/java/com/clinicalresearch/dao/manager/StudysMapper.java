package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.Studys;
import com.clinicalresearch.dao.entity.StudysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudysMapper {
    int countByExample(StudysExample example);

    int deleteByExample(StudysExample example);

    int deleteByPrimaryKey(String studyid);

    int insert(Studys record);

    int insertSelective(Studys record);

    List<Studys> selectByExample(StudysExample example);

    Studys selectByPrimaryKey(String studyid);

    int updateByExampleSelective(@Param("record") Studys record, @Param("example") StudysExample example);

    int updateByExample(@Param("record") Studys record, @Param("example") StudysExample example);

    int updateByPrimaryKeySelective(Studys record);

    int updateByPrimaryKey(Studys record);
}
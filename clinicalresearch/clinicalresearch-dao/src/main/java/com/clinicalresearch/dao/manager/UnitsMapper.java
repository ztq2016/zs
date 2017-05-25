package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.Units;
import com.clinicalresearch.dao.entity.UnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitsMapper {
    int countByExample(UnitsExample example);

    int deleteByExample(UnitsExample example);

    int insert(Units record);

    int insertSelective(Units record);

    List<Units> selectByExample(UnitsExample example);

    int updateByExampleSelective(@Param("record") Units record, @Param("example") UnitsExample example);

    int updateByExample(@Param("record") Units record, @Param("example") UnitsExample example);
}
package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.OuterInterface;
import com.clinicalresearch.dao.entity.OuterInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OuterInterfaceMapper {
    int countByExample(OuterInterfaceExample example);

    int deleteByExample(OuterInterfaceExample example);

    int insert(OuterInterface record);

    int insertSelective(OuterInterface record);

    List<OuterInterface> selectByExample(OuterInterfaceExample example);

    int updateByExampleSelective(@Param("record") OuterInterface record, @Param("example") OuterInterfaceExample example);

    int updateByExample(@Param("record") OuterInterface record, @Param("example") OuterInterfaceExample example);
}
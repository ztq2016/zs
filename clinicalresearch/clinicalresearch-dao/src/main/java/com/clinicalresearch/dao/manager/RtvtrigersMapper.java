package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.Rtvtrigers;
import com.clinicalresearch.dao.entity.RtvtrigersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RtvtrigersMapper {
    int countByExample(RtvtrigersExample example);

    int deleteByExample(RtvtrigersExample example);

    int insert(Rtvtrigers record);

    int insertSelective(Rtvtrigers record);

    List<Rtvtrigers> selectByExample(RtvtrigersExample example);

    int updateByExampleSelective(@Param("record") Rtvtrigers record, @Param("example") RtvtrigersExample example);

    int updateByExample(@Param("record") Rtvtrigers record, @Param("example") RtvtrigersExample example);
}
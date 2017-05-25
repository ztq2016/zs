package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ExportContents;
import com.clinicalresearch.dao.entity.ExportContentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportContentsMapper {
    int countByExample(ExportContentsExample example);

    int deleteByExample(ExportContentsExample example);

    int deleteByPrimaryKey(Integer ecId);

    int insert(ExportContents record);

    int insertSelective(ExportContents record);

    List<ExportContents> selectByExample(ExportContentsExample example);

    ExportContents selectByPrimaryKey(Integer ecId);

    int updateByExampleSelective(@Param("record") ExportContents record, @Param("example") ExportContentsExample example);

    int updateByExample(@Param("record") ExportContents record, @Param("example") ExportContentsExample example);

    int updateByPrimaryKeySelective(ExportContents record);

    int updateByPrimaryKey(ExportContents record);
}
package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ExportFileMeta;
import com.clinicalresearch.dao.entity.ExportFileMetaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExportFileMetaMapper {
    int countByExample(ExportFileMetaExample example);

    int deleteByExample(ExportFileMetaExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(ExportFileMeta record);

    int insertSelective(ExportFileMeta record);

    List<ExportFileMeta> selectByExampleWithBLOBs(ExportFileMetaExample example);

    List<ExportFileMeta> selectByExample(ExportFileMetaExample example);

    ExportFileMeta selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") ExportFileMeta record, @Param("example") ExportFileMetaExample example);

    int updateByExampleWithBLOBs(@Param("record") ExportFileMeta record, @Param("example") ExportFileMetaExample example);

    int updateByExample(@Param("record") ExportFileMeta record, @Param("example") ExportFileMetaExample example);

    int updateByPrimaryKeySelective(ExportFileMeta record);

    int updateByPrimaryKeyWithBLOBs(ExportFileMeta record);

    int updateByPrimaryKey(ExportFileMeta record);
}
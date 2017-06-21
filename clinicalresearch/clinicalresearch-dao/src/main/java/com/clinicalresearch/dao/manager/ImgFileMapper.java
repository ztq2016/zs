package com.clinicalresearch.dao.manager;

import com.clinicalresearch.dao.entity.ImgFile;
import com.clinicalresearch.dao.entity.ImgFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgFileMapper {
    int countByExample(ImgFileExample example);

    int deleteByExample(ImgFileExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(ImgFile record);

    int insertSelective(ImgFile record);

    List<ImgFile> selectByExample(ImgFileExample example);

    ImgFile selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") ImgFile record, @Param("example") ImgFileExample example);

    int updateByExample(@Param("record") ImgFile record, @Param("example") ImgFileExample example);

    int updateByPrimaryKeySelective(ImgFile record);

    int updateByPrimaryKey(ImgFile record);
}
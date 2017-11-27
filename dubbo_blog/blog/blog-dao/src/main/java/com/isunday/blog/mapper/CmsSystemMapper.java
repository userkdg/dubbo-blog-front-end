package com.isunday.blog.mapper;

import com.isunday.blog.model.CmsSystem;
import com.isunday.blog.model.CmsSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSystemMapper {
    int countByExample(CmsSystemExample example);

    int deleteByExample(CmsSystemExample example);

    int deleteByPrimaryKey(Integer systemId);

    int insert(CmsSystem record);

    int insertSelective(CmsSystem record);

    List<CmsSystem> selectByExample(CmsSystemExample example);

    CmsSystem selectByPrimaryKey(Integer systemId);

    int updateByExampleSelective(@Param("record") CmsSystem record, @Param("example") CmsSystemExample example);

    int updateByExample(@Param("record") CmsSystem record, @Param("example") CmsSystemExample example);

    int updateByPrimaryKeySelective(CmsSystem record);

    int updateByPrimaryKey(CmsSystem record);
}
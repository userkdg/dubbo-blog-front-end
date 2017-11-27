package com.isunday.blog.mapper;

import com.isunday.blog.model.CmsPage;
import com.isunday.blog.model.CmsPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPageMapper {
    int countByExample(CmsPageExample example);

    int deleteByExample(CmsPageExample example);

    int deleteByPrimaryKey(Integer pageId);

    int insert(CmsPage record);

    int insertSelective(CmsPage record);

    List<CmsPage> selectByExampleWithBLOBs(CmsPageExample example);

    List<CmsPage> selectByExample(CmsPageExample example);

    CmsPage selectByPrimaryKey(Integer pageId);

    int updateByExampleSelective(@Param("record") CmsPage record, @Param("example") CmsPageExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsPage record, @Param("example") CmsPageExample example);

    int updateByExample(@Param("record") CmsPage record, @Param("example") CmsPageExample example);

    int updateByPrimaryKeySelective(CmsPage record);

    int updateByPrimaryKeyWithBLOBs(CmsPage record);

    int updateByPrimaryKey(CmsPage record);
}
package com.isunday.blog.mapper;

import com.isunday.blog.model.CmsArticleTag;
import com.isunday.blog.model.CmsArticleTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleTagMapper {
    int countByExample(CmsArticleTagExample example);

    int deleteByExample(CmsArticleTagExample example);

    int deleteByPrimaryKey(Integer articleTagId);

    int insert(CmsArticleTag record);

    int insertSelective(CmsArticleTag record);

    List<CmsArticleTag> selectByExample(CmsArticleTagExample example);

    CmsArticleTag selectByPrimaryKey(Integer articleTagId);

    int updateByExampleSelective(@Param("record") CmsArticleTag record, @Param("example") CmsArticleTagExample example);

    int updateByExample(@Param("record") CmsArticleTag record, @Param("example") CmsArticleTagExample example);

    int updateByPrimaryKeySelective(CmsArticleTag record);

    int updateByPrimaryKey(CmsArticleTag record);
}
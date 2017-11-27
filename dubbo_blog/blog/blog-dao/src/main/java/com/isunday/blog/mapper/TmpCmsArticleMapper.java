package com.isunday.blog.mapper;

import com.isunday.blog.model.TmpCmsArticle;
import com.isunday.blog.model.TmpCmsArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmpCmsArticleMapper {
    int countByExample(TmpCmsArticleExample example);

    int deleteByExample(TmpCmsArticleExample example);

    int deleteByPrimaryKey(Integer articleId);

    int insert(TmpCmsArticle record);

    int insertSelective(TmpCmsArticle record);

    List<TmpCmsArticle> selectByExampleWithBLOBs(TmpCmsArticleExample example);

    List<TmpCmsArticle> selectByExample(TmpCmsArticleExample example);

    TmpCmsArticle selectByPrimaryKey(Integer articleId);

    int updateByExampleSelective(@Param("record") TmpCmsArticle record, @Param("example") TmpCmsArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") TmpCmsArticle record, @Param("example") TmpCmsArticleExample example);

    int updateByExample(@Param("record") TmpCmsArticle record, @Param("example") TmpCmsArticleExample example);

    int updateByPrimaryKeySelective(TmpCmsArticle record);

    int updateByPrimaryKeyWithBLOBs(TmpCmsArticle record);

    int updateByPrimaryKey(TmpCmsArticle record);
}
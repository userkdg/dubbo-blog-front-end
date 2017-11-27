package com.isunday.blog.mapper;

import com.isunday.blog.model.TmpCmsCategory;
import com.isunday.blog.model.TmpCmsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmpCmsCategoryMapper {
    int countByExample(TmpCmsCategoryExample example);

    int deleteByExample(TmpCmsCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(TmpCmsCategory record);

    int insertSelective(TmpCmsCategory record);

    List<TmpCmsCategory> selectByExample(TmpCmsCategoryExample example);

    TmpCmsCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") TmpCmsCategory record, @Param("example") TmpCmsCategoryExample example);

    int updateByExample(@Param("record") TmpCmsCategory record, @Param("example") TmpCmsCategoryExample example);

    int updateByPrimaryKeySelective(TmpCmsCategory record);

    int updateByPrimaryKey(TmpCmsCategory record);
}
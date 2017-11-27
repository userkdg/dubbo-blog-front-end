package com.isunday.blog.mapper;

import com.isunday.blog.model.TmpCmsTag;
import com.isunday.blog.model.TmpCmsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmpCmsTagMapper {
    int countByExample(TmpCmsTagExample example);

    int deleteByExample(TmpCmsTagExample example);

    int deleteByPrimaryKey(Integer tagId);

    int insert(TmpCmsTag record);

    int insertSelective(TmpCmsTag record);

    List<TmpCmsTag> selectByExample(TmpCmsTagExample example);

    TmpCmsTag selectByPrimaryKey(Integer tagId);

    int updateByExampleSelective(@Param("record") TmpCmsTag record, @Param("example") TmpCmsTagExample example);

    int updateByExample(@Param("record") TmpCmsTag record, @Param("example") TmpCmsTagExample example);

    int updateByPrimaryKeySelective(TmpCmsTag record);

    int updateByPrimaryKey(TmpCmsTag record);
}
package com.isunday.blog.mapper;

import com.isunday.blog.model.TmpCmsComment;
import com.isunday.blog.model.TmpCmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmpCmsCommentMapper {
    int countByExample(TmpCmsCommentExample example);

    int deleteByExample(TmpCmsCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(TmpCmsComment record);

    int insertSelective(TmpCmsComment record);

    List<TmpCmsComment> selectByExampleWithBLOBs(TmpCmsCommentExample example);

    List<TmpCmsComment> selectByExample(TmpCmsCommentExample example);

    TmpCmsComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") TmpCmsComment record, @Param("example") TmpCmsCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") TmpCmsComment record, @Param("example") TmpCmsCommentExample example);

    int updateByExample(@Param("record") TmpCmsComment record, @Param("example") TmpCmsCommentExample example);

    int updateByPrimaryKeySelective(TmpCmsComment record);

    int updateByPrimaryKeyWithBLOBs(TmpCmsComment record);

    int updateByPrimaryKey(TmpCmsComment record);
}
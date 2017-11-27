package com.isunday.blog.mapper;

import com.isunday.blog.model.UcenterUserDetails;
import com.isunday.blog.model.UcenterUserDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcenterUserDetailsMapper {
    int countByExample(UcenterUserDetailsExample example);

    int deleteByExample(UcenterUserDetailsExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UcenterUserDetails record);

    int insertSelective(UcenterUserDetails record);

    List<UcenterUserDetails> selectByExample(UcenterUserDetailsExample example);

    UcenterUserDetails selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UcenterUserDetails record, @Param("example") UcenterUserDetailsExample example);

    int updateByExample(@Param("record") UcenterUserDetails record, @Param("example") UcenterUserDetailsExample example);

    int updateByPrimaryKeySelective(UcenterUserDetails record);

    int updateByPrimaryKey(UcenterUserDetails record);
}
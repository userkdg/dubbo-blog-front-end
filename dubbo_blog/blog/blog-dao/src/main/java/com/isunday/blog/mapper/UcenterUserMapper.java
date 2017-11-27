package com.isunday.blog.mapper;

import com.isunday.blog.model.UcenterUser;
import com.isunday.blog.model.UcenterUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcenterUserMapper {
    int countByExample(UcenterUserExample example);

    int deleteByExample(UcenterUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UcenterUser record);

    int insertSelective(UcenterUser record);

    List<UcenterUser> selectByExample(UcenterUserExample example);

    UcenterUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UcenterUser record, @Param("example") UcenterUserExample example);

    int updateByExample(@Param("record") UcenterUser record, @Param("example") UcenterUserExample example);

    int updateByPrimaryKeySelective(UcenterUser record);

    int updateByPrimaryKey(UcenterUser record);
}
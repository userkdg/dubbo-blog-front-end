package com.isunday.blog.mapper;

import com.isunday.blog.model.UcenterUserOauth;
import com.isunday.blog.model.UcenterUserOauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcenterUserOauthMapper {
    int countByExample(UcenterUserOauthExample example);

    int deleteByExample(UcenterUserOauthExample example);

    int deleteByPrimaryKey(Integer userOauthId);

    int insert(UcenterUserOauth record);

    int insertSelective(UcenterUserOauth record);

    List<UcenterUserOauth> selectByExampleWithBLOBs(UcenterUserOauthExample example);

    List<UcenterUserOauth> selectByExample(UcenterUserOauthExample example);

    UcenterUserOauth selectByPrimaryKey(Integer userOauthId);

    int updateByExampleSelective(@Param("record") UcenterUserOauth record, @Param("example") UcenterUserOauthExample example);

    int updateByExampleWithBLOBs(@Param("record") UcenterUserOauth record, @Param("example") UcenterUserOauthExample example);

    int updateByExample(@Param("record") UcenterUserOauth record, @Param("example") UcenterUserOauthExample example);

    int updateByPrimaryKeySelective(UcenterUserOauth record);

    int updateByPrimaryKeyWithBLOBs(UcenterUserOauth record);

    int updateByPrimaryKey(UcenterUserOauth record);
}
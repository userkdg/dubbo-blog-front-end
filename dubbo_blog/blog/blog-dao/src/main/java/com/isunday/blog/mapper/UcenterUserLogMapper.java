package com.isunday.blog.mapper;

import com.isunday.blog.model.UcenterUserLog;
import com.isunday.blog.model.UcenterUserLogExample;
import com.isunday.blog.model.UcenterUserLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UcenterUserLogMapper {
    int countByExample(UcenterUserLogExample example);

    int deleteByExample(UcenterUserLogExample example);

    int deleteByPrimaryKey(Integer userLogId);

    int insert(UcenterUserLogWithBLOBs record);

    int insertSelective(UcenterUserLogWithBLOBs record);

    List<UcenterUserLogWithBLOBs> selectByExampleWithBLOBs(UcenterUserLogExample example);

    List<UcenterUserLog> selectByExample(UcenterUserLogExample example);

    UcenterUserLogWithBLOBs selectByPrimaryKey(Integer userLogId);

    int updateByExampleSelective(@Param("record") UcenterUserLogWithBLOBs record, @Param("example") UcenterUserLogExample example);

    int updateByExampleWithBLOBs(@Param("record") UcenterUserLogWithBLOBs record, @Param("example") UcenterUserLogExample example);

    int updateByExample(@Param("record") UcenterUserLog record, @Param("example") UcenterUserLogExample example);

    int updateByPrimaryKeySelective(UcenterUserLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UcenterUserLogWithBLOBs record);

    int updateByPrimaryKey(UcenterUserLog record);
}
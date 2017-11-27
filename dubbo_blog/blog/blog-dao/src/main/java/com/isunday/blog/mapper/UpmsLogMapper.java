package com.isunday.blog.mapper;

import com.isunday.blog.model.UpmsLog;
import com.isunday.blog.model.UpmsLogExample;
import com.isunday.blog.model.UpmsLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsLogMapper {
    int countByExample(UpmsLogExample example);

    int deleteByExample(UpmsLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(UpmsLogWithBLOBs record);

    int insertSelective(UpmsLogWithBLOBs record);

    List<UpmsLogWithBLOBs> selectByExampleWithBLOBs(UpmsLogExample example);

    List<UpmsLog> selectByExample(UpmsLogExample example);

    UpmsLogWithBLOBs selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") UpmsLogWithBLOBs record, @Param("example") UpmsLogExample example);

    int updateByExampleWithBLOBs(@Param("record") UpmsLogWithBLOBs record, @Param("example") UpmsLogExample example);

    int updateByExample(@Param("record") UpmsLog record, @Param("example") UpmsLogExample example);

    int updateByPrimaryKeySelective(UpmsLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UpmsLogWithBLOBs record);

    int updateByPrimaryKey(UpmsLog record);
}
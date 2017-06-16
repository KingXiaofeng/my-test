package com.yhb.dao;

import com.yhb.bean.entity.SystemLog;
import com.yhb.bean.entity.SystemLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemLogDao {
    int countByExample(SystemLogExample example);

    int deleteByExample(SystemLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemLog record);

    int insertSelective(SystemLog record);

    List<SystemLog> selectByExampleWithBLOBs(SystemLogExample example);

    List<SystemLog> selectByExample(SystemLogExample example);

    SystemLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemLog record, @Param("example") SystemLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SystemLog record, @Param("example") SystemLogExample example);

    int updateByExample(@Param("record") SystemLog record, @Param("example") SystemLogExample example);

    int updateByPrimaryKeySelective(SystemLog record);

    int updateByPrimaryKeyWithBLOBs(SystemLog record);

    int updateByPrimaryKey(SystemLog record);
}
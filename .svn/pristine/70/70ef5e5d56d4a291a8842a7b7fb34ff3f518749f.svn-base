package com.yhb.dao;

import com.yhb.bean.entity.LogMoneyChange;
import com.yhb.bean.entity.LogMoneyChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMoneyChangeDao {
    int countByExample(LogMoneyChangeExample example);

    int deleteByExample(LogMoneyChangeExample example);

    int deleteByPrimaryKey(Integer moneychangeid);

    int insert(LogMoneyChange record);

    int insertSelective(LogMoneyChange record);

    List<LogMoneyChange> selectByExampleWithBLOBs(LogMoneyChangeExample example);

    List<LogMoneyChange> selectByExample(LogMoneyChangeExample example);

    LogMoneyChange selectByPrimaryKey(Integer moneychangeid);

    int updateByExampleSelective(@Param("record") LogMoneyChange record, @Param("example") LogMoneyChangeExample example);

    int updateByExampleWithBLOBs(@Param("record") LogMoneyChange record, @Param("example") LogMoneyChangeExample example);

    int updateByExample(@Param("record") LogMoneyChange record, @Param("example") LogMoneyChangeExample example);

    int updateByPrimaryKeySelective(LogMoneyChange record);

    int updateByPrimaryKeyWithBLOBs(LogMoneyChange record);

    int updateByPrimaryKey(LogMoneyChange record);
}
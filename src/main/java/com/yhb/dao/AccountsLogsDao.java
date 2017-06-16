package com.yhb.dao;

import com.yhb.bean.entity.AccountsLogs;
import com.yhb.bean.entity.AccountsLogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsLogsDao {
    int countByExample(AccountsLogsExample example);

    int deleteByExample(AccountsLogsExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(AccountsLogs record);

    int insertSelective(AccountsLogs record);

    List<AccountsLogs> selectByExample(AccountsLogsExample example);

    AccountsLogs selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") AccountsLogs record, @Param("example") AccountsLogsExample example);

    int updateByExample(@Param("record") AccountsLogs record, @Param("example") AccountsLogsExample example);

    int updateByPrimaryKeySelective(AccountsLogs record);

    int updateByPrimaryKey(AccountsLogs record);
}
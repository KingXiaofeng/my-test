package com.yhb.dao;

import com.yhb.bean.entity.AccountUsersActivity;
import com.yhb.bean.entity.AccountUsersActivityExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AccountUsersActivityDao {
    int countByExample(AccountUsersActivityExample example);

    int deleteByExample(AccountUsersActivityExample example);

    int deleteByPrimaryKey(Integer redid);

    int insert(AccountUsersActivity record);

    int insertSelective(AccountUsersActivity record);

    List<AccountUsersActivity> selectByExample(AccountUsersActivityExample example);

    List<AccountUsersActivity> selectUserRedList(Map param);

    AccountUsersActivity selectByPrimaryKey(Integer redid);

    int updateByExampleSelective(@Param("record") AccountUsersActivity record, @Param("example") AccountUsersActivityExample example);

    int updateByExample(@Param("record") AccountUsersActivity record, @Param("example") AccountUsersActivityExample example);

    int updateByPrimaryKeySelective(AccountUsersActivity record);

    int updateByPrimaryKey(AccountUsersActivity record);
}
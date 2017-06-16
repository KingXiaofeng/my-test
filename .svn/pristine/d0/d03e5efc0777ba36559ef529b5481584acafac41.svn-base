package com.yhb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhb.annotation.MyBatis;
import com.yhb.bean.entity.AccountsUsers;
import com.yhb.bean.entity.AccountsUsersExample;

@MyBatis
public interface AccountsUsersDao {

	AccountsUsers selectUserByUserName(String userName);
	
    int countByExample(AccountsUsersExample example);

    int deleteByExample(AccountsUsersExample example);

    int deleteByPrimaryKey(@Param("userid") String userid);

    int insert(AccountsUsers record);

    int insertSelective(AccountsUsers record);

    List<AccountsUsers> selectByExample(AccountsUsersExample example);

    AccountsUsers selectByPrimaryKey(@Param("userid") String userid);

    int updateByExampleSelective(@Param("record") AccountsUsers record, @Param("example") AccountsUsersExample example);

    int updateByExample(@Param("record") AccountsUsers record, @Param("example") AccountsUsersExample example);

    int updateByPrimaryKeySelective(AccountsUsers record);

    int updateByPrimaryKey(AccountsUsers record);

}
package com.yhb.dao;

import com.yhb.bean.entity.AccountsUsersBalances;
import com.yhb.bean.entity.AccountsUsersBalancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsUsersBalancesDao {
    int countByExample(AccountsUsersBalancesExample example);

    int deleteByExample(AccountsUsersBalancesExample example);

    int deleteByPrimaryKey(@Param("balanceid") Integer balanceid, @Param("userid") String userid);

    int insert(AccountsUsersBalances record);

    int insertSelective(AccountsUsersBalances record);

    AccountsUsersBalances selectByUserId(String userId);
    
    List<AccountsUsersBalances> selectByExample(AccountsUsersBalancesExample example);

    AccountsUsersBalances selectByPrimaryKey(@Param("balanceid") Integer balanceid, @Param("userid") String userid);

    int updateByExampleSelective(@Param("record") AccountsUsersBalances record, @Param("example") AccountsUsersBalancesExample example);

    int updateByExample(@Param("record") AccountsUsersBalances record, @Param("example") AccountsUsersBalancesExample example);

    int updateByPrimaryKeySelective(AccountsUsersBalances record);

    int updateByPrimaryKey(AccountsUsersBalances record);
}
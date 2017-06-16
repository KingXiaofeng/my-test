package com.yhb.dao;

import com.yhb.bean.entity.AccountsUsersRegisteredState;
import com.yhb.bean.entity.AccountsUsersRegisteredStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsUsersRegisteredStateDao {
    int countByExample(AccountsUsersRegisteredStateExample example);

    int deleteByExample(AccountsUsersRegisteredStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountsUsersRegisteredState record);

    int insertSelective(AccountsUsersRegisteredState record);

    List<AccountsUsersRegisteredState> selectByExample(AccountsUsersRegisteredStateExample example);

    AccountsUsersRegisteredState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountsUsersRegisteredState record, @Param("example") AccountsUsersRegisteredStateExample example);

    int updateByExample(@Param("record") AccountsUsersRegisteredState record, @Param("example") AccountsUsersRegisteredStateExample example);

    int updateByPrimaryKeySelective(AccountsUsersRegisteredState record);

    int updateByPrimaryKey(AccountsUsersRegisteredState record);
}
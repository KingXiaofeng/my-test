package com.yhb.dao;

import com.yhb.bean.entity.AccountChangeinfo;
import com.yhb.bean.entity.AccountsRevenueMoney;
import com.yhb.bean.entity.AccountsRevenueMoneyExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AccountsRevenueMoneyDao {
    int countByExample(AccountsRevenueMoneyExample example);

    int deleteByExample(AccountsRevenueMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountsRevenueMoney record);

    int insertSelective(AccountsRevenueMoney record);

    int revenueMoneyCount(Map param);

    List<AccountsRevenueMoney> revenueMoneyList(Map param);

    List<AccountsRevenueMoney> selectByExample(AccountsRevenueMoneyExample example);

    AccountsRevenueMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountsRevenueMoney record, @Param("example") AccountsRevenueMoneyExample example);

    int updateByExample(@Param("record") AccountsRevenueMoney record, @Param("example") AccountsRevenueMoneyExample example);

    int updateByPrimaryKeySelective(AccountsRevenueMoney record);

    int updateByPrimaryKey(AccountsRevenueMoney record);
}
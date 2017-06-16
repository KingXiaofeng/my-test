package com.yhb.dao;

import com.yhb.bean.entity.AccountRaiseGet;
import com.yhb.bean.entity.AccountRaiseGetExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AccountRaiseGetDao {
    int countByExample(AccountRaiseGetExample example);

    int deleteByExample(AccountRaiseGetExample example);

    int deleteByPrimaryKey(Integer raiseid);

    int insert(AccountRaiseGet record);

    int insertSelective(AccountRaiseGet record);

    List<AccountRaiseGet> selectRaiseList(Map param);

    List<AccountRaiseGet> selectByExample(AccountRaiseGetExample example);

    AccountRaiseGet selectByPrimaryKey(Integer raiseid);

    int updateByExampleSelective(@Param("record") AccountRaiseGet record, @Param("example") AccountRaiseGetExample example);

    int updateByExample(@Param("record") AccountRaiseGet record, @Param("example") AccountRaiseGetExample example);

    int updateByPrimaryKeySelective(AccountRaiseGet record);

    int updateByPrimaryKey(AccountRaiseGet record);
}
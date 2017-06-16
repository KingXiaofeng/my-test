package com.yhb.dao;

import com.yhb.bean.entity.AccountsCenterMeassage;
import com.yhb.bean.entity.AccountsCenterMeassageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsCenterMeassageDao {
    int countByExample(AccountsCenterMeassageExample example);

    int deleteByExample(AccountsCenterMeassageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountsCenterMeassage record);

    int insertSelective(AccountsCenterMeassage record);

    List<AccountsCenterMeassage> selectByExample(AccountsCenterMeassageExample example);

    AccountsCenterMeassage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountsCenterMeassage record, @Param("example") AccountsCenterMeassageExample example);

    int updateByExample(@Param("record") AccountsCenterMeassage record, @Param("example") AccountsCenterMeassageExample example);

    int updateByPrimaryKeySelective(AccountsCenterMeassage record);

    int updateByPrimaryKey(AccountsCenterMeassage record);
}
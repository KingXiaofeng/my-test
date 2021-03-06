package com.yhb.dao;

import com.yhb.bean.entity.AccountChangeinfo;
import com.yhb.bean.entity.AccountChangeinfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface AccountChangeinfoDao {
    int countByExample(AccountChangeinfoExample example);

    int deleteByExample(AccountChangeinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountChangeinfo record);

    int insertSelective(AccountChangeinfo record);

    List<AccountChangeinfo> selectByExample(AccountChangeinfoExample example);

    AccountChangeinfo selectByPrimaryKey(Integer id);

    List<AccountChangeinfo> userCurrentRecord(Map param);

    int userCurrentRecordCount(Map param);

    int updateByExampleSelective(@Param("record") AccountChangeinfo record, @Param("example") AccountChangeinfoExample example);

    int updateByExample(@Param("record") AccountChangeinfo record, @Param("example") AccountChangeinfoExample example);

    int updateByPrimaryKeySelective(AccountChangeinfo record);

    int updateByPrimaryKey(AccountChangeinfo record);
}
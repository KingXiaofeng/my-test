package com.yhb.dao;

import com.yhb.bean.entity.BaseInterfaceBank;
import com.yhb.bean.entity.BaseInterfaceBankExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseInterfaceBankDao {
    int countByExample(BaseInterfaceBankExample example);

    int deleteByExample(BaseInterfaceBankExample example);

    int insert(BaseInterfaceBank record);

    int insertSelective(BaseInterfaceBank record);
    
    BaseInterfaceBank selectBankNumByBankCode(String bankCode);

    List<BaseInterfaceBank> selectByExample(BaseInterfaceBankExample example);

    int updateByExampleSelective(@Param("record") BaseInterfaceBank record, @Param("example") BaseInterfaceBankExample example);

    int updateByExample(@Param("record") BaseInterfaceBank record, @Param("example") BaseInterfaceBankExample example);

    BaseInterfaceBank selectBankInfoForUserId(String userId);
}
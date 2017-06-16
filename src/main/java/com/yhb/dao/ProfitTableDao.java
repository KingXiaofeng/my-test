package com.yhb.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yhb.bean.entity.ProfitTable;
import com.yhb.bean.entity.ProfitTableExample;

public interface ProfitTableDao {
    int countByExample(ProfitTableExample example);

    int deleteByExample(ProfitTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProfitTable record);

    int insertSelective(ProfitTable record);

    List<ProfitTable> selectByExample(ProfitTableExample example);

    ProfitTable selectByPrimaryKey(Integer id);
    //获取用户昨日和累计收益
    Map<String,Object> selectUserIncome(String userId);

    int updateByExampleSelective(@Param("record") ProfitTable record, @Param("example") ProfitTableExample example);

    int updateByExample(@Param("record") ProfitTable record, @Param("example") ProfitTableExample example);

    int updateByPrimaryKeySelective(ProfitTable record);

    int updateByPrimaryKey(ProfitTable record);
}
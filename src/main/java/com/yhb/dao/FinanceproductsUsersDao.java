package com.yhb.dao;

import com.yhb.bean.entity.FinanceproductsUsers;
import com.yhb.bean.entity.FinanceproductsUsersExample;
import java.util.List;
import java.util.Map;

import com.yhb.vo.UserBuyProductList;
import org.apache.ibatis.annotations.Param;

public interface FinanceproductsUsersDao {
    int countByExample(FinanceproductsUsersExample example);

    int deleteByExample(FinanceproductsUsersExample example);

    int deleteByPrimaryKey(Integer fpuid);

    int insert(FinanceproductsUsers record);

    int insertSelective(FinanceproductsUsers record);
    
    int getCountUserByFPid(Integer FPid);

    //获取用户持有中或已结束数据总数
    int getProductCountByParam(Map<String, Object> param);
    //获取用户持有中或已结束列表
    List<UserBuyProductList> getUserBuyProductList(Map param);

    List<FinanceproductsUsers> selectByExampleWithBLOBs(FinanceproductsUsersExample example);

    List<FinanceproductsUsers> selectByExample(FinanceproductsUsersExample example);

    FinanceproductsUsers selectByPrimaryKey(Integer fpuid);

    List<FinanceproductsUsers> getUserInvestmentRecords(Integer id);

    int updateByExampleSelective(@Param("record") FinanceproductsUsers record, @Param("example") FinanceproductsUsersExample example);

    int updateByExampleWithBLOBs(@Param("record") FinanceproductsUsers record, @Param("example") FinanceproductsUsersExample example);

    int updateByExample(@Param("record") FinanceproductsUsers record, @Param("example") FinanceproductsUsersExample example);

    int updateByPrimaryKeySelective(FinanceproductsUsers record);

    int updateByPrimaryKeyWithBLOBs(FinanceproductsUsers record);

    int updateByPrimaryKey(FinanceproductsUsers record);
}
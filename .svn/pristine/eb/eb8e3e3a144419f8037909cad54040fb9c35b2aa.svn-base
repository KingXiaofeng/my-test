package com.yhb.dao;

import com.yhb.bean.entity.FinanceproductsExtract;
import com.yhb.bean.entity.FinanceproductsExtractExample;
import java.util.List;
import java.util.Map;

import com.yhb.vo.UserOutProductList;
import org.apache.ibatis.annotations.Param;

public interface FinanceproductsExtractDao {
    int countByExample(FinanceproductsExtractExample example);

    int deleteByExample(FinanceproductsExtractExample example);

    int deleteByPrimaryKey(Integer fpeid);

    int insert(FinanceproductsExtract record);

    int insertSelective(FinanceproductsExtract record);
    //获取转出产品数据数
    int getOutProductCount(Map<String, Object> param);
    //获取转出产品列表
    List<UserOutProductList> getOutProductList(Map param);

    List<FinanceproductsExtract> selectByExample(FinanceproductsExtractExample example);

    FinanceproductsExtract selectByPrimaryKey(Integer fpeid);

    int updateByExampleSelective(@Param("record") FinanceproductsExtract record, @Param("example") FinanceproductsExtractExample example);

    int updateByExample(@Param("record") FinanceproductsExtract record, @Param("example") FinanceproductsExtractExample example);

    int updateByPrimaryKeySelective(FinanceproductsExtract record);

    int updateByPrimaryKey(FinanceproductsExtract record);
}
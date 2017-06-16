package com.yhb.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yhb.bean.entity.HxOrderInfo;
import com.yhb.bean.entity.HxOrderInfoExample;

public interface HxOrderInfoDao {
    int countByExample(HxOrderInfoExample example);

    int deleteByExample(HxOrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HxOrderInfo record);

    int insertSelective(HxOrderInfo record);

    List<HxOrderInfo> selectByExampleWithBLOBs(HxOrderInfoExample example);

    List<HxOrderInfo> selectByExample(HxOrderInfoExample example);

    HxOrderInfo selectByPrimaryKey(Integer id);
    
    HxOrderInfo selectByMerBill(Map param);
    
    HxOrderInfo selectByipsBill(Object param);

    int updateByExampleSelective(@Param("record") HxOrderInfo record, @Param("example") HxOrderInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") HxOrderInfo record, @Param("example") HxOrderInfoExample example);

    int updateByExample(@Param("record") HxOrderInfo record, @Param("example") HxOrderInfoExample example);

    int updateByPrimaryKeySelective(HxOrderInfo record);

    int updateByPrimaryKeyWithBLOBs(HxOrderInfo record);

    int updateByPrimaryKey(HxOrderInfo record);
}
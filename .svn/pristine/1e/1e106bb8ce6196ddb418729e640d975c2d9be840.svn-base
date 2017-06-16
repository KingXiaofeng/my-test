package com.yhb.dao;

import com.yhb.bean.entity.DailyRevenue;
import com.yhb.bean.entity.DailyRevenueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyRevenueDao {
    int countByExample(DailyRevenueExample example);

    int deleteByExample(DailyRevenueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DailyRevenue record);

    int insertSelective(DailyRevenue record);

    List<DailyRevenue> selectByExample(DailyRevenueExample example);

    DailyRevenue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DailyRevenue record, @Param("example") DailyRevenueExample example);

    int updateByExample(@Param("record") DailyRevenue record, @Param("example") DailyRevenueExample example);

    int updateByPrimaryKeySelective(DailyRevenue record);

    int updateByPrimaryKey(DailyRevenue record);
}
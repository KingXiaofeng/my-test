package com.yhb.dao;

import com.yhb.bean.entity.DealCheck;
import com.yhb.bean.entity.DealCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealCheckDao {
    int countByExample(DealCheckExample example);

    int deleteByExample(DealCheckExample example);

    int deleteByPrimaryKey(String checkid);

    int insert(DealCheck record);

    int insertSelective(DealCheck record);

    List<DealCheck> selectByExample(DealCheckExample example);

    DealCheck selectByPrimaryKey(String checkid);

    int updateByExampleSelective(@Param("record") DealCheck record, @Param("example") DealCheckExample example);

    int updateByExample(@Param("record") DealCheck record, @Param("example") DealCheckExample example);

    int updateByPrimaryKeySelective(DealCheck record);

    int updateByPrimaryKey(DealCheck record);
}
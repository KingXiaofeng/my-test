package com.yhb.dao;

import com.yhb.bean.entity.RedBuyPro;
import com.yhb.bean.entity.RedBuyProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedBuyProDao {
    int countByExample(RedBuyProExample example);

    int deleteByExample(RedBuyProExample example);

    int deleteByPrimaryKey(Integer redbuyid);

    int insert(RedBuyPro record);

    int insertSelective(RedBuyPro record);

    List<RedBuyPro> selectByExample(RedBuyProExample example);

    RedBuyPro selectByPrimaryKey(Integer redbuyid);

    int updateByExampleSelective(@Param("record") RedBuyPro record, @Param("example") RedBuyProExample example);

    int updateByExample(@Param("record") RedBuyPro record, @Param("example") RedBuyProExample example);

    int updateByPrimaryKeySelective(RedBuyPro record);

    int updateByPrimaryKey(RedBuyPro record);
}
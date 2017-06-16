package com.yhb.dao;

import com.yhb.bean.entity.RaiseBuyPro;
import com.yhb.bean.entity.RaiseBuyProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RaiseBuyProDao {
    int countByExample(RaiseBuyProExample example);

    int deleteByExample(RaiseBuyProExample example);

    int deleteByPrimaryKey(Integer raisebuyid);

    int insert(RaiseBuyPro record);

    int insertSelective(RaiseBuyPro record);

    List<RaiseBuyPro> selectByExample(RaiseBuyProExample example);

    RaiseBuyPro selectByPrimaryKey(Integer raisebuyid);

    int updateByExampleSelective(@Param("record") RaiseBuyPro record, @Param("example") RaiseBuyProExample example);

    int updateByExample(@Param("record") RaiseBuyPro record, @Param("example") RaiseBuyProExample example);

    int updateByPrimaryKeySelective(RaiseBuyPro record);

    int updateByPrimaryKey(RaiseBuyPro record);
}
package com.yhb.dao;

import com.yhb.bean.entity.UsersBankCardErrorinfo;
import com.yhb.bean.entity.UsersBankCardErrorinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UsersBankCardErrorinfoDao {
    int countByExample(UsersBankCardErrorinfoExample example);

    int deleteByExample(UsersBankCardErrorinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersBankCardErrorinfo record);

    int insertSelective(UsersBankCardErrorinfo record);

    List<UsersBankCardErrorinfo> selectByExample(UsersBankCardErrorinfoExample example);

    UsersBankCardErrorinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersBankCardErrorinfo record, @Param("example") UsersBankCardErrorinfoExample example);

    int updateByExample(@Param("record") UsersBankCardErrorinfo record, @Param("example") UsersBankCardErrorinfoExample example);

    int updateByPrimaryKeySelective(UsersBankCardErrorinfo record);

    int updateByPrimaryKey(UsersBankCardErrorinfo record);

    List<UsersBankCardErrorinfo> selectByUserIdAndToday(Map<String,String> paramMap);
}
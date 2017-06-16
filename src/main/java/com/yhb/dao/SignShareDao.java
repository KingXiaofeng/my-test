package com.yhb.dao;

import com.yhb.bean.entity.SignShare;
import com.yhb.bean.entity.SignShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignShareDao {
    int countByExample(SignShareExample example);

    int deleteByExample(SignShareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SignShare record);

    int insertSelective(SignShare record);

    List<SignShare> selectByExample(SignShareExample example);

    SignShare selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SignShare record, @Param("example") SignShareExample example);

    int updateByExample(@Param("record") SignShare record, @Param("example") SignShareExample example);

    int updateByPrimaryKeySelective(SignShare record);

    int updateByPrimaryKey(SignShare record);
}
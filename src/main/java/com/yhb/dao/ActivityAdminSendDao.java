package com.yhb.dao;

import com.yhb.bean.entity.ActivityAdminSend;
import com.yhb.bean.entity.ActivityAdminSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityAdminSendDao {
    int countByExample(ActivityAdminSendExample example);

    int deleteByExample(ActivityAdminSendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityAdminSend record);

    int insertSelective(ActivityAdminSend record);

    List<ActivityAdminSend> selectByExample(ActivityAdminSendExample example);

    ActivityAdminSend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityAdminSend record, @Param("example") ActivityAdminSendExample example);

    int updateByExample(@Param("record") ActivityAdminSend record, @Param("example") ActivityAdminSendExample example);

    int updateByPrimaryKeySelective(ActivityAdminSend record);

    int updateByPrimaryKey(ActivityAdminSend record);
}
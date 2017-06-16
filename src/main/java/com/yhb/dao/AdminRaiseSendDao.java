package com.yhb.dao;

import com.yhb.bean.entity.AdminRaiseSend;
import com.yhb.bean.entity.AdminRaiseSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRaiseSendDao {
    int countByExample(AdminRaiseSendExample example);

    int deleteByExample(AdminRaiseSendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRaiseSend record);

    int insertSelective(AdminRaiseSend record);

    List<AdminRaiseSend> selectByExample(AdminRaiseSendExample example);

    AdminRaiseSend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRaiseSend record, @Param("example") AdminRaiseSendExample example);

    int updateByExample(@Param("record") AdminRaiseSend record, @Param("example") AdminRaiseSendExample example);

    int updateByPrimaryKeySelective(AdminRaiseSend record);

    int updateByPrimaryKey(AdminRaiseSend record);
}
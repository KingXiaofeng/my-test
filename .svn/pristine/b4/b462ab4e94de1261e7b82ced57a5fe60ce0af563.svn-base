package com.yhb.dao;

import com.yhb.bean.entity.Agent;
import com.yhb.bean.entity.AgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentDao {
    int countByExample(AgentExample example);

    int deleteByExample(AgentExample example);

    int deleteByPrimaryKey(@Param("userid") String userid, @Param("username") String username);

    int insert(Agent record);
    
    Agent selectAgentByUserName(String userName);
    
    Agent selectAgentByUserId(String userId);

    int insertSelective(Agent record);

    List<Agent> selectByExample(AgentExample example);

    Agent selectByPrimaryKey(@Param("userid") String userid, @Param("username") String username);

    int updateByExampleSelective(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByExample(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
}
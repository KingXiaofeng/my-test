package com.yhb.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhb.bean.entity.Agent;
import com.yhb.bean.entity.AgentExample;
import com.yhb.bean.entity.AgentExample.Criteria;
import com.yhb.dao.AgentDao;
import com.yhb.service.user.AgentService;

/**
 * 
* @ClassName: AgentService.java
* @Description: 代理商信息接口
*
* @version: v1.0.0
* @author: wangxf
* @date: 2017年5月9日 下午4:41:24 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2017年5月9日     wangxf           v1.0.0               修改原因
 */
@Service
public class AgentServiceImpl implements AgentService{
	
	@Autowired
	AgentDao agentDao;

	/**
	 * 
	* @Function: AgentService.java
	* @Description: 获取代理商信息
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月9日 下午4:42:25 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月9日     wangxf           v1.0.0               修改原因
	 */
	@Override
	public List<Agent> selectAgentForExemple(){
		AgentExample example = new AgentExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserstateEqualTo(1);
		
		List<Agent> agentList = agentDao.selectByExample(example);
		return agentList;
	}
}

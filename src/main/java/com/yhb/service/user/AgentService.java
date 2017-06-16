package com.yhb.service.user;

import java.util.List;

import com.yhb.bean.entity.Agent;

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
public interface AgentService {

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
	List<Agent> selectAgentForExemple();
}

package com.yhb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yhb.requesturl.AgentInfRequestUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yhb.bean.entity.Agent;
import com.yhb.enums.ResultEnum;
import com.yhb.service.user.AgentService;
import com.yhb.util.json.SpringUtils;

/**
 * 
* @ClassName: AgentInfoController.java
* @Description: 获取代理商相关信息的Controller
*
* @version: v1.0.0
* @author: wangxf
* @date: 2017年5月9日 下午3:52:08 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2017年5月9日     wangxf           v1.0.0               修改原因
 */
@Controller
@RequestMapping(AgentInfRequestUrl.agent)
public class AgentInfoController {

	@Autowired
	AgentService agentService;
	/**
	 * 
	* @Function: AgentInfoController.java
	* @Description: 首页获取代理商信息
	*
	* @param: 
	* @return： 
	* @throws： 
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月9日 下午3:54:07 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月9日     wangxf           v1.0.0               修改原因
	 */
	@RequestMapping(AgentInfRequestUrl.getAgentMessage)
	public void getAgentMessage( HttpServletRequest request, HttpServletResponse response ){
		
		// 获取代理商信息列表
		List<Agent> agentList = agentService.selectAgentForExemple();
		
		if( null == agentList || agentList.size() < 1 ){
			SpringUtils.renderJsonResult(response, ResultEnum.AGENT_QUERY_ERROR.getCode(), ResultEnum.AGENT_QUERY_ERROR.getCodeDesc());
			return;
		}
		
		// 出参
		List<Map<String, Object>> returnList = new ArrayList<Map<String, Object>>();

		Map<String, Object> agentMap = null;
		
		for( Agent agent : agentList ){
			agentMap = new HashMap<String,Object>();
			// 地区
			agentMap.put("area", agent.getCityid());
			// 姓名
			agentMap.put("name", agent.getEmk1());
			// 手机号码
			agentMap.put("phone", agent.getUsername());
			// 头像
			agentMap.put("img", agent.getEmk4());
			// 等级 : 2:金牌，1：银牌，0：铜牌
			agentMap.put("level", agent.getLvlid());
			
			returnList.add(agentMap);
		}
		
		SpringUtils.renderJson(response, returnList);
	}
}

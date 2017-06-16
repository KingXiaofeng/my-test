/**
 * 
 */
package com.yhb.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: ProAuthenticationFilter.java
 * @Description: 重写authc过滤器
 * @author:Krx
 * @date: 2017年4月27日 下午1:12:46
 */
public class ProAuthenticationFilter extends AuthenticatingFilter {

	private final static Logger _log = LoggerFactory.getLogger(ProAuthenticationFilter.class);

	// 局部会话key
	private final static String YHB_SESSION_ID = "yhb-session-id";
	// 单点同一个code所有局部会话key
	private final static String YHB_SESSION_IDS = "yhb-session-ids";
	
//	@Autowired
	

	/**
	 * @see org.apache.shiro.web.filter.authc.AuthenticatingFilter#createToken(javax.servlet.ServletRequest,
	 *      javax.servlet.ServletResponse)
	 * @Function: ProAuthenticationFilter.java
	 * @Description: 该函数的功能描述
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年4月27日 下午1:13:04
	 */
	@Override
	protected AuthenticationToken createToken(ServletRequest arg0, ServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see org.apache.shiro.web.filter.AccessControlFilter#onAccessDenied(javax.servlet.ServletRequest,
	 *      javax.servlet.ServletResponse)
	 * @Function: ProAuthenticationFilter.java
	 * @Description: 该函数的功能描述
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年4月27日 下午1:13:04
	 */
	@Override
	protected boolean onAccessDenied(ServletRequest arg0, ServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}

/**
 * 
 */
package com.yhb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.yhb.bean.entity.AccountsUsers;
import com.yhb.service.user.AccountsUsersService;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: LoginInterceptor.java
 * @Description: 登录拦截器
 * @author:Krx
 * @date: 2017年4月27日 上午10:37:45
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

	private static Logger _log = LoggerFactory.getLogger(LoginInterceptor.class);

	 @Autowired
	 AccountsUsersService accountsUsersService;
	 

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 过滤ajax
		if (null != request.getHeader("X-Requested-With")
				&& request.getHeader("X-Requested-With").equalsIgnoreCase("XMLHttpRequest")) {
			return true;
		}
		System.out.println("sssss");
		// 登录信息
		Subject subject = SecurityUtils.getSubject();
		String username = (String) subject.getPrincipal();
		AccountsUsers users = accountsUsersService.selectUserByUserName(username);
		request.setAttribute("users", users);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		super.afterConcurrentHandlingStarted(request, response, handler);
	}

}

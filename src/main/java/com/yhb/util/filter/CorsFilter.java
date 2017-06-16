/**
 * 
 */
package com.yhb.util.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import com.yhb.bean.entity.BaseConfig;
import com.yhb.service.common.BaseConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: CorsFilter.java
* @Description: 跨域类
* @author:Krx
* @date: 2017年4月27日 下午6:56:12 
*/
@Component
public class CorsFilter implements Filter {

	/**
	* @see javax.servlet.Filter#init(javax.servlet.FilterConfig)  
	* @Function: CorsFilter.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年4月27日 下午6:57:01 
	*/
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	/** 
	* @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)  
	* @Function: CorsFilter.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年4月27日 下午6:57:01 
	*/
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) servletResponse;
//		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Origin", "http://www.yhb118.com");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "content-type");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		filterChain.doFilter(servletRequest, servletResponse);
	}

	/** 
	* @see javax.servlet.Filter#destroy()  
	* @Function: CorsFilter.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年4月27日 下午6:57:01 
	*/
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}

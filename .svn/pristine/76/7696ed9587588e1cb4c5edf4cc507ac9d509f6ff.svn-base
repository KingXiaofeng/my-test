/**
 * 
 */
package com.yhb.base;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.collect.Maps;
import com.yhb.util.json.SpringUtils;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yhb.util.RequestUtils;
import com.yhb.vo.CommonReturnFrontVo;

import sun.applet.resources.MsgAppletViewer;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: BaseController.java
 * @Description: BaseController基础类
 * @author:Krx
 * @date: 2017年4月27日 下午3:05:41
 */
public class BaseController {

	/**
	 * 提交给页面提示的错误信息
	 */
	protected static final String ERR_MSG = "ERR_MSG";
	/**
	 * 返回封装的实体类
	 */
	public static CommonReturnFrontVo returnVo = new CommonReturnFrontVo();

	/**
	 * 返回具体map
	 */
	public static Map<String, Object> returnMap = null;


	/**
	 * 封装的Object对象
	 */
	public static Object datas = null;
	/**
	 * 通用Code封装
	 */
	public static String code ="";
	/**
	 * 通用msg封装
	 */
	public static String msg ="";
	/**
	 * 通用token返回状态封装
	 */
	public static boolean status = false;
	/*
	 * 通用的token
	 */
	public static String token = "";
	
	/**
	 * 
	 * @Description: 内部方法重定向
	 *
	 * @author: Krx
	 * @date: 2017年4月27日 下午3:06:49
	 */
	public static String redirect(String format, Object... arguments) {
		return new StringBuffer("redirect:").append(MessageFormat.format(format, arguments)).toString();
	}


	/**
	 * 内部获取结果集返回空
	 * @param response
	 * @param param
	 */
	public boolean returnByMap(HttpServletResponse response,Map<String, Object> param) {
		if (returnMap.containsKey("code") && returnMap.containsKey("msg")) {
			return false;
		}
		return true;
	}
	/**
	 * 获取IP地址
	 * 
	 * @param request
	 * @return
	 */
	public String getIpAddr(HttpServletRequest request) {
		return RequestUtils.getIpAddr(request);
	}

	/**
	 * 
	 * @Description: 得到页面传递的参数封装成map
	 *
	 * @author: Krx
	 * @date: 2017年5月4日 上午9:29:26
	 */
	public Map<String, String> getParameters(HttpServletRequest request) {
		if (request == null) {
			request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		}
		Map<String, String> p = new HashMap<String, String>();
		Map req = request.getParameterMap();
		if ((req != null) && (!req.isEmpty())) {

			Collection keys = req.keySet();
			for (Iterator i = keys.iterator(); i.hasNext();) {
				String key = (String) i.next();
				Object value = req.get(key);
				Object v = null;
				if ((value.getClass().isArray()) && (((Object[]) value).length > 0)) {
					v = ((Object[]) value)[0];
				} else {
					v = value;
				}
				if ((v != null) && ((v instanceof String))) {
					String s = (String) v;
					if (s.length() > 0) {
						p.put(key, s);
					}
				}
			}
			// 读取cookie
			p.putAll(ReadCookieMap(request));
			return p;
		}
		return p;
	}
	
	
	/**
	 * 请求参数转换为map，不包含cookie
	 * @param request
	 * @return
	 */
	public Map<String, String> getParameterNoCk(HttpServletRequest request) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		Map req = request.getParameterMap();
		Map<String, String> p = new HashMap<String, String>();
		if ((req != null) && (!req.isEmpty())) {
			Collection keys = req.keySet();
			for (Iterator i = keys.iterator(); i.hasNext();) {
				String key = (String)i.next();
				Object value = req.get(key);
				Object v = null;
				if ((value.getClass().isArray())
						&& (((Object[]) value).length > 0)) {
					v = ((Object[]) value)[0];
				} else {
					v = value;
				}
				if ((v != null) && ((v instanceof String))) {
					String s = (String) v;
					if (s.length() > 0) {
						p.put(key, s);
					}
				}
			}
			return p;
		}
		return p;
	}

	/**
	 * 将cookie封装到Map里面
	 * 
	 * @param request
	 * @return
	 */
	private static Map<String, String> ReadCookieMap(HttpServletRequest request) {
		Map<String, String> cookieMap = new HashMap<String, String>();
		Cookie[] cookies = request.getCookies();
		if (null != cookies) {
			for (Cookie cookie : cookies) {
				cookieMap.put(cookie.getName(), cookie.getValue());
			}
		}
		return cookieMap;
	}

}

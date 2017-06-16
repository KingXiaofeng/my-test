package com.yhb.util.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yhb.base.BaseConstants;
import com.yhb.util.DateJsonValueProcessor;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

/**
 * 
 * @ClassName: SpringUtils.java
 * @Description: 对Spring输出信息格式的统一管理工具类
 *
 * @version: v1.0.0
 * @author: wangxf
 * @date: 2017年5月3日 上午11:18:04
 *
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* 2017年5月3日
 *        wangxf v1.0.0 修改原因
 */
public class SpringUtils {

	// header 常量定义
	private static final String ENCODING_PREFIX = "encoding";
	private static final String NOCACHE_PREFIX = "no-cache";
	private static final boolean NOCACHE_DEFAULT = true;
	private static JsonConfig config = new JsonConfig();
	private static Logger logger = LoggerFactory.getLogger(SpringUtils.class);

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 获得bean
	 *
	 * @param: Class<T>
	 *             clazz
	 * @param: String
	 *             name
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:19:11
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	/**
	 * 获得bean
	 * 
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz, String name) {
		return (T) WebApplicationContextUtils.getWebApplicationContext(ContextLoader.getCurrentWebApplicationContext().getServletContext()).getBean(name);
	}


	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 绕过jsp直接输出文本的函数—直接输出内容的简便函数
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             String contentType
	 * @param: final
	 *             String content
	 * @param: final
	 *             String... headers @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:20:15
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void render(HttpServletResponse response, final String contentType, final String content,
			final String... headers) {
		try {
			// 分析headers参数
			String encoding = BaseConstants.UTF8;
			boolean noCache = NOCACHE_DEFAULT;
			for (String header : headers) {
				String headerName = StringUtils.substringBefore(header, ":");
				String headerValue = StringUtils.substringAfter(header, ":");

				if (StringUtils.equalsIgnoreCase(headerName, ENCODING_PREFIX)) {
					encoding = headerValue;
				} else if (StringUtils.equalsIgnoreCase(headerName, NOCACHE_PREFIX)) {
					noCache = Boolean.parseBoolean(headerValue);
				} else
					throw new IllegalArgumentException(headerName + "不是一个合法的header类型");
			}
			// 设置headers参数
			String fullContentType = contentType + ";charset=" + encoding;
			response.setContentType(fullContentType);
			if (noCache) {
				response.setHeader("Pragma", "No-cache");
				response.setHeader("Cache-Control", "no-cache");
				response.setDateHeader("Expires", 0);
			}

			response.getWriter().write(content);
			response.getWriter().flush();

		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 绕过jsp直接输出文本的函数—直接输出文本
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             String text
	 * @param: final
	 *             String... headers @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:21:05
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderText(HttpServletResponse response, final String text, final String... headers) {
		render(response, "text/plain", text, headers);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 绕过jsp直接输出文本的函数—直接输出HTML
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             String html
	 * @param: final
	 *             String... headers @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:21:38
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderHtml(HttpServletResponse response, final String html, final String... headers) {
		render(response, "text/html", html, headers);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 绕过jsp直接输出文本的函数—直接输出XML
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             String xml
	 * @param: final
	 *             String... headers @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:22:04
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderXml(HttpServletResponse response, final String xml, final String... headers) {
		render(response, "text/xml", xml, headers);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 绕过jsp直接输出文本的函数—直接输出JSON格式
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             String
	 * @param: final
	 *             String... headers @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:22:34
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderJson(HttpServletResponse response, final String string, final String... headers) {
		render(response, "application/json", string, headers);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 绕过jsp直接输出文本的函数—直接输出JSON 将Map对象,将被转化为json字符串
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             Map
	 * @param: final
	 *             String @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:22:57
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	@SuppressWarnings("unchecked")
	public static void renderJson(HttpServletResponse response, final Map map, final String... headers) {
		config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		String jsonString = JSONObject.fromObject(map, config).toString();
		renderJson(response, jsonString, headers);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 直接输出JSON. Java对象,将被转化为json字符串
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             Object
	 * @param: final
	 *             String @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:24:49
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderJson(HttpServletResponse response, final Object object, final String... headers) {
		String jsonString = fromObject(object);
		renderJson(response, jsonString, headers);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 对象转换json格式字符串
	 *
	 * @param: Object
	 * 			@return： String @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:25:54
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static String fromObject(Object obj) {
		return JSONObject.fromObject(obj).toString();
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 将JSON串转换为Map
	 *
	 * @param: String
	 *             jsonStr @return： Map @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:27:21
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static Map<String, Object> parseJSON2Map(String jsonStr) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 最外层解析
		JSONObject json = JSONObject.fromObject(jsonStr);
		for (Object k : json.keySet()) {
			Object v = json.get(k);
			// 如果内层还是数组的话，继续解析
			if (v instanceof JSONArray) {
				List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
				Iterator<JSONObject> it = ((JSONArray) v).iterator();
				while (it.hasNext()) {
					JSONObject json2 = it.next();
					list.add(parseJSON2Map(json2.toString()));
				}
				map.put(k.toString(), list);
			} else {
				map.put(k.toString(), v);
			}
		}
		return map;
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: json字符串转换对象
	 *
	 * @param: String
	 *             jsonStr
	 * @param: Class
	 *             clazz @return： Object @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:28:14
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static Object toObject(String jsonStr, Class clazz) {

		List objList = JSONArray.toList(JSONArray.fromObject(jsonStr), clazz);
		if (objList.size() > 0) {
			return objList.get(0);
		} else {
			return null;
		}

	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: list 输出json
	 *
	 * @param: HttpServletResponse
	 * @param: final
	 *             List
	 * @param: final
	 *             String... headers @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:29:15
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderJson(HttpServletResponse response, final List object, final String... headers) {
		JSONArray json = JSONArray.fromObject(object);
		renderJson(response, json.toString(), headers);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: list 输出json
	 *
	 * @param: List<T>
	 *             list @return： String @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:30:47
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static <T> String formatListJson(List<T> list) {
		JsonConfig config = new JsonConfig();
		config.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		return JSONArray.fromObject(list, config).toString();
		// return JSONObject.fromObject(list,config).toString();
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 将查询状态转换为JSON，并直接以JSON格式输出
	 *
	 * @param: HttpServletResponse
	 * @param: String
	 *             code
	 * @param: String
	 *             message
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:32:06
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderJsonResult(HttpServletResponse response, int code, String message) {
		JsonResult rest = new JsonResult(code, message);

		SpringUtils.renderJson(response, rest);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 将查询状态转换为JSON，并直接以JSON格式输出
	 *
	 * @param: HttpServletResponse
	 * @param: String
	 *             code
	 * @param: String
	 *             message
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:32:06
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderJsonResultObJ(HttpServletResponse response, int code, Object message) {
		JsonResult rest = new JsonResult(code, message);

		SpringUtils.renderJson(response, rest);
	}

	/**
	 * 
	 * @Function: SpringUtils.java
	 * @Description: 将查询状态转换为JSON，并直接以JSON格式输出
	 *
	 * @param: HttpServletResponse
	 * @param: String
	 *             code
	 * @param: String
	 *             message
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月3日 上午11:32:06
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月3日 wangxf v1.0.0 修改原因
	 */
	public static void renderJsonResultToken(HttpServletResponse response, int code, Object message, String msg,
			String token) {
		JsonResult rest = new JsonResult(code, message, msg, token);

		SpringUtils.renderJson(response, rest);
	}

	/**
	 * 
	 * @Description:获取参数错误信息系统内部
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @author: Administrator
	 * @date: 2017年5月5日 上午10:25:46
	 */
	public static Object Message(int code, String message) {
		JsonResult rest = new JsonResult(code, message);
		return rest;
	}
	
	
	
}

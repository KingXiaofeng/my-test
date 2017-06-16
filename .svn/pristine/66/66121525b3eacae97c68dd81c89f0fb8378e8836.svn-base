package com.yhb.util;

import java.util.Date;
import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: PropertiesFileUtil.java
 * @Description: 资源文件读取工具
 * @author:Krx
 * @date: 2017年5月4日 上午10:53:53
 */
public class PropertiesFileUtil {

	// 当打开多个资源文件时，缓存资源文件
	private static HashMap<String, PropertiesFileUtil> configMap = new HashMap<String, PropertiesFileUtil>();
	// 打开文件时间，判断超时使用
	private Date loadTime = null;
	// 资源文件
	private ResourceBundle resourceBundle = null;
	// 默认资源文件名称
	private static final String NAME = "conf";
	// 缓存时间
	private static final Integer TIME_OUT = 60 * 1000;

	// 私有构造方法，创建单例
	private PropertiesFileUtil(String name) {
		this.loadTime = new Date();
		this.resourceBundle = ResourceBundle.getBundle(name);
	}

	public static synchronized PropertiesFileUtil getInstance() {
		return getInstance(NAME);
	}

	/**
	 * 
	* @Function: PropertiesFileUtil.java
	* @Description: 该函数的功能描述
	*
	* @param: String name 配置文件名文件名
	* @return：PropertiesFileUtil
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月4日 下午1:19:18 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月4日     wangxf           v1.0.0               修改原因
	 */
	public static synchronized PropertiesFileUtil getInstance(String name) {
		PropertiesFileUtil conf = configMap.get(name);
		if (null == conf) {
			conf = new PropertiesFileUtil(name);
			configMap.put(name, conf);
		}
		// 判断是否打开的资源文件是否超时1分钟
		if ((new Date().getTime() - conf.getLoadTime().getTime()) > TIME_OUT) {
			conf = new PropertiesFileUtil(name);
			configMap.put(name, conf);
		}
		return conf;
	}

	/**
	 * 
	* @Function: PropertiesFileUtil.java
	* @Description: 根据key读取value
	*
	* @param: String key 配置文件中的键值名
	* @return： String
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月4日 下午1:20:15 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月4日     wangxf           v1.0.0               修改原因
	 */
	public String get(String key) {
		try {
			String value = resourceBundle.getString(key);
			return value;
		} catch (MissingResourceException e) {
			return "";
		}
	}

	// 根据key读取value(整形)
	public Integer getInt(String key) {
		try {
			String value = resourceBundle.getString(key);
			return Integer.parseInt(value);
		} catch (MissingResourceException e) {
			return null;
		}
	}

	// 根据key读取value(布尔)
	public boolean getBool(String key) {
		try {
			String value = resourceBundle.getString(key);
			if ("true".equals(value)) {
				return true;
			}
			return false;
		} catch (MissingResourceException e) {
			return false;
		}
	}

	public Date getLoadTime() {
		return loadTime;
	}

}

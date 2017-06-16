package com.yhb.controller.Fy;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Logger;

public class RequestData {

	public static String createSignValue(Map map)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		String str = getSortMap(map);
		// System.out.println("after sort:........" + str);
//		return SecurityUtils.sign(str);
		return null;
	}

	private static String getSrcRegValue(List list) {
		Map map = new HashMap();
		NameValuePair pair;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); map.put(
				pair.getName(), pair.getValue()))
			pair = (NameValuePair) iterator.next();

		return getSortMap(map);
	}

	private static String getSortMap(Map map) {
		if (map.containsKey(null)) {
			map.remove(null);
		}
		System.out.println(map);
		StringBuilder sb = new StringBuilder();
		List mappingList = new ArrayList(map.entrySet());
		Collections.sort(mappingList,
				new Comparator<Map.Entry<String, String>>() {
					public int compare(Map.Entry<String, String> mapping1,
							Map.Entry<String, String> mapping2) {
						return mapping1.getKey().compareTo(mapping2.getKey());
					}
				});

		Map.Entry mapping;
		for (Iterator iterator = mappingList.iterator(); iterator.hasNext(); sb
				.append(((String) mapping.getValue() == null || "null"
						.equals((String) mapping.getValue())) ? ""
						: (String) mapping.getValue()).append("|"))
			mapping = (Map.Entry) iterator.next();

		Logger.getLogger(sb.toString());
		System.out.println(sb.toString().substring(0,
				sb.toString().length() - 1));
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	private static List getNameValuePair(Object parameters)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		List list = new ArrayList();
		Method ms[] = parameters.getClass().getMethods();
		for (int i = 0; i < ms.length; i++) {
			Method m = ms[i];
			String name = m.getName();
			if (name.startsWith("get")) {
				String param = name.substring(3, name.length());
				param = (new StringBuilder(String.valueOf(param.substring(0, 1)
						.toLowerCase()))).append(
						param.substring(1, param.length())).toString();
				if (!param.equals("class")) {
					Object value = "";
					value = m.invoke(parameters, null);
					NameValuePair nvp = new NameValuePair(param,
							value.toString());
					list.add(nvp);
				}
			}
		}

		return list;
	}

	/**
	 * 获取验签时需要拼接的密文
	 * 
	 * @param type
	 * @return
	 */
	public static String getStringSign(String type,
			Map<String, String> parameters) {
		String strBufSign = "";
		// 如果存在key
		if (FyConstants.SignOrgMap.containsKey(type)) {
			StringBuffer strBuf = new StringBuffer(); // 字符串链接
			String[] strSign = FyConstants.SignOrgMap.get(type); // 获取Map中的key
			for (int i = 0; i < strSign.length; i++) {
				String paramValue = parameters.get(strSign[i]);
				if (StringUtils.isBlank(paramValue)) {
					paramValue = "";
				}
				strBuf.append(paramValue).append("|");
			}
			strBufSign = strBuf.substring(0, strBuf.length() - 1);
		}
		return strBufSign;
	}

}

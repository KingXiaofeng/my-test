package com.yhb.controller.Fy;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Maps;
import com.yhb.common.WebClient;
import com.yhb.service.fy.HuanXunOrderInfoService;
import com.yhb.util.PropertiesFileUtil;
import com.yhb.util.SpringContextUtil;
import com.yhb.util.StringUtil;
import com.yhb.util.XmlConvertUtil;
import com.yhb.util.json.SpringUtils;

/**
 * 富友充值接口
 * 
 * @author Krx
 *
 */
public class DepositGateWay {
	public static Logger log = LoggerFactory.getLogger(DepositGateWay.class);
	// 提交地址
	public static final String URL = PropertiesFileUtil.getInstance("conf").get("Fy.URL");
	// Pc商户Id
	public static final String MCHNT_CD = PropertiesFileUtil.getInstance("conf").get("Fy.mchnt_cd");
	// Pc商户秘钥
	public static final String MCHNT_KEY = PropertiesFileUtil.getInstance("conf").get("Fy.mchnt_key");
	// app商户Id
	public static final String APP_CD = PropertiesFileUtil.getInstance("conf").get("Fy.APP.mchnt_cd");
	// app商户秘钥
	public static final String APP_KEY = PropertiesFileUtil.getInstance("conf").get("Fy.APP.mchnt_key");
	// app充值地址
	public static final String APPURL = PropertiesFileUtil.getInstance("conf").get("Fy.APP.URL");
	// 快速充值
	public static final String smpGateCommonRetUrl = PropertiesFileUtil.getInstance("conf")
			.get("FY.ZF.BgRetUrl.Common");
	// 支付结果查询
	public static final String smpQueryGateCommonRetUrl = PropertiesFileUtil.getInstance("conf")
			.get("FY.ZF.BgRetUrl.Commonc");
	// 其他查询
	public static final String otherCommonRetUrl = PropertiesFileUtil.getInstance("conf").get("FY.ZF.BgRetUrl.Commond");
	// 前台返回Url
	public static final String fontCommonRetUrl = PropertiesFileUtil.getInstance("conf")
			.get("FY.ZF.frontRetUrl.Common");

	@Autowired
	static HuanXunOrderInfoService hxOrderService;

	/**
	 * 
	 * @Description: 该方法拼接page_notify_url(前台返回的地址)和
	 *               back_notify_url(后端回调处理信息的地址)，自动接入秘钥和商户号
	 * 
	 *
	 * @param:判断请求参数是来源于前端或者是APP，当为Form提交时默认为Pc请求，
	 * 当为XML提交时默认为Json请求或者是App请求 目前的接口是快捷充值,查询充值结果是否成功/失败，退款申请。
	 * @return：Map
	 * @author: Krx
	 * @date: 2017年5月10日 下午1:49:32
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map dealRequest(Map params, String type) throws Exception {
		Map urlType = Maps.newHashMap();
		urlType.put("operationType", params.get(FyConstants.operationType));
		params.remove(FyConstants.operationType);
		// String basePath = RequestUtils.getRequestPath(null);
		String basePath = "http://15y81435q3.iok.la:39103";
		// String basePath = "http://www.yhb118.com";
		String md5 = "";
		String signDataStr = "";

		if (type == FyConstants.TYPE_FROM) {
			String serial = params.get(FyConstants.order_id).toString();
			params.put(FyConstants.mchnt_cd, MCHNT_CD); // 商户号(从数据库中拉取)
			params.put(FyConstants.order_id, serial);

			if (params.containsKey(FyConstants.order_amt)) {
				String money = FyConstants.isJzhMoney(String.valueOf(params.get(FyConstants.order_amt)));
				if (StringUtils.isNotBlank(money)) {
					params.put(FyConstants.order_amt, money);
				} else {
					log.error("money error");
					throw new RuntimeException("money form  error");
				}
			}

			// 后台通知：处理业务逻辑back_notify_url
			if (StringUtils.isNotBlank(urlType.get("operationType").toString())) {
				if (urlType.get("operationType").toString().equals(FyConstants.smpGate)) {
					params.put(FyConstants.back_notify_url, basePath + smpGateCommonRetUrl);
				} else if (urlType.get("operationType").equals(FyConstants.smpQueryGate)) {
					params.put(FyConstants.back_notify_url, basePath + smpQueryGateCommonRetUrl);
				} else {
					params.put(FyConstants.back_notify_url, basePath + otherCommonRetUrl);
				}
			}
			// 前台返回：展示页面page_notify_url
			if (StringUtils.isNotBlank(urlType.get("operationType").toString())) {
				params.put(FyConstants.page_notify_url, basePath + fontCommonRetUrl);
			}

			params.put(FyConstants.mchnt_key, MCHNT_KEY);

			// 拼接相对应请求的地址
			if (urlType.get("operationType").equals(FyConstants.smpGate)) {
				signDataStr = params.get(FyConstants.mchnt_cd) + "|" + params.get(FyConstants.order_id) + "|"
						+ params.get(FyConstants.order_amt) + "|" + params.get(FyConstants.order_pay_type) + "|"
						+ params.get(FyConstants.page_notify_url) + "|" + params.get(FyConstants.back_notify_url) + "|"
						+ "|" + params.get(FyConstants.iss_ins_cd) + "|" + "|" + "|" + "|" + params.get(FyConstants.ver)
						+ "|" + params.get(FyConstants.mchnt_key);
			} else if (urlType.get("operationType").equals(FyConstants.smpQueryGate)) {
				signDataStr = params.get(FyConstants.mchnt_cd) + "|" + params.get(FyConstants.order_id) + "|"
						+ params.get(FyConstants.order_amt) + "|" + params.get(FyConstants.order_pay_type) + "|"
						+ params.get(FyConstants.page_notify_url) + "|" + params.get(FyConstants.back_notify_url) + "|"
						+ "|" + params.get(FyConstants.iss_ins_cd) + "|" + "|" + "|" + "|" + params.get(FyConstants.ver)
						+ "|" + params.get(FyConstants.mchnt_key);
			} else {
				signDataStr = params.get(FyConstants.mchnt_cd) + "|" + params.get(FyConstants.order_id) + "|"
						+ params.get(FyConstants.order_amt) + "|" + params.get(FyConstants.order_pay_type) + "|"
						+ params.get(FyConstants.page_notify_url) + "|" + params.get(FyConstants.back_notify_url) + "|"
						+ "|" + params.get(FyConstants.iss_ins_cd) + "|" + "|" + "|" + "|" + params.get(FyConstants.ver)
						+ "|" + params.get(FyConstants.mchnt_key);
			}
			try {
				// MD5加密
				md5 = MD5.MD5Encode(signDataStr);
			} catch (Exception e) {
				log.error(e.toString());
			}
			log.info("签名密文" + md5);
			params.put(FyConstants.md5, md5); // 签名拼接信息
			log.info("post data:" + params);
		}
		params.put("gateWayUrl", URL + urlType.get("operationType")); // 请求地址
		if (type == FyConstants.TYPE_FROM) {
			params.remove(FyConstants.mchnt_key); // 去除秘钥
			StringUtil.replaceQuotes(params); // 替换逗号
			log.info("返回页面的post data:" + params);
			hxOrderService.addForRequest(params);
			return params;
		} else if (type == FyConstants.TYPE_XML) {
			Map app = Maps.newHashMap();
			app.put(FyConstants.MchntCd, APP_CD);
			app.put(FyConstants.mchnt_key, APP_KEY);
			try {
				String appMd5 = "";
				String appSign = "";
				if (urlType.get("operationType").equals(FyConstants.cardBinQuery)) {
					appSign = app.get(FyConstants.MchntCd) + "|" + params.get(FyConstants.Ono) + "|"
							+ app.get(FyConstants.mchnt_key);
				}
				appMd5 = MD5.MD5Encode(appSign);
				app.put(FyConstants.Ono, params.get(FyConstants.Ono));
				app.put(FyConstants.Sign, appMd5);
				System.out.println("post app data : " + app);
				String appL = APPURL + "/" + urlType.get("operationType");

				String s = XmlConvertUtil.map2Xml(app, "FM").replaceAll("\r\n", "").replaceAll(" ", "");
				String sm = s.substring(s.indexOf("<FM>"));
				Map p = Maps.newHashMap();
				p.put("FM", sm);
				System.out.println("将要发送的数据" + p);
				String ret = new WebClient().doPostFY(appL, p);

				System.out.println("返回的XML对象:" + ret);
				app = XmlConvertUtil.xml2Map(ret);
				System.out.println("转换XMl---->Java对象:" + app);
				hxOrderService.addForRequest(app);
				return app;
			} catch (Exception e) {
				e.printStackTrace();
				log.error("postHuifuParams error:" + params, e);
				throw new Exception("postHuifuParams error:" + params);
			}
		} else {
			throw new RuntimeException("postType(" + type + ") is error");
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map dealLimitQueryRequest(Map params) throws Exception {

		Map app = Maps.newHashMap();
		app.put(FyConstants.MCHNTCD, APP_CD);
		app.put(FyConstants.INSCD, params.get(FyConstants.INSCD));
		try {
			String appSign = app.get(FyConstants.MCHNTCD) + "|" + params.get(FyConstants.INSCD) + "|" + APP_KEY;
			String appMd5 = MD5.MD5Encode(appSign);
			app.put(FyConstants.SIGN, appMd5);

			System.out.println("post app data : " + app);
			String appURL = PropertiesFileUtil.getInstance("conf").get("Fy.APP.AmtLimit.URL");

			String s = XmlConvertUtil.map2Xml(app, "FM").replaceAll("\r\n", "").replaceAll(" ", "");
			String sm = s.substring(s.indexOf("<FM>"));
			Map p = Maps.newHashMap();
			p.put("FM", sm);
			System.out.println("将要发送的数据" + p);
			String ret = new WebClient().doPostFY(appURL, p);

			System.out.println("返回的XML对象:" + ret);
			app = XmlConvertUtil.xml2Map(ret);
			System.out.println("转换XMl---->Java对象:" + app);
			hxOrderService.updateForReturn(app);
			return app;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("postHuifuParams error:" + params, e);
			throw new Exception("postHuifuParams error:" + params);
		}
	}

	/**
	 * 客户订单结果查询接口
	 * 
	 * @param fParam
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map<String, String> dealQueryOrderIdRequest(Map<String, String> params) throws Exception {
		Map app = Maps.newHashMap();
		app.put(FyConstants.MchntCd, APP_CD);
		app.put(FyConstants.OrderId, params.get(FyConstants.OrderId));
		try {
			String appSign = app.get(FyConstants.MchntCd) + "|" + params.get(FyConstants.OrderId) + "|" + APP_KEY;
			String appMd5 = MD5.MD5Encode(appSign);
			app.put(FyConstants.Sign, appMd5);

			System.out.println("post app data : " + app);
			String appURL = PropertiesFileUtil.getInstance("conf").get("Fy.APP.QueryOrder.URL");

			String s = XmlConvertUtil.map2Xml(app, "FM").replaceAll("\r\n", "").replaceAll(" ", "");
			String sm = s.substring(s.indexOf("<FM>"));
			Map p = Maps.newHashMap();
			p.put("FM", sm);
			System.out.println("将要发送的数据" + p);
			String ret = new WebClient().doPostFY(appURL, p);

			System.out.println("返回的XML对象:" + ret);
			app = XmlConvertUtil.xml2Map(ret);
			System.out.println("转换XMl---->Java对象:" + app);
			hxOrderService.updateForReturn(app);
			return app;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("postHuifuParams error:" + params, e);
			throw new Exception("postHuifuParams error:" + params);
		}

	}

	/**
	 * encode params
	 * 
	 * @param params
	 * @param remark
	 */
	public static void encodeFields(Map<String, String> params, String remark) {
		String paramsStr = "";
		Iterator<Entry<String, String>> entrys = params.entrySet().iterator();
		while (entrys.hasNext()) {
			Entry<String, String> entry = entrys.next();
			try {
				if (!StringUtils.isEmpty(entry.getValue()))
					params.put(entry.getKey(), URLDecoder.decode(entry.getValue(), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			paramsStr += "&" + entry.getKey() + "=" + entry.getValue();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		log.debug(remark + " recv from fuyou-->" + paramsStr);
	}

}

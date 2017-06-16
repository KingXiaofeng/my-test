package com.yhb.common;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dahantc.api.sms.json.JSONHttpClient;
import com.yhb.util.PropertiesFileUtil;

import net.sf.json.JSONObject;

/**
 * 
* @ClassName: SendSMS.java
* @Description: 短信发送接口——大汉三通
* 0   提交成功 	
* 1   账号无效 		
* 2 密码错误 
* 3 msgid太长，不得超过32位 
* 5 手机号码个数超过最大限制(500个) 
* 6 短信内容超过最大限制(350字) 
* 7 扩展子号码无效 
* 8 定时时间格式错误 
* 14 手机号码为空 
* 19 用户被禁发或禁用 
* 20 ip鉴权失败
* 21 短信内容为空 
* 22 数据包大小不匹配 
* 98 系统正忙 
* 99 消息格式错误
*
* @version: v1.0.0
* @author: wangxf
* @date: 2017年5月4日 上午11:57:50 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2017年5月4日     wangxf           v1.0.0               修改原因
 */
public class SendSMS {

	private static final Logger LOG = LoggerFactory.getLogger(SendSMS.class);
	// 商户账号
	private static String account = "";
	// 密码（必填）
	private static String password = "";
	// 短信签名（必填）
	public static String sign = "【岚儒财富】";
	// 子号码（必填）
	public static String subcode = "";
	// 地址
	public static String url = "";
	// 营销账号
	public static String Yx_account ="";
	//营销密码
	public static String Yx_password ="";
	// 定时发送时间（可选)
	public static String sendtime = "";
	// 短信id，查询短信状态报告时需要，（可选）
	public static String msgid = UUID.randomUUID().toString().replace("-", ""); 
	
	static {
		PropertiesFileUtil propertiesFileUtil = PropertiesFileUtil.getInstance("conf");
		url = propertiesFileUtil.get("DH3T.uri");
		account = propertiesFileUtil.get("account");
		password = propertiesFileUtil.get("password");
		Yx_account = propertiesFileUtil.get("YX_account");
		Yx_password = propertiesFileUtil.get("YX_password");
	}
	
	/**
	 * 
	* @Function: SendSMS.java
	* @Description: 发送单条短信信息
	*
	* @param: String context 短信内容
	* @param: String phone 手机号码
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月4日 下午1:31:47 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月4日     wangxf           v1.0.0               修改原因
	 */
	public static void sendSingleSMS(String context, String phone){
		try {
			JSONHttpClient jsonHttpClient = new JSONHttpClient(url);
			jsonHttpClient.setRetryCount(1);
			String sendhRes = jsonHttpClient.sendSms(account, password, phone, context, sign, subcode);

			// JSONObject jsStr = JSONObject.fromObject(sendhRes);
			// //将字符串{“id”：1}
			// int jsID = Integer.parseInt(jsStr.getString("result"));//获取id的值
			LOG.info("提交单条普通短信响应：" + sendhRes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	* @Function: SendSMS.java
	* @Description: 单条短信发送（返回Int值）
	*
	* @param: String content 短信内容
	* @return： String phone 手机号码
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月4日 下午2:18:26 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月4日     wangxf           v1.0.0               修改原因
	 */
	public static int sendSingleSMSForInt(String content, String phone) {
		int jsID = -1;
		try {
			JSONHttpClient jsonHttpClient = new JSONHttpClient(url);
			jsonHttpClient.setRetryCount(1);
			String sendhRes = jsonHttpClient.sendSms(account, password, phone, content, sign, subcode);

			JSONObject jsStr = JSONObject.fromObject(sendhRes);
			jsID = Integer.parseInt(jsStr.getString("result"));

			LOG.info("提交单条普通短信响应：" + sendhRes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsID;
	}

	/**
	 * 
	* @Function: SendSMS.java
	* @Description: 多条短信发送（返回Int值）
	*
	* @param: String content 短信内容
	* @return： String phone 手机号码
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月4日 下午2:19:23 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月4日     wangxf           v1.0.0               修改原因
	 */
	public static int sendMultipleSMSForInt(String content, String phone) {
		int jsId = -1;
		try {
			JSONHttpClient jsonHttpClient = new JSONHttpClient(url);
			jsonHttpClient.setRetryCount(1);
			String sendhRes = jsonHttpClient.sendSms(Yx_account, Yx_password, phone, content, sign, subcode);
			JSONObject jsStr = JSONObject.fromObject(sendhRes);
			jsId = Integer.parseInt(jsStr.getString("result"));
			LOG.info("提交单条普通短信响应：" + sendhRes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsId;
	}
}

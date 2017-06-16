package com.yhb.controller;

import com.google.common.collect.Maps;
import com.octo.captcha.service.image.ImageCaptchaService;
import com.yhb.base.BaseController;
import com.yhb.bean.entity.AccountsUsers;
import com.yhb.bean.entity.AccountsUsersBalances;
import com.yhb.bean.entity.AppSmsVerify;
import com.yhb.bean.entity.BlackList;
import com.yhb.enums.ResultEnum;
import com.yhb.exception.business.SelectException;
import com.yhb.requesturl.LoginAndRegisterRequestUrl;
import com.yhb.service.common.AppSmsVerifyService;
import com.yhb.service.common.SendSmsInfoService;
import com.yhb.service.user.AccountsUsersBalancesService;
import com.yhb.service.user.AccountsUsersService;
import com.yhb.service.user.BlackListService;
import com.yhb.util.DesEncrypt;
import com.yhb.util.GenerateNo;
import com.yhb.util.StringUtil;
import com.yhb.util.cache.RedisCache;
import com.yhb.util.json.JsonResult;
import com.yhb.util.json.SpringUtils;
import com.yhb.validate.ParamCheckValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: LoginAndRegisterController.java
 * @Description: 注册和登录.
 * 
 * @author:Krx
 * @date: 2017年5月4日 上午9:17:38
 */
@Controller
@RequestMapping(LoginAndRegisterRequestUrl.inlet)
public class LoginAndRegisterController extends BaseController {

	private static Logger logger = LoggerFactory.getLogger(LoginAndRegisterController.class);
	private final static String nullMsg = "";

	@Autowired
	AccountsUsersService accountsUsersServices;
	@Autowired
	RedisCache cache;
	@Autowired
	ImageCaptchaService captchaService;
	@Autowired
	AppSmsVerifyService appSmsVerifyService;
	@Autowired
	SendSmsInfoService sendSmsInfoService;
	@Autowired
	BlackListService blackListService;
	@Autowired
	AccountsUsersBalancesService balanceService;

	/**
	 * 
	 * @Function: LoginAndRegisterController.java
	 * @Description: 发送手机验证码
	 *
	 * @param: HttpServletRequest
	 *             request
	 * @param: HttpServletResponse
	 *             response
	 * @param: Map<String,
	 *             String> param @return： @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月4日 下午2:27:35
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月4日 wangxf v1.0.0 修改原因
	 */
	@RequestMapping(LoginAndRegisterRequestUrl.sendPhoneVerifCode)
	public void sendPhoneVerifCode(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, String> param) {

		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {
				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		// 获取要发送的短信类型状态值，如果为空，则无法发送短信信息
		Integer state = Integer.parseInt(param.get("state"));
		// 获取用户手机号码
		String userPhone = param.get("account");
		// 发送短信验证码统一接口
		int sendSmsState = 98;
		sendSmsState = sendSmsInfoService.sendVerifySms(state, userPhone);

		// 判断短信是否发送成功，0：表示成功
		if (ResultEnum.getResultEnumByCode(sendSmsState).getCode() == 0) {
			SpringUtils.renderJsonResult(response, ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getCodeDesc());
		} else {
			SpringUtils.renderJsonResult(response, sendSmsState, ResultEnum.getResultEnumByCode(sendSmsState).getCodeDesc());
		}

	}

	/**
	 * 
	 * @Function: LoginAndRegisterController.java
	 * @Description: 用户注册
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月8日 下午2:57:53
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月8日 wangxf v1.0.0 修改原因
	 */
	@RequestMapping(LoginAndRegisterRequestUrl.register)
	private void register(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, String> param) {
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {
				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		// 邀请人手机号码：inviteCode（可以为空）
		String phoneCode = param.get("phoneCode");
		String picCode = param.get("picCode");
		String account = param.get("account");

		// 手机验证码是否正确
		if (!sendSmsInfoService.checkPhoneVerifCode(account, phoneCode)) {
			SpringUtils.renderJsonResult(response, ResultEnum.PHONECODE_ISERROR.getCode(),
					ResultEnum.PHONECODE_ISERROR.getCodeDesc());
			return;
		}

		// 图文验证码是否正确
		if (!validateSubmitJsonString(request, picCode)) {
			SpringUtils.renderJsonResult(response, ResultEnum.PICCODE_ISERROR.getCode(),
					ResultEnum.PICCODE_ISERROR.getCodeDesc());
			return;
		}

		// 注册时，判断用户是否为黑名单用户
		if (!checkPhoneIsBlack(account)) {
			SpringUtils.renderJsonResult(response, ResultEnum.BLACK_USER.getCode(),
					ResultEnum.BLACK_USER.getCodeDesc());
			return;
		}

		// 注册时，判断手机号码是否已经存在
		if (!checkPhoneIsExist(account)) {
			SpringUtils.renderJsonResult(response, ResultEnum.PHONECODE_ISEXIT.getCode(),
					ResultEnum.PHONECODE_ISEXIT.getCodeDesc());
			return;
		}
		// 标注来源路径
		param.put("type", "1");

		// 调用Service方法进行注册
		AccountsUsers user = accountsUsersServices.register(param);
		if (user != null) {
			// 直接登录
			String token = GenerateNo.getToken(user.getUserid());
			String cache_key = RedisCache.user_cache + RedisCache.TOKEN + token;
			// 登录时缓存token信息，存入有效时间
			AccountsUsers user_cache = cache.getCache(cache_key, AccountsUsers.class);
			if (user_cache == null) {
				cache.putCacheWithExpireTime(cache_key, user, RedisCache.CACHE_TIME);
			}

			SpringUtils.renderJsonResultToken(response, ResultEnum.SUCCESS.getCode(), getUserInfo(cache_key), "注册成功",
					token);
			return;
		} else {
			SpringUtils.renderJsonResult(response, JsonResult.FAIL, "系统繁忙中，请稍后再试");
		}

	}

	/**
	 * 
	 * @Function: LoginAndRegisterController.java
	 * @Description: 判断是否是黑名单用户, 是黑名单用户：flase，不是黑名单用户：true
	 *
	 * @param: String
	 *             account @return： boolean @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月8日 下午3:16:55
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月8日 wangxf v1.0.0 修改原因
	 */
	public boolean checkPhoneIsBlack(String account) {
		// 手机号码不能为空
		if (StringUtil.isBlank(account)) {
			return false;
		}

		List<BlackList> blackLists = blackListService.selectBlackListByAccount(account);

		if (null != blackLists && blackLists.size() > 0) {
			return false;
		}

		return true;
	}

	/**
	 * 
	 * @Function: LoginAndRegisterController.java
	 * @Description: 注册时，判断手机号码是否已经存在，存在：false，不存在：true
	 *
	 * @param:描述1描述 @return：
	 * @throws：@RequestBody Map<String, String> param
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月5日 下午1:55:54
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月5日 wangxf v1.0.0 修改原因
	 */
	public boolean checkPhoneIsExist(String account) {
		AccountsUsers user = accountsUsersServices.selectUserByUserName(account);

		if (user != null) {
			return false;
		}

		return true;
	}

	/**
	 * 
	 * @Description: 用户统一认证接口非SSO模式,登录成功后存入Redis，默认时长3600
	 *
	 * @param:account 账号
	 *                    password 密码
	 * 
	 * @return：Json{int code,Object obj,String getValidateInfo,String token}
	 * @author: Krx 
	 * @date: 2017年5月4日 下午1:03:53
	 */
	@RequestMapping(LoginAndRegisterRequestUrl.login)
	private void Login(HttpServletRequest request, HttpServletResponse response,@RequestBody Map<String, String> param) {
		try {
			// 验证参数工具类，当该map有值时说明验证失败
			Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
			if (retMap.size() > 0) {
				for (String keyName : retMap.keySet()) {
					String value = retMap.get(keyName);
					SpringUtils.renderJsonResultToken(response, Integer.parseInt(keyName), nullMsg, value, nullMsg);
					return;
				}
			}

			String account = param.get("account");
			String password = param.get("password");

			// 登陆时，判断用户是否为黑名单用户
			if (!checkPhoneIsBlack(account)) {
				SpringUtils.renderJsonResult(response, ResultEnum.BLACK_USER.getCode(),
						ResultEnum.BLACK_USER.getCodeDesc());
				return;
			}

			// 验证验证码是否正确
			AccountsUsers user = accountsUsersServices.selectUserByUserName(account);
			if (user != null) {
				// 验证密码是否正确
				if (DesEncrypt.checkPassword(user.getUserpassword(), password)) {
					String token = GenerateNo.getToken(user.getUserid());
					String cache_key = RedisCache.user_cache + RedisCache.TOKEN + token;
					// 登录时缓存token信息，存入有效时间
					AccountsUsers user_cache = cache.getCache(cache_key, AccountsUsers.class);
					if (user_cache == null) {
						cache.putCacheWithExpireTime(cache_key, user, RedisCache.CACHE_TIME);
					}

					SpringUtils.renderJsonResultToken(response, ResultEnum.SUCCESS.getCode(), getUserInfo(cache_key),
							"登陆成功", token);
					return;
				} else
					SpringUtils.renderJsonResultToken(response, ResultEnum.PASSWORD_ISERROR.getCode(), nullMsg,
							ResultEnum.PASSWORD_ISERROR.getCodeDesc(), nullMsg);
				return;

			} else
				SpringUtils.renderJsonResultToken(response, ResultEnum.USER_ISNULL.getCode(), nullMsg,
						ResultEnum.USER_ISNULL.getCodeDesc(), nullMsg);
			return;

		} catch (SelectException e) {
			logger.info(e.getMessage());
		}

	}

	/**
	 * 图文验证码
	 * 
	 * @param
	 * @param response
	 * @return
	 */
	public boolean validateSubmitForm(HttpServletRequest request, HttpServletResponse response) {
		try {
			return captchaService.validateResponseForID(request.getSession(false).getId(),
					request.getParameter("captcha").toLowerCase());
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 验证码
	 * 
	 * @param..JsonString
	 * @param.. response
	 * @return
	 */
	public boolean validateSubmitJsonString(HttpServletRequest request, String captcha) {
		try {
			return captchaService.validateResponseForID(request.getSession(false).getId(), captcha.toLowerCase());
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 
	 * @Description: 登录获取用户信息
	 *
	 * @author: Krx
	 * @date: 2017年5月6日 下午3:16:40
	 */
	public Map<String, Object> getUserInfo(String cache_key) {
		// 登录时缓存token信息，存入有效时间
		Map<String, Object> datasParam = Maps.newHashMap();
		AccountsUsers user_info_cache = cache.getCache(cache_key, AccountsUsers.class);
		if (user_info_cache != null) {
			String headImg = user_info_cache.getHeadimg() == null ? nullMsg : user_info_cache.getHeadimg();
  
			datasParam.put("name", user_info_cache.getUsername());  //账户名称
			datasParam.put("img", headImg);  //头像
			datasParam.put("level", String.valueOf(user_info_cache.getUserlevel() == 0 ? "普通" : "会员")); //等级
			//获取余额
			AccountsUsersBalances balance = balanceService.selectByUserId(user_info_cache.getUserid());
			datasParam.put("balance", balance == null ? 0.00 : balance.getUserbalance()); //余额
		}

		return datasParam;
	}

	/**
	 * 
	 * @Description: 用户退出系统
	 *
	 * @param:token
	 * @return：Json
	 * @author: Administrator
	 * @date: 2017年5月8日 下午2:17:45
	 */
	@RequestMapping(LoginAndRegisterRequestUrl.exit)
	public void exitSys(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, String> param) {
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {
				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}

		cache.deleteCache(RedisCache.user_cache + RedisCache.TOKEN + param.get("token"));

		SpringUtils.renderJsonResult(response, ResultEnum.SUCCESS.getCode(), "退出成功");

	}

	/**
	 * 
	 * @Description: 设置新的密码
	 *
	 * @param:param
	 * @return：Json
	 * @author: krx
	 * @date: 2017年5月9日 上午9:01:13
	 */
	@RequestMapping(LoginAndRegisterRequestUrl.setNewUserPassword)
	public void setNewUserPassword(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, String> param) {
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {
				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		if (sendSmsInfoService.checkPhoneVerifCode(param.get("account"), param.get("phoneCode"))) {
			// 标注为找回密码
			boolean flag = accountsUsersServices.updateUserInfo(param);

			if (flag) {
				SpringUtils.renderJsonResult(response, ResultEnum.SUCCESS.getCode(), "修改密码成功");
			} else {
				SpringUtils.renderJsonResult(response, ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getCodeDesc());
			}
		}else{
			SpringUtils.renderJsonResult(response, ResultEnum.ERROR.getCode(),"验证码错误");
		}
	}

	/**
	 * 
	 * @Function: LoginAndRegisterController.java
	 * @Description: 手机验证码验证 通过：true，不通过：false
	 *
	 * @param: String
	 *             account
	 * @param:String phoneCode
	 * 					@return： boolean 通过：true，不通过：false @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月4日 上午11:07:09
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月4日 wangxf v1.0.0 修改原因
	 */
	@RequestMapping(LoginAndRegisterRequestUrl.checkPhoneVerifCodeJson)
	public void checkPhoneVerifCodeJson(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, String> param) {
		String account = param.get("account");
		String phoneCode = param.get("phoneCode");

		// 手机号码，验证码不能为空
		if (StringUtil.isBlank(account) || StringUtil.isBlank(phoneCode)) {
			SpringUtils.renderJsonResult(response, ResultEnum.ERROR.getCode(), "手机号码或验证码为空");
		}

		// 通过手机号码获取验证码
		List<AppSmsVerify> appSmsVerifieList = appSmsVerifyService.selectByExample(account);

		if (null == appSmsVerifieList || appSmsVerifieList.size() < 1) {
			SpringUtils.renderJsonResult(response, ResultEnum.ERROR.getCode(), "验证码错误");
		}
		// 判断验证码是否正确
		if (phoneCode.equals(appSmsVerifieList.get(0).getVerify())) {
			SpringUtils.renderJsonResult(response, ResultEnum.SUCCESS.getCode(), "验证码正确");
		}

	}

}

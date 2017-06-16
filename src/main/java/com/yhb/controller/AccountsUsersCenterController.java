package com.yhb.controller;

import com.alibaba.fastjson.JSONObject;
import com.yhb.base.BaseConstants;
import com.yhb.base.BaseController;
import com.yhb.bean.entity.*;
import com.yhb.enums.ResultEnum;
import com.yhb.requesturl.AccountsUsersCenterRequestUrl;
import com.yhb.service.bank.BaseBankcardService;
import com.yhb.service.bank.BaseInterfaceBankService;
import com.yhb.service.bank.UsersBankCardErrorinfoService;
import com.yhb.service.common.BaseConfigService;
import com.yhb.service.common.ProfitTableService;
import com.yhb.service.common.SendSmsInfoService;
import com.yhb.service.current.AccountChangeinfoServie;
import com.yhb.service.current.AccountsRevenueMoneyService;
import com.yhb.service.current.DailyRevenueService;
import com.yhb.service.region.RegionInfoService;
import com.yhb.service.user.AccountsUsersBalancesService;
import com.yhb.service.user.AccountsUsersService;
import com.yhb.service.user.DealOrderService;
import com.yhb.util.DecimalUtils;
import com.yhb.util.StringUtil;
import com.yhb.util.bank.BankCardValidationUtil;
import com.yhb.util.cache.RedisCache;
import com.yhb.util.json.SpringUtils;
import com.yhb.validate.ParamCheckValidate;
import com.yhb.vo.BankAddUpdateDatasVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 *
 * @ClassName:_AccountsUsersCenterController.java
 * @Description: 用户中心
 * @author:Krx
 * @date: 2017年4月27日 下午3:05:11
 */
@Controller
@RequestMapping(AccountsUsersCenterRequestUrl.user)
public class AccountsUsersCenterController extends BaseController {

	@Autowired
	AccountsUsersService usersService;
	@Autowired
	RedisCache cache;
	@Autowired
	DealOrderService orderService;
	@Autowired
	AccountsUsersBalancesService balanceService;
	@Autowired
	ProfitTableService profitTableService;
	@Autowired
	BaseBankcardService bankService;
	@Autowired
	BaseInterfaceBankService baseInterfaceBankService;
	@Autowired
	DailyRevenueService dailyRevenueService;
	@Autowired
	SendSmsInfoService sendSmsInfoService;
	@Autowired
	BaseConfigService baseConfigService;
	@Autowired
	AccountChangeinfoServie accountChangeinfoServie;
	@Autowired
	RegionInfoService regionInfoService;
	@Autowired
	UsersBankCardErrorinfoService usersBankCardErrorinfoService;
	@Autowired
	AccountsRevenueMoneyService accountsRevenueMoneyService;
	@Autowired
	AccountsUsersService accountsUsersService;

	/**
	 *
	 * @Description: 个人中心
	 * @param: map
	 * @return：json,
	 @RequestBody Map<String, String> param
	  * @author: Krx
	 * @date: 2017年5月12日 上午9:25:55
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.info)
	public void getUserInfo(HttpServletResponse response,@RequestBody Map<String, String> param) {
		// 验证token 是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String, Object>();

			// 获取用户信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			// 用户昨日收益 yesterday 信息和累计收益 accumulate 总资产 total 可用余额：balance 冻结
			// freeze 活期宝 current 积分 points
			returnMap = profitTableService.getUserIncomeAnd(users.getUserid());
			// 用户余额 冻结金额 活期宝 积分 总资产
			AccountsUsersBalances balance = balanceService.selectByUserId(users.getUserid());

			BigDecimal total = balance.getUserbalance().add(balance.getUserfreeze()).add(balance.getUsercurrent());// 总资产
			returnMap.put("total", total.setScale(2,BigDecimal.ROUND_DOWN)); // 总资产
			returnMap.put("balance", balance.getUserbalance().setScale(2,BigDecimal.ROUND_DOWN)); // 余额
			returnMap.put("balance", balance.getUserfreeze().setScale(2,BigDecimal.ROUND_DOWN)); // 冻结金额
			returnMap.put("current", balance.getUsercurrent().setScale(2,BigDecimal.ROUND_DOWN)); // 活期金额
			returnMap.put("points", balance.getUserjifen()); // 用户积分

			returnVo.setStatus(true);
			returnVo.setDatas(returnMap);
		}
		SpringUtils.renderJson(response, returnVo);

	}


	/**
	 *
	 * @Description: 获取用户等级和认证信息
	 *
	 * @param:param
	 * @return：返回结果描述  ,
	 @RequestBody Map<String, String> param
	  * @author: Krx
	 * @date: 2017年5月12日 下午1:17:57
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.grade)
	public void getUserFourFactorIsOk(HttpServletResponse response,@RequestBody Map<String, String> param) {
		// 验证token 是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String, Object>();
			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);

			returnMap.put("idCard", users.getCardid() == null ? false : true);
			returnMap.put("bankCard", bankService.selectUserBankInfoByUserId(users.getUserid()) == null ? false : true);
			returnMap.put("payPwd ", users.getCheckpassword() == null ? false : true);
			returnMap.put("insur", users.getUserlevel() == 1 ? false : true);

			returnVo.setStatus(true);
			returnVo.setDatas(returnMap);

		}
		SpringUtils.renderJson(response, returnVo);
	}

	/**
	 *
	 * @Description: 获取用户活期宝信息
	 *
	 * @param:param,@RequestBody Map<String, String> paramo
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年5月12日 下午1:17:57
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.current)
	public void getCurrentTreasure(HttpServletResponse response,@RequestBody Map<String, String> param) {
		// 验证token 是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String, Object>();
			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			//获取用户活期宝
			AccountsUsersBalances balances = balanceService.selectByUserId(users.getUserid());
			if (StringUtil.isNotNull(balances)) {
				ProfitTable profitTable = profitTableService.getProfitByUserId(users.getUserid());

				returnMap.put("currBalance", balances.getUsercurrent()); //活期宝余额
				returnMap.put("yesterday", profitTable.getTodayHbtotal()); //根据静态字段获取用户的昨日活期宝收益
				returnMap.put("total", profitTable.getHbtotal()); //根据静态字段获取用户的累计活期宝收益

				DailyRevenue revenue = dailyRevenueService.getDailyRevenue(); //获取活期宝利率

				BigDecimal rate = BigDecimal.ZERO;
				if (StringUtil.isNotNull(revenue)) {
					rate = DecimalUtils.getYearRates(revenue.getRevenue().doubleValue());
				}
				returnMap.put("rate", rate); //活期宝利率

				returnVo.setStatus(true);
				returnVo.setDatas(returnMap);
			}
		}
		SpringUtils.renderJson(response, returnVo);
	}

	/**
	 *
	 * @Function: UserCenterController.java
	 * @Description: 银行卡管理：获取用户的银行卡信息
	 *
	 * @param:
	 * @return：
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月12日 下午2:25:24
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年5月12日     wangxf           v1.0.0               修改原因
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.back)
	public void getUserBackInfo(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, String> param){

		// 判断获取是否处于登陆状态
		if( null != param && StringUtil.isNotBlank( token = param.get("token")) && cache.tokenExit(token) ){
			//if( true ){
			// 用户处于登陆状态
			returnVo.setStatus(true);

			Map<String, Object> datasTemp = new HashMap<String,Object>();

			// 用户标记用于是否已经有银行卡了
			boolean flag = false;

			// 获取用户信息
			AccountsUsers accountsUsers = cache.getUserRedis(token, 1, AccountsUsers.class);

			BaseBankcard bankcard = bankService.selectUserBankInfoByUserId(accountsUsers.getUserid());

			// 81b176da-d45f-42be-bce3-72585cb19e16
			//BaseBankcard bankcard = bankService.selectUserBankInfoByUserId("81b176da-d45f-42be-bce3-72585cb19e16");

			// 如果用户已经 绑了卡，那就用户的 银行卡名称：name,银行卡号：card，用户名称：name打印输出
			if( null != bankcard ){
				flag = true;
				datasTemp.put("name", StringUtil.isBlank(bankcard.getBankname()) ? "" : bankcard.getBankname());
				datasTemp.put("card", bankcard.getBankcardnumber());
				datasTemp.put("user", StringUtil.isBlank(bankcard.getUsername()) ? "" : bankcard.getUsername());
			}

			datasTemp.put("flag", flag);
			datas = datasTemp;
			returnVo.setDatas(datas);
		}

		SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
	}

	/**
	 *
	 * @Function: AccountsUsersCenterController.java
	 * @Description: 点击更换银行卡信息
	 *
	 * @param:
	 * @return：
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月13日 下午4:23:11
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年5月13日     wangxf           v1.0.0               修改原因
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.updateUserBank)
	public void updateUserBankInfo(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, String> param){

		// 判断获取是否处于登陆状态
		if( null != param && StringUtil.isNotBlank( token = param.get("token")) && cache.tokenExit(token) ){

			status = true;
			returnVo.setStatus(status);


			// 获取用户信息
			AccountsUsers accountsUsers = cache.getUserRedis(token, 1, AccountsUsers.class);

			if( null == accountsUsers ){
				SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
				return;
			}

			// 获取用户银行卡信息
			BaseBankcard bankcard = bankService.selectUserBankInfoByUserId(accountsUsers.getUserid());


			//AccountsUsers accountsUsers = usersService.selectUserByPrimaryKey("B6869E70-50FE-4EFD-BCD8-33BB82747D92");
			//BaseBankcard bankcard = bankService.selectUserBankInfoByUserId("B6869E70-50FE-4EFD-BCD8-33BB82747D92");

			if( null == bankcard ){
				SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
				return;
			}

			Map<String,Object> datasTemp = new HashMap<String,Object>();

			datasTemp.put("name", accountsUsers.getTruename());		// 用户名，不可编辑
			datasTemp.put("idcard", accountsUsers.getCardid()); 	// 用户身份证号码
			datasTemp.put("branch", bankcard.getBankaddress());		// 分行信息
			datasTemp.put("subbranch", bankcard.getBankaddress2()); // 支行信息
			datasTemp.put("card", bankcard.getBankcardnumber());	// 银行卡号
			datasTemp.put("phone", accountsUsers.getTelphone()); 	// 预留手机号码

			// 查询银行卡列表
			datasTemp.put("bank", baseInterfaceBankService.getBankMapForJson(accountsUsers.getUserid()));

			// 省市信息

			datasTemp.put("pro", regionInfoService.getProMapForJson(accountsUsers.getUserid()));
			datas = datasTemp;

		}

		returnVo.setStatus(status);;
		returnVo.setDatas(datas);
		SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
	}

	/**
	 *
	 * @Function: AccountsUsersCenterController.java
	 * @Description: 获取可以绑定的银行信息
	 *
	 * @param:
	 * @return：
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月13日 下午3:33:53
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年5月13日     wangxf           v1.0.0               修改原因
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.banklist)
	public void getBankList(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, String> param){

		// 判断获取是否处于登陆状态
		if( null != param && StringUtil.isNotBlank( token = param.get("token")) && cache.tokenExit(token) ){

			returnVo.setStatus(true);

			// 查询银行卡列表
			List<BaseInterfaceBank> bankList = baseInterfaceBankService.selectBankList();

			List<Map<String, Object>> datasTemp = null;

			if( null != bankList && bankList.size() > 0 ){
				datasTemp = baseInterfaceBankService.getBankReturnJson(bankList);
			}

			datas = datasTemp;
			returnVo.setDatas(datas);
		}

		SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
	}

	/**
	 *
	 * @Function: AccountsUsersCenterController.java
	 * @Description: 获取省市列表
	 *
	 * @param:
	 * @return：
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月16日 下午1:21:57
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年5月16日     wangxf           v1.0.0               修改原因
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.citylist)
	public void getProvinceCityInfo( HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, String> param){

		if( null != param && StringUtil.isNotBlank( token = param.get("token")) && cache.tokenExit(token) ){
			List<Map<String, Object>> proAndCityInfoList = regionInfoService.getProAndCityInfo();
			datas = proAndCityInfoList;
		}

		returnVo.setStatus(status);
		returnVo.setDatas(datas);

		SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
	}

	/**
	 *
	 * @Function: AccountsUsersCenterController.java
	 * @Description: 添加银行卡信息接口
	 *
	 * @param:
	 * @return：
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月13日 下午3:33:53
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年5月13日     wangxf           v1.0.0               修改原因
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.addBank)
	public void addUserBankInfo( HttpServletRequest request, HttpServletResponse response , @RequestBody Map<String, String> param ){

		// 判断用户是否处于登陆状态
		if( null != param && StringUtil.isNotBlank( token = param.get("token")) && cache.tokenExit(token) ){

			status = true;

			// 验证参数工具类，当该map有值时说明验证失败
			Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
			if (retMap.size() > 0) {
				for (String keyName : retMap.keySet()) {
					String value = retMap.get(keyName);

					returnMap = new HashMap<>();
					returnMap.put("code", Integer.parseInt(keyName));
					returnMap.put("msg", value);

					datas = returnMap;
					returnVo.setDatas(datas);
					SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
					return;
				}
			}

			// 从Redis中获取用户对象
			AccountsUsers accountsUsers = cache.getUserRedis(token, 1, AccountsUsers.class);

			BankAddUpdateDatasVo bankInfo = JSONObject.toJavaObject(JSONObject.parseObject(param.get("datas")),
					BankAddUpdateDatasVo.class);

			// 银行卡绑定时的限制条件的开关是否打开 cfg_bankCardSwitch ：1 提交限制打开，0 提交限制关闭
			String bankCardSwitch = baseConfigService.selectByParam("cfg_bankCardSwitch").getRes1();

			// 如果需要绑卡验证，则进行验证
			Integer checkResult = null;
			if( StringUtil.isNotBlank(bankCardSwitch) && "1".equals(bankCardSwitch) ){
				checkResult = bankService.checkForTieBankCard(accountsUsers, bankInfo,bankInfo.getType());
			}

			if ( null != checkResult && checkResult != 200 ) {
				returnMap = new HashMap<>();
				returnMap.put("code", checkResult);
				returnMap.put("msg",  ResultEnum.getResultEnumByCode(checkResult).getCodeDesc());

				BaseController.datas = returnMap;
				returnVo.setDatas(BaseController.datas);
				SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
				return;
			}

			// 绑卡实名制认证开关 ：1 打开，0 关闭
			String certifySwitch = baseConfigService.selectByParam("cfg_certificationSwitch").getValue();
			Map<String, Object> verifyMap = null;
			// 标记是否四要素认证是否成功
			boolean flag = true;
			if( StringUtil.isNotBlank(certifySwitch) && "1".equals(certifySwitch) ){
				// 调用四要素认证接口
				try {
					verifyMap = BankCardValidationUtil.bankCardVerifyByFourFactors(bankInfo.getIdCard(),
							bankInfo.getTrueName(), bankInfo.getCardId(), bankInfo.getTelPhone());

					// 判断是否绑卡成功，如果不成功，则保存到错误表
					if ( null == verifyMap || !BaseConstants.RES_SUCCESS_CODE.equals(verifyMap.get("code"))) {

						flag = false;

						//记录提交的错误信息
						UsersBankCardErrorinfo bankErrorInfo = new UsersBankCardErrorinfo();
						bankErrorInfo.setUserId(accountsUsers.getUserid());
						bankErrorInfo.setTrueName(bankInfo.getTrueName());
						bankErrorInfo.setIdCard(bankInfo.getIdCard());
						bankErrorInfo.setBankCard(bankInfo.getCardId());
						bankErrorInfo.setTelphone(bankInfo.getTelPhone());
						bankErrorInfo.setBankName(bankInfo.getBankId());
						bankErrorInfo.setProvince(bankInfo.getProId());
						bankErrorInfo.setCity(bankInfo.getCityId());
						bankErrorInfo.setBankAddress(bankInfo.getBranch());
						bankErrorInfo.setBankAddress2(bankInfo.getSubbranch());
						bankErrorInfo.setCreateTime(new Date());
						if(null != verifyMap){
							bankErrorInfo.setOperator("用户绑卡：" + verifyMap.get("code") + ": " + verifyMap.get("msg"));

							returnMap = new HashMap<>();
							returnMap.put("code", verifyMap.get("code"));
							returnMap.put("msg",  verifyMap.get("msg"));

							BaseController.datas = returnMap;
						}else {
							bankErrorInfo.setOperator("用户绑卡：调用绑卡接口出错");
						}

						usersBankCardErrorinfoService.saveBankErrorInfo(bankErrorInfo);

					}
				} catch (Exception e) {
					e.printStackTrace();
					returnMap = new HashMap<>();
					returnMap.put("code", ResultEnum.BANKCARD_CHECK_CALLAPI_FAIL.getCode());
					returnMap.put("msg",  ResultEnum.BANKCARD_CHECK_CALLAPI_FAIL.getCodeDesc());

					BaseController.datas = returnMap;
				}
			}

			if ( flag ) {
				boolean b = bankService.bankInfoSetAttribute(accountsUsers, bankInfo);

				if( !b ){
					returnMap = new HashMap<>();
					returnMap.put("code", ResultEnum.BANKCARD_INFO_SAVE_ERROR.getCode());
					returnMap.put("msg",  ResultEnum.BANKCARD_INFO_SAVE_ERROR.getCodeDesc());

					BaseController.datas = returnMap;
				}
			}

		}

		// 用户的登陆状态
		returnVo.setStatus(status);
		// 出参数据
		returnVo.setDatas(datas);

		SpringUtils.renderJson(response, JSONObject.toJSONString(returnVo));
	}

	/**
	 *
	 * @Description: 获取用户活期宝转入记录
	 *
	 * @param:param,@RequestBody Map<String, String> paramo
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年5月12日 下午1:17:57
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.intolist)
	public void getUserCurrentIntoList(HttpServletResponse response,@RequestBody Map<String, String> param){
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {

				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		//验证token是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String,Object>();

			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			returnMap = ParamCheckValidate.getDatasMapValue(param);
			//设置1为转入
			returnMap.put("type", 1);
			returnMap.put("userId", users.getUserid());
			//得到List
			List<AccountChangeinfo> accountChangeinfoList = accountChangeinfoServie.getAccountChangeinfoList(returnMap);

			returnVo.setStatus(true);
			datas = accountChangeinfoList;
			returnVo.setDatas(datas);
		}
		SpringUtils.renderJson(response, returnVo);
	}


	/**
	 *
	 * @Description: 获取用户活期宝转入记录条数
	 *
	 * @param:param,@RequestBody Map<String, String> paramo
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年5月12日 下午1:17:57
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.intocount)
	public void getUserCurrentIntoCount(HttpServletResponse response,@RequestBody Map<String, String> param){
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {

				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		//验证token是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String,Object>();

			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			returnMap = ParamCheckValidate.getDatasMapValue(param);
			//设置1为转入
			returnMap.put("type", 1);
			returnMap.put("userId", users.getUserid());
			//得到count记录总数
			int count  = accountChangeinfoServie.countAccountChangeInfoTotal(returnMap);

			returnMap.clear();
			returnMap.put("total", count);
			returnVo.setStatus(true);
			returnVo.setDatas(returnMap);
		}
		SpringUtils.renderJson(response, returnVo);
	}


	/**
	 *
	 * @Description: 获取用户活期宝转出记录
	 *
	 * @param:param,@RequestBody Map<String, String> paramo
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年5月12日 下午1:17:57
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.outlist)
	public void getUserCurrentOutList(HttpServletResponse response,@RequestBody Map<String, String> param){
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {

				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		//验证token是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String,Object>();

			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			returnMap = ParamCheckValidate.getDatasMapValue(param);
			//设置1为转入
			returnMap.put("type", 2);
			returnMap.put("userId", users.getUserid());
			//得到List
			List<AccountChangeinfo> accountChangeinfoList = accountChangeinfoServie.getAccountChangeinfoList(returnMap);


			returnVo.setStatus(true);
			returnVo.setDatas(accountChangeinfoList);
		}
		SpringUtils.renderJson(response, returnVo);
	}

	/**
	 *
	 * @Description: 获取用户活期宝转出记录条数
	 *
	 * @param:param,@RequestBody Map<String, String> paramo
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年5月12日 下午1:17:57
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.outcount)
	public void getUserCurrentOutCount(HttpServletResponse response,@RequestBody Map<String, String> param){
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {

				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		//验证token是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String,Object>();

			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			returnMap = ParamCheckValidate.getDatasMapValue(param);
			//设置1为转入
			returnMap.put("type", 2);
			returnMap.put("userId", users.getUserid());
			//得到count记录总数
			int count  = accountChangeinfoServie.countAccountChangeInfoTotal(returnMap);

			returnMap.clear();
			returnMap.put("total",count);
			returnVo.setStatus(true);
			returnVo.setDatas(returnMap);
		}
		SpringUtils.renderJson(response, returnVo);
	}

	/**
	 *
	 * @Description: 获取用户活期宝收益记录
	 *
	 * @param:param ,@RequestBody Map<String, String> param
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年5月19日
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.profitlist)
	public void getUserCurrentProfitList(HttpServletResponse response,@RequestBody Map<String, String> param){
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {

				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		//验证token是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String,Object>();

			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			returnMap = ParamCheckValidate.getDatasMapValue(param);
			//设置1为转入
			returnMap.put("userId", users.getUserid());
			//得到List
			List<AccountsRevenueMoney> accountsRevenueMoneyList = accountsRevenueMoneyService.getAccountsRevenueMoneyList(returnMap);

			datas = accountsRevenueMoneyList;
			returnVo.setStatus(true);
			returnVo.setDatas(datas);
		}
		SpringUtils.renderJson(response, returnVo);
	}

	/**
	 *
	 * @Description: 获取用户活期宝收益记录
	 *
	 * @param:param ,@RequestBody Map<String, String> param
	 * @return：返回结果描述
	 * @author: Krx
	 * @date: 2017年5月19日
	 */
	@RequestMapping(AccountsUsersCenterRequestUrl.profitcount)
	public void getUserCurrentProfitCount(HttpServletResponse response,@RequestBody Map<String, String> param){
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {

				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}
		//验证token是否存在
		if (cache.tokenExit(param.get("token"))) {
			returnMap = new HashMap<String,Object>();

			// 获取用户等级信息
			AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
			returnMap = ParamCheckValidate.getDatasMapValue(param);
			//设置1为转入
			returnMap.put("userId", users.getUserid());
			//得到List
			int count = accountsRevenueMoneyService.countRevenue(returnMap);

			returnMap.clear();
			returnMap.put("total",count);
			returnVo.setStatus(true);
			returnVo.setDatas(returnMap);
		}
		SpringUtils.renderJson(response, returnVo);
	}

}

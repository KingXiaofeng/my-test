/**
 * 
 */
package com.yhb.controller;

import com.yhb.base.BaseController;
import com.yhb.bean.entity.AccountChangeinfo;
import com.yhb.bean.entity.AccountsUsers;
import com.yhb.enums.ResultEnum;
import com.yhb.requesturl.ChangeMoneyRequestUrl;
import com.yhb.service.current.AccountChangeinfoServie;
import com.yhb.service.deposit.FySendService;
import com.yhb.service.user.DealCheckService;
import com.yhb.service.user.DealOrderService;
import com.yhb.util.OrderNoUtils;
import com.yhb.util.cache.RedisCache;
import com.yhb.util.json.SpringUtils;
import com.yhb.validate.ParamCheckValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 *
 * @ClassName: ChangeMoneyController.java
 * @Description: 用户修改账户金额
 * @author:Krx
 * @date: 2017年5月10日 下午5:26:29
 */
@Controller
@RequestMapping(ChangeMoneyRequestUrl.pay)
public class ChangeMoneyController extends BaseController {


	@Autowired
	RedisCache cache;
	@Autowired
	DealOrderService dealOrderService;
	@Autowired
	FySendService fySendService;
	@Autowired
	DealCheckService dealCheckService;
	@Autowired
	AccountChangeinfoServie accountChangeinfoServie;

	/**
	 * To deposit.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param param    the param
	 * @Description: 充值
	 * @param: Pc充值接口
	 * @return：json
	 * @author: Krx
	 * @date: 2017年5月9日 下午12:17:34        ,
	 */
	@RequestMapping(ChangeMoneyRequestUrl.toDeposit)
	public void toDeposit(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, String> param) {
		// 前台传入 token bankCode trdAmt
		// 验证参数工具类，当该map有值时说明验证失败
		Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
		if (retMap.size() > 0) {
			for (String keyName : retMap.keySet()) {
				String value = retMap.get(keyName);
				SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
				return;
			}
		}

		String token = param.get("token");
		// 来源
		param.put("type", "1");
		// 验证token是否存在
		Map<String, String> postMap = new HashMap<>();
		try {
			if (cache.tokenExit(token)) {
				String order_id = OrderNoUtils.makeOrderNo();
				Map<String, String> paramMap = new HashMap<String, String>();

				param.put("order_id", order_id);
				boolean flag = dealOrderService.insertDealOrder(param);

				if (flag) {
					String bankCode = "0803030000", trdAmt = "100.01";

					paramMap.put("order_amt", trdAmt);// 充值金额
					paramMap.put("iss_ins_cd", bankCode); // 充值银行代码
					paramMap.put("order_id", order_id); // 订单Id

					postMap = fySendService.smpGate(paramMap);
					returnVo.setStatus(true);
					returnVo.setDatas(postMap);
				} else {
					postMap.put("code", String.valueOf(ResultEnum.ERROR.getCode()));
					postMap.put("msg", "充值失败,系统错误");
					returnVo.setStatus(true);
					returnVo.setDatas(postMap);
				}
			} 
		} catch (Exception e) {
			postMap.put("code", String.valueOf(ResultEnum.ERROR.getCode()));
			postMap.put("msg", "系统错误");
			returnVo.setStatus(true);
			returnVo.setDatas(postMap);
			e.printStackTrace();
		}finally {
			SpringUtils.renderJson(response, returnVo);
		}
	}


	/**
	 * To withdraw.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param param    the param
	 * @Description: PC提现申请
	 * @param:Map<String,String> param
	 * @return：Json
	 * @author: Krx
	 * @date: 2017年5月10日 下午5:33:54
	 */
	@RequestMapping(ChangeMoneyRequestUrl.toWithdraw)
	public void toWithdraw(HttpServletRequest request, HttpServletResponse response,
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
		// 验证token 是否存在
		Map<String, Object> returnMap =  new HashMap<>();
		try {
			if (cache.tokenExit(param.get("token"))) {
				if (cache.IpExit(this.getIpAddr(request))) {
					//获取datas数据集
					returnMap = ParamCheckValidate.getDatasMapValue(param);
					returnMap.put("token", param.get("token"));
					//提现
					// money payPwd token
//					datas = dealCheckService.UserWithdraw(returnMap);
				}else{
					returnMap.put("code", String.valueOf(ResultEnum.ERROR.getCode()));
					returnMap.put("msg", "您的操作过于频繁，请稍后再次尝试");
					datas = returnMap;
				}
				returnVo.setStatus(true);
				returnVo.setDatas(datas);
			}
		} catch (Exception e) {
			returnMap.put("code", String.valueOf(ResultEnum.ERROR.getCode()));
			returnMap.put("msg", "系统错误");
			returnVo.setStatus(true);
			returnVo.setDatas(returnMap);
			e.printStackTrace();
		}finally {
			SpringUtils.renderJson(response, returnVo);
		}
	}

	/**
	 * changecurrent
	 *
	 * @param request  the request
	 * @param response the response
	 * @param param    the param
	 * @Description:  活期宝转入转出
	 * @param:Map<String,String> param
	 * @return：Json
	 * @author: Krx
	 * @date: 2017年5月19日 上午10:13:54
	 */
	@RequestMapping(ChangeMoneyRequestUrl.changecurrent)
	public void changeCurrent(HttpServletRequest request, HttpServletResponse response,
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
		// 验证token 是否存在
		Map<String, Object> returnMap =  new HashMap<String, Object>();
		try {
			if (cache.tokenExit(param.get("token"))) {
				if (cache.IpExit(this.getIpAddr(request))) {
					//获取datas数据集
					returnMap = ParamCheckValidate.getDatasMapValue(param);
					returnMap.put("token", param.get("token"));
					//活期转入转出金额
					//type money payPwd token
					datas = accountChangeinfoServie.changeCurrent(returnMap);
				}else{
					returnMap.put("code", String.valueOf(ResultEnum.ERROR.getCode()));
					returnMap.put("msg", "您的操作过于频繁，请稍后再次尝试");
					datas = returnMap;
				}
				returnVo.setStatus(true);
				returnVo.setDatas(datas);
			}
		}catch (Exception e) {
			returnMap.put("code", String.valueOf(ResultEnum.ERROR.getCode()));
			returnMap.put("msg", "系统错误");
			returnVo.setStatus(true);
			returnVo.setDatas(returnMap);
			e.printStackTrace();
		}finally {
			SpringUtils.renderJson(response, returnVo);
		}
	}



}

/**
 * 
 */
package com.yhb.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yhb.requesturl.FyDepositRequestUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yhb.base.BaseController;
import com.yhb.bean.entity.HxOrderInfo;
import com.yhb.controller.Fy.FyConstants;
import com.yhb.service.deposit.FyResvService;
import com.yhb.service.fy.HuanXunOrderInfoService;
import com.yhb.util.json.SpringUtils;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: FyDepositController.java
 * @Description: 富友回调接口
 * @author:Krx
 * @date: 2017年5月10日 下午1:33:40
 */
@Controller
@RequestMapping(FyDepositRequestUrl.Fy)
public class FyDepositController extends BaseController {

	@Autowired
	HuanXunOrderInfoService HxOrderInfoService;
	@Autowired
	FyResvService fyResvService;

	private static Logger logger = LoggerFactory.getLogger(FyDepositController.class);
	private static String page = "index";

	@RequestMapping(FyDepositRequestUrl.bgReturn)
	public void fySmpGateBackReturn(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = super.getParameters(request);
		try {
			//根据订单号查询唯一订单信息，存在则不回调信息，防止多次回调，不存在则回调
			HxOrderInfo orderInfo = HxOrderInfoService.selectByipsBillNo(params.get(FyConstants.Fy_ssn));
			if (orderInfo != null) {

			} else {
				HxOrderInfoService.updateForNotify(params);// 更新数据库
				if (params.get(FyConstants.order_pay_code).equals(FyConstants.success_code)) {
					Long startTime = System.currentTimeMillis();
					fyResvService.smpGate(params);
					Long endTime = System.currentTimeMillis();
					logger.debug("invoke method smpGate  time is " + (endTime - startTime) + " ms");
					
					SpringUtils.renderText(response, "OK");
				}
			}
		} catch (Exception e) {
			logger.info("fali to check sign:minwen：" + params + "，yuanwen" + params);
		}

	}
	@RequestMapping(FyDepositRequestUrl.frontReturn)
	public String fySmpGateFrontReturn(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, String> params = this.getParameterNoCk(request);
		String errMsg = "";

		if (params.get(FyConstants.order_pay_error) != null) {
			errMsg = params.get(FyConstants.order_pay_error);
			logger.error("错误信息:" + errMsg + "出错时间:" + System.currentTimeMillis());
		}
		try {
			String code = params.get(FyConstants.order_pay_code);
			if (FyConstants.success_code.equals(code)) {
				model.addAttribute("code", "succeed");
				HxOrderInfoService.updateForReturn(params);// 更新数据库
			} else {
				String msg = params.get(FyConstants.order_pay_error);
				
				logger.error("错误信息:" + msg + "出错时间:" + System.currentTimeMillis() + "错误代码" + code);
				model.addAttribute("code", "faild");
			}
		} catch (Exception e) {
			logger.error("bgReturn error:" + params, e);
		}
		return page;
	}

}

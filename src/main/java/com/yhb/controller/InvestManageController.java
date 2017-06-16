/**
 * 
 */
package com.yhb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yhb.requesturl.InvestRequestUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.common.collect.Lists;
import com.yhb.base.BaseController;
import com.yhb.enums.ResultEnum;
import com.yhb.service.product.FinanceproductsAdminService;
import com.yhb.service.product.FinanceproductsUsersService;
import com.yhb.util.StringUtil;
import com.yhb.util.cache.RedisCache;
import com.yhb.util.json.SpringUtils;
import com.yhb.validate.ParamCheckValidate;
import com.yhb.vo.UserInvestRecordListVo;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: InvestManageController.java
 * @Description: 我要理财
 * @author:Krx
 * @date: 2017年5月11日 下午3:40:19
 */
@Controller
@RequestMapping(InvestRequestUrl.invest)
public class InvestManageController extends BaseController {

	@Autowired
	FinanceproductsAdminService finAdminService;
	@Autowired
	FinanceproductsUsersService finUserService;
	@Autowired
	RedisCache cache;

	/**
	 * 
	 * @Description: 首页理财产品  主推或秒杀
	 *
	 * @param: request
	 * @return：Json
	 * @author: Krx
	 * @date: 2017年5月11日 下午3:42:45
	 */
	@RequestMapping(InvestRequestUrl.center)
	public void investCenter(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> resultMap = new HashMap<>();
		Map<String, Object> mainMap = new HashMap<>();
		List<Map<String, Object>> resultList = new ArrayList<>();

		if (finAdminService.getMainParo().size() > 0) {
			mainMap = finAdminService.getMainParo();
		}

		if (finAdminService.getIndexPro().size() > 0) {
			resultList = finAdminService.getIndexPro();
		}

		resultMap.put("main", mainMap);
		resultMap.put("list", resultList);

		SpringUtils.renderJson(response, resultMap);

	}


	/**
	 * 
	 * @Description: 产品信息
	 *
	 * @param: request
	 * @return：Json
	 * @author: Krx
	 * @date: 2017年5月11日 下午3:42:45
	 */
	@RequestMapping(InvestRequestUrl.proInfo)
	public void getProDes(HttpServletResponse response,@RequestBody Map<String,String> param ) {
        if(StringUtil.isNotBlank(param.get("id"))){
			returnMap = finAdminService.getProDeatil(Integer.parseInt(param.get("id")));
			SpringUtils.renderJson(response, returnMap);
		}else{
        	SpringUtils.renderJsonResult(response, ResultEnum.ERROR.getCode(),"查询产品Id为空");
        }
	}


	/**
	 *
	 * @Description: 产品详情信息
	 *
	 * @param: request
	 * @return：Json
	 * @author: Krx
	 * @date: 2017年5月11日 下午3:42:45
	 */
	@RequestMapping(InvestRequestUrl.record)
	public void getInvestRecord(HttpServletResponse response,@RequestBody Map<String,String> param) {
		if(StringUtil.isNotBlank(param.get("id"))){
			List<UserInvestRecordListVo> recordListVos  = Lists.newArrayList();
			recordListVos = finUserService.getUserInvestmentRecords(Integer.parseInt(param.get("id")));
			SpringUtils.renderJson(response, recordListVos);
		}else{
			SpringUtils.renderJsonResult(response, ResultEnum.ERROR.getCode(),"查询产品Id为空");
		}
	}


	/**
	 *
	 * @Description: 购买产品
	 *
	 * @param: request
	 * @return：Json
	 * @author: Krx
	 * @date: 2017年5月11日 下午3:42:45
	 */
	@RequestMapping(InvestRequestUrl.buyPro)
	public void buyPro(HttpServletResponse response,
					   @RequestBody Map<String, String> param) {
		SpringUtils.renderJson(response, returnVo);
	}

}

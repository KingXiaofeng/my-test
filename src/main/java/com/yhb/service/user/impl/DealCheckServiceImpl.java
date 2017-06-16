/**
 * 
 */
package com.yhb.service.user.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.bean.entity.AccountsUsers;
import com.yhb.dao.DealCheckDao;
import com.yhb.enums.ResultEnum;
import com.yhb.service.user.AccountsUsersBalancesService;
import com.yhb.service.common.BaseConfigService;
import com.yhb.service.user.DealCheckService;
import com.yhb.util.cache.RedisCache;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: DealCheckServiceImpl.java
 * @Description: 提现
 * @author:Krx
 * @date: 2017年5月10日 下午5:38:23
 */
@Service
@Transactional
public class DealCheckServiceImpl implements DealCheckService {

	@Autowired
	DealCheckDao dealCheckDao;
	@Autowired
	AccountsUsersBalancesService accountsUsersBalancesService;
	@Autowired
	RedisCache cache;
	@Autowired
	BaseConfigService baseConfigService;

	/**
	 * @see DealCheckService#UserWithdraw(java.util.Map)
	 * @Function: DealCheckServiceImpl.java
	 * @Description: 提现接口
	 *
	 * @param:param
	 * @return：retMap
	 * @author: Krx
	 * @date: 2017年5月10日 下午5:38:44
	 */
	@Override
	public Map<String, String> UserWithdraw(Map<String, String> param) {
		// 返回的Map参数 money 提现金额 type 提现类型 提现token
		Map<String, String> retMap = new HashMap<>();
        //获取用户token信息
		AccountsUsers user = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);
		
		if(user!=null){
			//余额提现手续费
			baseConfigService.selectByParam("cfg_cashRestriction").getValue();
			baseConfigService.selectByParam("cfg_upGetMinMoney").getValue();//最少起提金额
			
			
			
		}else{
			retMap.put("code",String.valueOf(ResultEnum.TOKEN_ISNULL.getCode()));
			retMap.put("msg", ResultEnum.TOKEN_ISNULL.getCodeDesc());
		}
		return retMap;
	}

}

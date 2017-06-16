/**
 * 
 */
package com.yhb.service.user.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.bean.entity.AccountsUsersBalances;
import com.yhb.dao.AccountsUsersBalancesDao;
import com.yhb.service.user.AccountsUsersBalancesService;
import com.yhb.service.user.AccountsUsersService;
import com.yhb.util.cache.RedisCache;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: AccountsUsersBalancesServiceImpl.java
* @Description: 用户余额
* @author:Krx
* @date: 2017年5月11日 上午10:06:20 
*/
@Service
@Transactional
public class AccountsUsersBalancesServiceImpl implements AccountsUsersBalancesService{
	@Autowired
	RedisCache cache;
	@Autowired
	AccountsUsersService accountsUsersService;
	@Autowired
	AccountsUsersBalancesDao accountsUsersBalancesDao;
	/** 
	* @see AccountsUsersBalancesService#selectByUserId(java.lang.String)
	* @Function: AccountsUsersBalancesServiceImpl.java
	* @Description: 查询用户余额
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年5月11日 下午2:23:19 
	*/
	@Override
	public AccountsUsersBalances selectByUserId(String userId) {
		return accountsUsersBalancesDao.selectByUserId(userId);
	}

	/** 
	* @see AccountsUsersBalancesService#updateUserBalance(java.util.Map)
	* @Function: AccountsUsersBalancesServiceImpl.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年5月11日 下午2:28:23 
	*/
	@Override
	public boolean updateUserBalance(Map<String, String> param) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	* @see AccountsUsersBalancesService#updateUserBalance(com.yhb.bean.entity.AccountsUsersBalances)
	* @Function: AccountsUsersBalancesServiceImpl.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年5月11日 下午2:28:23 
	*/
	@Override
	public boolean updateUserBalance(AccountsUsersBalances userBalance) {
		if(accountsUsersBalancesDao.updateByPrimaryKeySelective(userBalance)>0){
			return true;
		}
		return false;
	}

}

/**
 * 
 */
package com.yhb.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.bean.entity.AccountsCenterMeassage;
import com.yhb.dao.AccountsCenterMeassageDao;
import com.yhb.service.user.AccountsCenterMeassageService;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: AccountsCenterMeassageServiceImpl.java
* @Description: 消息信息记录
* @author:Krx
* @date: 2017年5月11日 下午3:12:15 
*/
@Service
@Transactional
public class AccountsCenterMeassageServiceImpl implements AccountsCenterMeassageService {

	@Autowired
	AccountsCenterMeassageDao  accountsCenterMeassageDao;
	
	/** 
	* @see AccountsCenterMeassageService#insertAccountsCenterMeassage(com.yhb.bean.entity.AccountsCenterMeassage)
	* @Function: AccountsCenterMeassageServiceImpl.java
	* @Description: 插入用户消息记录
	*
	* @param:AccountsCenterMeassage
	* @return：boolean
	* @author: Krx
	* @date: 2017年5月11日 下午3:12:50 
	*/
	@Override
	public boolean insertAccountsCenterMeassage(AccountsCenterMeassage message) {
		if(accountsCenterMeassageDao.insertSelective(message)>0){
			return true;
		}
		return false;
	}

}

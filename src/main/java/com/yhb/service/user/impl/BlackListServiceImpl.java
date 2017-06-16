package com.yhb.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhb.bean.entity.BlackList;
import com.yhb.bean.entity.BlackListExample;
import com.yhb.bean.entity.BlackListExample.Criteria;
import com.yhb.dao.BlackListDao;
import com.yhb.service.user.BlackListService;

@Service
public class BlackListServiceImpl implements BlackListService{
	
	@Autowired
	public BlackListDao blackListDao;

	/**
	 * 
	* @Function: AccountsUsersService.java
	* @Description: 通过手机号码获取黑名单用户信息
	*
	* @param: String account 手机号码
	* @return： 黑名单用户列表
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月8日 下午3:22:28 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月8日     wangxf           v1.0.0               修改原因
	 */
	@Override
	public List<BlackList> selectBlackListByAccount(String account) {
		
		BlackListExample example = new BlackListExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(account);
		
		return blackListDao.selectByExample(example);
	}

}

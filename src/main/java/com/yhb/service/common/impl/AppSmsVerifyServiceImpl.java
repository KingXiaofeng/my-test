/**
 * 
 */
package com.yhb.service.common.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.bean.entity.AppSmsVerify;
import com.yhb.bean.entity.AppSmsVerifyExample;
import com.yhb.bean.entity.AppSmsVerifyExample.Criteria;
import com.yhb.dao.AppSmsVerifyDao;
import com.yhb.service.common.AppSmsVerifyService;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: AppSmsVerifyServiceImpl.java
 * @Description: 该类的功能描述
 * @author:Krx
 * @date: 2017年5月5日 下午2:03:02
 */
@Service
@Transactional
public class AppSmsVerifyServiceImpl implements AppSmsVerifyService {

	@Autowired
	AppSmsVerifyDao appSmsVerifydao;

	/**
	 * 
	* @Function: AppSmsVerifyService.java
	* @Description: 插入验证码
	*
	* @param: AppSmsVerify
	* @return： int
	* @throws： 
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月8日 上午10:58:37 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月8日     wangxf           v1.0.0               修改原因
	 */
	@Override
	public int insertSelective(AppSmsVerify appSmsVerify) {
		return appSmsVerifydao.insertSelective(appSmsVerify);
	}

	/**
	 * 
	* @Function: AppSmsVerifyService.java
	* @Description: 该函数的功能描述
	*
	* @param: AppSmsVerifyExample
	* @return： List<AppSmsVerify>
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月8日 上午11:00:07 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月8日     wangxf           v1.0.0               修改原因
	 */
	@Override
	public List<AppSmsVerify> selectByExample(String account) {
		AppSmsVerifyExample example = new AppSmsVerifyExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(account);
		return appSmsVerifydao.selectByExample(example);
	}

	/**
	 * 
	* @Function: AppSmsVerifyService.java
	* @Description: 更新验证码
	*
	* @param: AppSmsVerify
	* @return： int
	* @throws：
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月8日 上午10:59:31 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月8日     wangxf           v1.0.0               修改原因
	 */
	@Override
	public int updateByPrimaryKeySelective(AppSmsVerify appSmsVerify) {
		return appSmsVerifydao.updateByPrimaryKeySelective(appSmsVerify);
	}

	/**
	 * 
	 * @see AppSmsVerifyService#selectVerifyIsExit(java.lang.String)
	 * @Function: AppSmsVerifyServiceImpl.java
	 * @Description: 判断验证码是否存在
	 *
	 * @param:phoneCode
	 * @return：boolean
	 * @author: Krx
	 * @date: 2017年5月8日 上午9:42:39
	 */
	/*
	@Override
	public boolean selectVerifyIsExit(String phoneCode) {
		AppSmsVerifyExample example = new AppSmsVerifyExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(phoneCode);

		int count = appSmsVerifydao.countByExample(example);

		if (count > 0) {
			return true;
		}

		return false;
	}
*/
}

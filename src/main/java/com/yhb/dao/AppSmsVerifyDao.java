package com.yhb.dao;

import java.util.List;

import com.yhb.annotation.MyBatis;
import com.yhb.bean.entity.AppSmsVerify;
import com.yhb.bean.entity.AppSmsVerifyExample;

@MyBatis
public interface AppSmsVerifyDao {
	
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
	public int insertSelective(AppSmsVerify appSmsVerify);
	
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
	public int updateByPrimaryKeySelective(AppSmsVerify appSmsVerify);
	
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
	public List<AppSmsVerify> selectByExample(AppSmsVerifyExample example);
	
	int countByExample(AppSmsVerifyExample example);

}
package com.yhb.service.user;

import java.util.List;

import com.yhb.bean.entity.BlackList;

/**
 * 
* @ClassName: BlackListService.java
* @Description: 黑名单用户信息
*
* @version: v1.0.0
* @author: wangxf
* @date: 2017年5月8日 下午3:24:57 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2017年5月8日     wangxf           v1.0.0               修改原因
 */
public interface BlackListService {

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
	List<BlackList> selectBlackListByAccount(String account);
}

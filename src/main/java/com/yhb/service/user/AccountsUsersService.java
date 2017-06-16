/**
 * 
 */
package com.yhb.service.user;

import com.yhb.bean.entity.AccountsUsers;
import com.yhb.bean.entity.AccountsUsersExample;

import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: AccountsUsersService.java
 * @Description: 用户接口
 * @author:Krx
 * @date: 2017年4月27日 下午1:50:34
 */
public interface AccountsUsersService {

	/**
	 * 
	 * @Description: 根据UserName获取AccountsUsers
	 *
	 * @param:userName
	 * @return
	 * @author: Krx
	 * @date: 2017年4月27日 下午2:22:52
	 */
	public AccountsUsers selectUserByUserName(String userName);

	/**
	 * 
	 * @Description: 根据userId获取AccountsUsers
	 *
	 * @param:userId
	 * @return：AccountsUsers
	 * @author: Krx
	 * @date: 2017年5月8日 上午9:15:30
	 */
	AccountsUsers selectUserByPrimaryKey(String userId);

	/**
	 * 
	 * @Function: AccountsUsersService.java
	 * @Description: 用户注册-Service
	 *
	 * @param: Map<String,
	 *             String>
	 * @return：AccountsUsers @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月4日 上午10:11:46
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2017年5月4日 wangxf v1.0.0 修改原因
	 */
	AccountsUsers register(Map<String, String> registerMap);

	/**
	 * 
	 * @Description: 查询用户列表信息
	 *
	 * @param:example
	 * @return：List<AccountsUsers>
	 * @author: Krx
	 * @date: 2017年5月8日 上午9:17:50
	 */
	List<AccountsUsers> selectByExample(AccountsUsersExample example);

	/**
	 * 
	 * @Description: 插入用户信息
	 *
	 * @param:users
	 * @return：int
	 * @author: Krx
	 * @date: 2017年5月8日 上午9:17:50
	 */
	int insertSelectiveUsers(AccountsUsers users);

	/**
	 * 
	 * @Description: 更新用户信息
	 *
	 * @param:registerMap
	 * @return：boolean
	 * @author: Krx
	 * @date: 2017年5月9日 上午10:50:39
	 */
	 boolean updateUserInfo(Map<String, String> registerMap);
	 
	 /**
	  * 
	 * @Function: AccountsUsersService.java
	 * @Description: 用户上传头像
	 *
	 * @param: AccountsUsers accountsUsers
	 * @return： boolean
	 * @throws： 
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月11日 下午3:20:29 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年5月11日     wangxf           v1.0.0               修改原因
	  */
	 boolean updateUserInfo(AccountsUsers accountsUsers);

	/**
	 *
	 * @Function: AccountsUsersService.java
	 * @Description: 判断身份证号码是否已经被注册
	 *
	 * @param: AccountsUsers accountsUsers
	 * @return： boolean
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: wangxf
	 * @date: 2017年5月11日 下午3:20:29
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2017年5月11日     wangxf           v1.0.0               修改原因
	 */
	 boolean selectUserInfoByCardId(String cardId);
}

/**
 * 
 */
package com.yhb.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: MyRealm.java
* @Description: 该类的功能描述
* @author:Krx
* @date: 2017年4月27日 下午1:22:12 
*/
public class MyRealm extends AuthorizingRealm {

	/** 
	* @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)  
	* @Function: MyRealm.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年4月27日 下午1:26:03 
	*/
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	* @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)  
	* @Function: MyRealm.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @author: Krx
	* @date: 2017年4月27日 下午1:26:03 
	*/
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}

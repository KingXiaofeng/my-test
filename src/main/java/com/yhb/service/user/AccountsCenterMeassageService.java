/**
 * 
 */
package com.yhb.service.user;

import com.yhb.bean.entity.AccountsCenterMeassage;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: AccountsCenterMeassageService.java
 * @Description: 用户消息记录
 * @author:Krx
 * @date: 2017年5月11日 下午3:10:58
 */
public interface AccountsCenterMeassageService {

	/**
	 * 
	 * @Description: 插入用户消息记录
	 *
	 * @param:实体类
	 * @return：boolean
	 * @author: krx
	 * @date: 2017年5月11日 下午3:11:26
	 */
	boolean insertAccountsCenterMeassage(AccountsCenterMeassage message);

}

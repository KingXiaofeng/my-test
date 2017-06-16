/**
 * 
 */
package com.yhb.service.product;

import java.util.List;
import java.util.Map;

import com.yhb.bean.entity.FinanceproductsUsers;
import com.yhb.vo.UserBuyProductList;
import com.yhb.vo.UserInvestRecordListVo;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: FinanceproductsUsersService.java
 * @Description: 用户产品信息
 * @author:Krx
 * @date: 2017年5月12日 上午9:51:52
 */
public interface FinanceproductsUsersService {

	/**
	 * 
	 * @Description: 获取用户产品资产
	 *
	 * @param: param
	 * @return：返回结果描述
	 * @author: Administrator
	 * @date: 2017年5月12日 上午9:52:43
	 */
	List<UserBuyProductList> getFinUserList(Map<String, Object> param);

	/**
	 *
	 * @Description: 获取用户产品资产总数据记录数
	 *
	 * @param: param
	 * @return：返回结果描述
	 * @author: Administrator
	 * @date: 2017年5月12日 上午9:52:43
	 */
	int getProductCount(Map<String, Object> param);

	/**
	 *
	 * @Description: 获取用户投资记录
	 *
	 * @param: Id
	 * @return：返回结果描述
	 * @author: Administrator
	 * @date: 2017年5月12日 上午9:52:43
	 */
	List<UserInvestRecordListVo> getUserInvestmentRecords(Integer id);

	/**
	 *
	 * @Description: 购买产品
	 *
	 * @param:
	 * @return：返回结果描述
	 * @author: Administrator
	 * @date: 2017年5月12日 上午9:52:43
	 */
	Map<String,Object> buyPro(Map<String,String> param);

}

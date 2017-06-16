/**
 * 
 */
package com.yhb.service.common.impl;

import java.util.List;
import java.util.Map;

import com.yhb.bean.entity.ProfitTable;
import com.yhb.bean.entity.ProfitTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.dao.ProfitTableDao;
import com.yhb.service.common.ProfitTableService;
import com.yhb.bean.entity.ProfitTableExample.Criteria;
import com.yhb.util.cache.RedisCache;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: ProfitTableServiceImpl.java
* @Description: 金额静态
* @author:Krx
* @date: 2017年5月12日 上午9:34:59 
*/
@Service
@Transactional
public class ProfitTableServiceImpl implements ProfitTableService{
	
	@Autowired
	ProfitTableDao profitTableDao;
	@Autowired
	RedisCache cache;
	

	/** 
	* @see ProfitTableService#getUserIncomeAnd(java.lang.String)
	* @Function: ProfitTableServiceImpl.java
	* @Description: 获取用户的昨日收益和累计收益
	*
	* @param:userId
	* @return：Map
	* @author: Krx
	* @date: 2017年5月12日 上午9:35:07 
	*/
	@Override
	public Map<String, Object> getUserIncomeAnd(String userId) {
		Map<String, Object>  userIncomeMap = profitTableDao.selectUserIncome(userId);
		if(userIncomeMap != null && userIncomeMap.size()>0){
		   return userIncomeMap;	
		}
		
		return null;
	}

	/**
	 * @see ProfitTableService#getProfitByUserId(java.lang.String)
	 * @Function: ProfitTableServiceImpl.java
	 * @Description: 根据UserId查询出用户收益
	 *
	 * @param:userId
	 * @return：Map
	 * @author: Krx
	 * @date: 2017年5月12日 上午9:35:07
	 */
	@Override
	public ProfitTable getProfitByUserId(String userId) {
		ProfitTableExample example = new ProfitTableExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userId);
		//查询收益根据用户UserId
		List<ProfitTable> profitTableList = profitTableDao.selectByExample(example);

		if (profitTableList != null && profitTableList.size() > 0) {
			for (int i = 0; i < profitTableList.size();) {
				//遍历集合
				ProfitTable  profitTable = profitTableList.get(i);
				return profitTable;
			}
		}
		return null;
	}

}

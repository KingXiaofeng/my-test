/**
 * 
 */
package com.yhb.service.activity.impl;

import com.yhb.bean.entity.AccountRaiseGet;
import com.yhb.bean.entity.AccountRaiseGetExample;
import com.yhb.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.dao.AccountRaiseGetDao;
import com.yhb.service.activity.AccountRaiseGetService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: AccountRaiseGetServiceImpl.java
* @Description: 用户加息劵实现类
* @author:Krx
* @date: 2017年5月16日 上午11:01:22 
*/
@Service
public class AccountRaiseGetServiceImpl implements AccountRaiseGetService {

	@Autowired
	AccountRaiseGetDao accountsRaiseDao;


	/**
	 *
	 * @Description: 根据UserId,type,productId获取加息劵
	 *
	 * @param: userId
	 * @return：List
	 * @author: Krx
	 * @date: 2017年5月8日 下午3:47:16
	 */
	@Override
	public List<AccountRaiseGet> getUserRaise(String userId,Integer id,String...type) {
		Integer state  = 0;
		if(StringUtil.isNotBlank(type.toString())){
			state = Integer.parseInt(type.toString());
		}
		AccountRaiseGetExample example = new AccountRaiseGetExample();
		AccountRaiseGetExample.Criteria criterion = example.createCriteria();
		criterion.andUseridEqualTo(userId);
		criterion.andRaisestateEqualTo(state);
		if(id != null ){
			criterion.andProductidEqualTo(String.valueOf(id));
		}
		return accountsRaiseDao.selectByExample(example);
	}

	/**
	 * @param param
	 * @Description: 根据param获取加息劵记录总数
	 * @param: userId
	 * @return：List
	 * @author: Krx
	 * @date: 2017年5月8日 下午3:47:16
	 */
	@Override
	public int getUserRaiseCount(Map<String, Object> param) {
		String userId = param.get("userId").toString();
		Integer state = Integer.parseInt(param.get("state").toString());
		//0表示未使用 1表示已使用 3表示已过期
		if(state == 2){
			state = 1;
		}
		AccountRaiseGetExample example = new AccountRaiseGetExample();
		AccountRaiseGetExample.Criteria criterion = example.createCriteria();
		criterion.andUseridEqualTo(userId);
		criterion.andRaisestateEqualTo(state);
		return accountsRaiseDao.countByExample(example);
	}

	/**
	 * @param param
	 * @Description: 根据param获取加息劵列表
	 * @param: userId
	 * @return：List
	 * @author: Krx
	 * @date: 2017年5月8日 下午3:47:16
	 */
	@Override
	public List<AccountRaiseGet> getUserRaiseList(Map<String, Object> param) {
		Map<String, Object> sqlMap = new HashMap<String, Object>();
		//userId
		String userId = param.get("userId").toString();
		//状态 //0: 未使用, 2: 已使用, 3: 已过期
		Integer state = Integer.parseInt(param.get("state").toString());
		//0表示未使用 1表示已使用 3表示已过期
		if(state == 2){
			state = 1;
		}
		sqlMap.put("state", state);
		sqlMap.put("userId", userId);
		//获取页数
		Integer page = Integer.parseInt(param.get("current").toString());
		//每页显示多少记录数
		Integer size = Integer.parseInt(param.get("size").toString());
		//重新计算页数
		sqlMap.put("current",(page - 1) * size);
		sqlMap.put("size", size);
		//排序
		String rank = param.get("rank").toString();
		if(rank.equals("value")){
			rank = "raiseSize";  //红包金额
		} else if(rank.equals("getTime")){
			rank = "raiseGetTime";  //得到时间
		}else if(rank.equals("endTime")){
			rank = "raiseOverTime"; //过期时间
		}
		sqlMap.put("rank",rank);


		List<AccountRaiseGet> accountRaiseGetList = accountsRaiseDao.selectRaiseList(sqlMap);
		if (accountRaiseGetList.size() > 0 || StringUtil.isNotNull(accountRaiseGetList)) {
			return accountRaiseGetList;
		}
		return null;
	}
}

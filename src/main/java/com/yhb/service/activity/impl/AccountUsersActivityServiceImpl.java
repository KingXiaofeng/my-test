/**
 *
 */
package com.yhb.service.activity.impl;

import com.yhb.bean.entity.AccountUsersActivity;
import com.yhb.bean.entity.AccountUsersActivityExample;
import com.yhb.util.StringUtil;
import com.yhb.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.dao.AccountUsersActivityDao;
import com.yhb.service.activity.AccountUsersActivityService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 *
 * @ClassName: AccountUsersActivityServiceImpl.java
 * @Description: 用户红包实现类
 * @author:Krx
 * @date: 2017年5月16日 上午11:02:47
 */
@Service
@Transactional
public class AccountUsersActivityServiceImpl implements AccountUsersActivityService {

    @Autowired
    AccountUsersActivityDao accountUsersActivityDao;

    @Override
    public List<AccountUsersActivity> getUserRed(String userId, Integer id, String... type) {
        Integer state = 2;
        if (StringUtil.isNotBlank(type.toString())) {
            state = Integer.parseInt(type.toString());
        }

        AccountUsersActivityExample example = new AccountUsersActivityExample();
        AccountUsersActivityExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        criteria.andActivitystateEqualTo(state);
        if(id !=null){
            criteria.andFpidEqualTo(String.valueOf(id));
        }
        return accountUsersActivityDao.selectByExample(example);
    }

    /***
     * 获取红包的总数
     * @param param
     * @return
     */
    @Override
    public int getUserRedCount(Map<String, Object> param) {
        String userId = param.get("userId").toString();
        Integer state = Integer.parseInt(param.get("state").toString());
        //1表示已使用 2表示未使用 3表示已过期
        if(state == 0){
            state = 2;  //未使用
        }else if(state == 2){
            state = 1;  //已使用
        }

        AccountUsersActivityExample example = new AccountUsersActivityExample();
        AccountUsersActivityExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        criteria.andActivitystateEqualTo(state);

        return accountUsersActivityDao.countByExample(example);
    }

    /***
     * 获取红包的列表
     * @param param
     * @return
     */
    @Override
    public List<AccountUsersActivity> getUserRedList(Map<String, Object> param) {
        Map<String, Object> sqlMap = new HashMap<String, Object>();
        //userId
        String userId = param.get("userId").toString();
        //状态
        Integer state = Integer.parseInt(param.get("state").toString());
        //1表示已使用 2表示未使用 3表示已过期
        if(state == 0){
            state = 2;  //未使用
        }else if(state == 2){
            state = 1;  //已使用
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
            rank = "ActivityMoney";  //红包金额
        } else if(rank.equals("getTime")){
            rank = "GainTime";  //得到时间
        }else if(rank.equals("endTime")){
            rank = "OverduTime"; //过期时间
        }
        sqlMap.put("rank",rank);

        List<AccountUsersActivity> accountUsersActivityList = accountUsersActivityDao.selectUserRedList(sqlMap);
        if (accountUsersActivityList.size() > 0 || StringUtil.isNotNull(accountUsersActivityList)) {
            return accountUsersActivityList;
        }

        return null;
    }
}

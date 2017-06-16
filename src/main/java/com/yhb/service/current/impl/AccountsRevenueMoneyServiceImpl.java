package com.yhb.service.current.impl;

import com.google.common.collect.Maps;
import com.yhb.bean.entity.AccountsRevenueMoney;
import com.yhb.dao.AccountsRevenueMoneyDao;
import com.yhb.service.current.AccountsRevenueMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 活期宝收益
 * krx
 */
@Service
@Transactional
public class AccountsRevenueMoneyServiceImpl implements AccountsRevenueMoneyService{

    @Autowired
    AccountsRevenueMoneyDao accountsRevenueMoneyDao;

    static Map param = null;
    /***
     * 获取活期宝收益列表
     * @param params
     * @return List<AccountsRevenueMoney>
     */
    @Override
    public List<AccountsRevenueMoney> getAccountsRevenueMoneyList(Map<String, Object> params) {
        param = Maps.newHashMap();
        //获取页数
        Integer page = Integer.parseInt(param.get("current").toString());
        //每页显示多少记录数
        Integer size = Integer.parseInt(param.get("size").toString());
        //封装Map参数
        param.put("userId", params.get("userId"));
        param.put("current",(page - 1) * size);
        param.put("total", size);
        param.put("startTime",params.get("startTime"));
        param.put("endTime", params.get("endTime"));

        List<AccountsRevenueMoney> accountsRevenueMoneyList = accountsRevenueMoneyDao.revenueMoneyList(param);

        if(accountsRevenueMoneyList !=null || accountsRevenueMoneyList.size()>0){
            return  accountsRevenueMoneyList;
        }

        return null;
    }

    /***
     * 获取活期宝收益总记录数
     * @param params
     * @return int
     */
    @Override
    public int countRevenue(Map<String, Object> params) {
        param = Maps.newHashMap();
        //封装Map参数
        param.put("userId", params.get("userId"));
        param.put("startTime",params.get("startTime"));
        param.put("endTime", params.get("endTime"));

        int count = accountsRevenueMoneyDao.revenueMoneyCount(param);
        return count;
    }
}

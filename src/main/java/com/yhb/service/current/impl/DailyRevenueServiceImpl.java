package com.yhb.service.current.impl;

import com.yhb.bean.entity.DailyRevenue;
import com.yhb.bean.entity.DailyRevenueExample;
import com.yhb.dao.DailyRevenueDao;
import com.yhb.service.current.DailyRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 *
 * @ClassName: DailyRevenueService.java
 * @Description:活期宝利率实现类
 * @author:Krx
 * @date: 2017年5月9日 下午1:40:05
 */
@Service
public class DailyRevenueServiceImpl  implements DailyRevenueService{


    @Autowired
    DailyRevenueDao dailyRevenueDao;


    /**
     * Copyright: Copyright (c) 2017 LanRu-Caifu
     *
     * @ClassName: DailyRevenueService.java
     * @Description:获取活期宝利率
     * @author:Krx
     * @date: 2017年5月9日 下午1:40:05
     */
    @Override
    public DailyRevenue getDailyRevenue() {
        DailyRevenueExample example = new DailyRevenueExample();
        DailyRevenueExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(1);
        List<DailyRevenue> dailyRevenueList = dailyRevenueDao.selectByExample(example);

        if (dailyRevenueList != null && dailyRevenueList.size() > 0) {
            for (int i = 0 ; i< dailyRevenueList.size();){
                DailyRevenue revenue = dailyRevenueList.get(i);
                return revenue;
            }
        }
        return null;
    }
}

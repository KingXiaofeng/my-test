/**
 *
 */
package com.yhb.service.activity.impl;

import com.yhb.bean.entity.ExperienceSend;
import com.yhb.bean.entity.ExperienceSendExample;
import com.yhb.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.dao.ExperienceSendDao;
import com.yhb.service.activity.ExperienceSendService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 *
 * @ClassName: ExperienceSendServiceImpl.java
 * @Description: 用户体验金实现类
 * @author:Krx
 * @date: 2017年5月16日 上午11:04:25
 */
@Service
@Transactional
public class ExperienceSendServiceImpl implements ExperienceSendService {

    @Autowired
    ExperienceSendDao experienceSendDao;

    /**
     * @param userId
     * @param id
     * @param type
     * @Description: 根据UserId, type, id获取用户活动礼券
     * @return：List
     * @author: Krx
     * @date: 2017年5月8日 下午3:47:16
     */
    @Override
    public List<ExperienceSend> getExperience(String userId, Integer id, String... type) {
        Integer state = 0;

        if (StringUtil.isNotBlank(type.toString())) {
            state = Integer.parseInt(type.toString());
        }

        ExperienceSendExample example = new ExperienceSendExample();
        ExperienceSendExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        criteria.andExperiencesendisuseEqualTo(state);
        if(id != null ){
            criteria.andFpidEqualTo(String.valueOf(id));
        }
        return experienceSendDao.selectByExample(example);
    }

    /***
     * 获取体验金的总数
     * @param param
     * @return
     */
    @Override
    public int getExperienceCount(Map<String, Object> param) {
        String userId = param.get("userId").toString();
        //体验金方法使用状态(   state 1 已使用 state 0  未使用 state 3  已过期）
        Integer state = Integer.parseInt(param.get("state").toString());
        //0: 未使用, 2: 已使用, 3: 已过期
        if(state == 2) {
            state = 1;
        }

        ExperienceSendExample example = new ExperienceSendExample();
        ExperienceSendExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userId);
        criteria.andExperiencesendisuseEqualTo(state);
        return experienceSendDao.countByExample(example);
    }

    /***
     * 获取体验金列表
     * @param param
     * @return
     */
    @Override
    public List<ExperienceSend> getExperienceList(Map<String, Object> param) {
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
            rank = "ExperienceSendMoney";  //金额
        } else if(rank.equals("getTime")){
            rank = "ExperienceSendTime";  //得到时间
        }else if(rank.equals("endTime")){
            rank = "ExperienceSendEm_k2"; //过期时间
        }
        sqlMap.put("rank",rank);

        List<ExperienceSend> experienceSendList = experienceSendDao.selectExperienceSendList(sqlMap);
        if (experienceSendList.size() > 0 || StringUtil.isNotNull(experienceSendList)) {
            return experienceSendList;
        }
        return null;
    }
}

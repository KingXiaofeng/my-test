package com.yhb.controller;

import com.yhb.base.BaseController;
import com.yhb.bean.entity.AccountsUsers;
import com.yhb.requesturl.ActivityRequestUrl;
import com.yhb.service.activity.CommonActivityService;
import com.yhb.service.activity.ExperienceSendService;
import com.yhb.util.cache.RedisCache;
import com.yhb.util.json.SpringUtils;
import com.yhb.validate.ParamCheckValidate;
import com.yhb.vo.ActivityListVo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 *
 * @ClassName: Ima9geFormController.java
 * @Description: 活动礼券
 * @author:Krx
 * @date: 2017年5月8日 下午5:12:43
 */
@Controller
@RequestMapping(ActivityRequestUrl.act)
public class ActivityController extends BaseController {

    @Autowired
    CommonActivityService commonActivityService;
    @Autowired
    RedisCache cache;



    /**
     *
     * @Description: 根据UserId,id获取用户活动礼券
     *
     * @param: userId
     * @return：List
     * @author: Krx
     * @date: 2017年5月8日 下午3:47:16
     */
    @RequestMapping(ActivityRequestUrl.actbuy)
    public void getUserActAtBuy(HttpServletResponse response, @RequestBody Map<String,String> param){
        // 验证参数工具类，当该map有值时说明验证失败
        Map<String, String> retMap = ParamCheckValidate.getValidateInfo(param);
        if (retMap.size() > 0) {
            for (String keyName : retMap.keySet()) {

                String value = retMap.get(keyName);
                SpringUtils.renderJsonResult(response, Integer.parseInt(keyName), value);
                return;
            }
        }

        //验证token是否存在
        if (cache.tokenExit(param.get("token"))) {
            JSONObject object = JSONObject.fromObject(param.get("datas"));
            JSONArray jsonArray = JSONArray.fromObject(object);
            System.out.println(jsonArray);
            //遍历
            for (int i =0 ; i<jsonArray.size();) {
               System.out.println(jsonArray.get(i));
            }

            //map初始化
            returnMap = new HashedMap();
            //获取礼包
//            returnMap = commonActivityService.getUserActivity();

            returnVo.setStatus(true);
            returnVo.setDatas(returnMap);
        }

        SpringUtils.renderJson(response, returnVo);

    }

    /**
     *
     * @Description: 获取加息劵，体验金，红包数据总数
     *
     * @param: userId
     * @return：List
     * @author: Krx
     * @date: 2017年5月8日 下午3:47:16
     */
    @RequestMapping(ActivityRequestUrl.activityCount)
    public void getMyActivityCount(HttpServletResponse response, @RequestBody Map<String,String> param){
        //验证token 是否存在
        if (cache.tokenExit(param.get("token"))) {
            returnVo.setStatus(true);
            //type:1:红包,2:体验金,3:加息券 state:礼券生命周期
            // type礼券类型 userId:用户Id rank:排序方式
            // getTime  获取时间 endTime 过期时间
            returnMap =  new HashMap<String, Object>();

            returnMap = ParamCheckValidate.getDatasMapValue(param);

            AccountsUsers users = cache.getUserRedis(param.get(token), 1, AccountsUsers.class);
            returnMap.put("userId", users.getUserid());

            datas = commonActivityService.getActivityCount(returnMap);

            returnVo.setDatas(datas);
        }

        SpringUtils.renderJson(response, returnVo);
    }


    /**
     *
     * @Description: 获取加息劵，体验金，红包数据列表
     *
     * @param: userId
     * @return：List
     * @author: Krx
     * @date: 2017年5月8日 下午3:47:16
     */
    @RequestMapping(ActivityRequestUrl.activityList)
    public void getMyActivityList(HttpServletResponse response, @RequestBody Map<String,String> param){
        //验证token 是否存在
        if (cache.tokenExit(param.get("token"))) {

            returnVo.setStatus(true);
            //type:1:红包,2:体验金,3:加息券 state:礼券生命周期
            // type礼券类型 userId:用户Id rank:排序方式
            // getTime  获取时间 endTime 过期时间
            returnMap =  new HashMap<String, Object>();
            returnMap = ParamCheckValidate.getDatasMapValue(param);

            AccountsUsers users = cache.getUserRedis(param.get(token), 1, AccountsUsers.class);
            returnMap.put("userId", users.getUserid());

            datas = commonActivityService.activityList(returnMap);

            returnVo.setDatas(datas);
        }

        SpringUtils.renderJson(response, returnVo);
    }



}

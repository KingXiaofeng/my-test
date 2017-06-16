package com.yhb.controller;

import com.yhb.base.BaseConstants;
import com.yhb.base.BaseController;
import com.yhb.bean.entity.AccountsUsers;
import com.yhb.requesturl.ProductRequestUrl;
import com.yhb.service.product.FinanceproductsExtractService;
import com.yhb.service.product.FinanceproductsUsersService;
import com.yhb.util.cache.RedisCache;
import com.yhb.util.json.SpringUtils;
import com.yhb.validate.ParamCheckValidate;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 用户产品信息
 * @Version 1.0.0  版本
 * @Created by 孔荣勋 on 2017/6/5 0005.
 */
@Controller
@RequestMapping(ProductRequestUrl.product)
public class ProductController extends BaseController {
    private Logger _log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    FinanceproductsUsersService finUserSerive;
    @Autowired
    RedisCache cache;
    @Autowired
    FinanceproductsExtractService extractService;


    /**
     * @Description 获取用户理财列表
     * @Version 1.0.0 版本号信息
     * @param response
     * @param param
     * @Date 2017-06-05
     */
    @RequestMapping(ProductRequestUrl.proList)
    public void getUserProductList(HttpServletResponse response, @RequestBody Map<String, String> param){
        if (cache.tokenExit(param.get("token"))) {
            returnMap = new HashMap<String, Object>();
            AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);

            returnMap = ParamCheckValidate.getDatasMapValue(param);
            if(!returnByMap(response, returnMap)){
                returnVo.setStatus(true);
                SpringUtils.renderJson(response, returnVo);
                return;
            }

            returnMap.put("userId", users.getUserid());
            datas = extractService.getOutProductList(returnMap);

            returnVo.setStatus(true);
            returnVo.setDatas(datas);
        }
        SpringUtils.renderJson(response, returnVo);
    }


    /**
     * @Description 获取用户理财总数据数
     * @Version 1.0.0 版本号信息
     * @param response
     * @param_param
     * @Date 2017-06-05
     *
     *
     */
    @RequestMapping(ProductRequestUrl.proTotal)
    public void getUserOutProductTotal(HttpServletResponse response, @RequestBody Map<String, String> param){
        if (cache.tokenExit(param.get("token"))) {
            returnMap = new HashMap<String, Object>();
            AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);

            returnMap = ParamCheckValidate.getDatasMapValue(param);
            if(!returnByMap(response, returnMap)){
                returnVo.setStatus(true);
                SpringUtils.renderJson(response, returnVo);
                return;
            }

            returnMap.put("userId", users.getUserid());
            datas = finUserSerive.getProductCount(returnMap);

            returnVo.setStatus(true);
            returnVo.setDatas(datas);
        }
        SpringUtils.renderJson(response, returnVo);
    }



    /**
     * @Description 获取用户理财列表
     * @Version 1.0.0 版本号信息
     * @param response
     * @param param
     * @Date 2017-06-05
     */
    @RequestMapping(ProductRequestUrl.outList)
    public void getUserOutProductList(HttpServletResponse response, @RequestBody Map<String, String> param){
        if (cache.tokenExit(param.get("token"))) {
            returnMap = new HashMap<String, Object>();
            AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);

            returnMap = ParamCheckValidate.getDatasMapValue(param);
            if(!returnByMap(response, returnMap)){
                returnVo.setStatus(true);
                SpringUtils.renderJson(response, returnVo);
                return;
            }

            returnMap.put("userId", users.getUserid());
            datas = finUserSerive.getFinUserList(returnMap);

            returnVo.setStatus(true);
            returnVo.setDatas(datas);
        }
        SpringUtils.renderJson(response, returnVo);
    }


    /**
     * @Description 获取用户理财总数据数
     * @Version 1.0.0 版本号信息
     * @param response
     * @param_param
     * @Date 2017-06-05
     *
     *
     */
    @RequestMapping(ProductRequestUrl.outTotal)
    public void getUserProductTotal(HttpServletResponse response, @RequestBody Map<String, String> param){
        if (cache.tokenExit(param.get("token"))) {
            returnMap = new HashMap<String, Object>();
            AccountsUsers users = cache.getUserRedis(param.get("token"), 1, AccountsUsers.class);

            returnMap = ParamCheckValidate.getDatasMapValue(param);
            if(!returnByMap(response, returnMap)){
                returnVo.setStatus(true);
                SpringUtils.renderJson(response, returnVo);
                return;
            }

            returnMap.put("userId", users.getUserid());
            datas = extractService.getOutProductCount(returnMap);

            returnVo.setStatus(true);
            returnVo.setDatas(datas);
        }
        SpringUtils.renderJson(response, returnVo);
    }


}

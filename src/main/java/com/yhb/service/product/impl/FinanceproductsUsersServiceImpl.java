package com.yhb.service.product.impl;

import com.google.common.collect.Lists;
import com.yhb.bean.entity.FinanceproductsUsers;
import com.yhb.dao.FinanceproductsUsersDao;
import com.yhb.service.product.FinanceproductsUsersService;
import com.yhb.util.DateUtils;
import com.yhb.util.StringUtil;
import com.yhb.vo.UserBuyProductList;
import com.yhb.vo.UserInvestRecordListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 孔荣勋 on 2017/5/15 0015.
 */
@Service
public class FinanceproductsUsersServiceImpl implements  FinanceproductsUsersService {

    @Autowired
    FinanceproductsUsersDao financeproductsUsersDao;



    /**
     *
     * @Description: 获取用户资产
     *
     * @return：List<FinanceproductsUsers>
     * @author: Krx
     * @date: 2017年5月8日 下午3:53:53
     */
    @Override
    public List<UserBuyProductList> getFinUserList(Map<String, Object> param) {
        String times = param.get("time").toString();
        String[] strs = times.replace("[","").replace("]","").split(",");
        String startTime = strs[0];
        String endTime = strs[1];

        //获取页数
        Integer page = Integer.parseInt(param.get("current").toString());
        //每页显示多少记录数
        Integer size = Integer.parseInt(param.get("size").toString());
        //重新计算页数
        param.remove("current");

        param.put("current",(page - 1) * size);
        param.put("size",size);
        param.put("startTime",startTime);
        param.put("endTime",endTime);

        List<UserBuyProductList> userBuyProductList = financeproductsUsersDao.getUserBuyProductList(param);
        if (userBuyProductList.size() > 0 || StringUtil.isNotNull(userBuyProductList)) {
            return userBuyProductList;
        }
        return null;
    }

    /**
     *
     * @Description: 获取用户产品资产总数据记录数
     * @param: param
     * @return：返回结果描述
     * @author: Administrator
     * @date: 2017年5月12日 上午9:52:43
     */
    @Override
    public int getProductCount(Map<String, Object> param) {
        String times = param.get("time").toString();
        String[] strs = times.replace("[","").replace("]","").split(",");
        String startTime = strs[0];
        String endTime = strs[1];

        param.put("startTime",startTime);
        param.put("endTime",endTime);

        int count = financeproductsUsersDao.getProductCountByParam(param);

        return count;
    }


    /**
     *
     * @Description: 获取用户投资记录
     *
     * @return：List<FinanceproductsUsers>
     * @author: Krx
     * @date: 2017年5月8日 下午3:53:53
     */
    @Override
    public List<UserInvestRecordListVo> getUserInvestmentRecords(Integer id) {
        //根据产品Id获取当前产品投资用户记录
        List<FinanceproductsUsers> finUserList = financeproductsUsersDao.getUserInvestmentRecords(id);
        List<UserInvestRecordListVo> InvestList = Lists.newArrayList();

        if (StringUtil.isNotNull(finUserList)) {

            for (FinanceproductsUsers financeproductsUsers: finUserList) {
                //获取用户信息
                String trueName = financeproductsUsers.getTrueName().replace(financeproductsUsers.getTrueName().substring(1, financeproductsUsers.getTrueName().length()), "**"); //账户姓名
                String userName = financeproductsUsers.getUserName().replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2"); //账户
                BigDecimal buyMoney = financeproductsUsers.getFproductsbuymoney().setScale(2, BigDecimal.ROUND_HALF_UP);//购买金额
                Date time = financeproductsUsers.getFproductsbuytime();//购买时间

                //创建vo实体传输对象
                UserInvestRecordListVo vo = new UserInvestRecordListVo(trueName, userName, buyMoney, DateUtils.parseToDateTimeStr(time));
                InvestList.add(vo);
            }

        }

        return InvestList;
    }

    /**
     *
     * @Description: 购买产品
     *
     * @return：List<FinanceproductsUsers>
     * @author: Krx
     * @date: 2017年5月8日 下午3:53:53
     */
    @Override
    public Map<String, Object> buyPro(Map<String, String> param) {


        return null;
    }
}
package com.yhb.service.deposit.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.yhb.service.deposit.FyResvService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.base.BaseConstants;
import com.yhb.bean.entity.AccountsCenterMeassage;
import com.yhb.bean.entity.AccountsUsers;
import com.yhb.bean.entity.AccountsUsersBalances;
import com.yhb.bean.entity.DealOrder;
import com.yhb.bean.entity.LogMoneyChange;
import com.yhb.controller.Fy.FyConstants;
import com.yhb.service.user.AccountsCenterMeassageService;
import com.yhb.service.user.AccountsUsersBalancesService;
import com.yhb.service.user.AccountsUsersService;
import com.yhb.service.user.DealOrderService;
import com.yhb.service.common.LogMoneyChangeService;
import com.yhb.service.fy.HuanXunOrderInfoService;

@Service
@Transactional
public class FyResvServiceImpl implements FyResvService {

	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	HuanXunOrderInfoService HxOrderInfoService;
	@Autowired
	DealOrderService dealOrderService;
	@Autowired
	AccountsUsersBalancesService balanceService;
	@Autowired
	LogMoneyChangeService logMoneyChangeService;
	@Autowired
	AccountsUsersService userService;
	@Autowired
	AccountsCenterMeassageService messageService;

	// 充值成功修改用户充值金额
	@Override
	public void smpGate(Map<String, String> param) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		try {
			String orderNumber = param.get(FyConstants.order_id);
			DealOrder order = dealOrderService.selectOrderByOrderNumber(orderNumber);
			if (orderNumber != null) {
				if (order == null) {
					log.error("no found order_id-->" + param);
					return;
				} else {
					if (param.get("order_st").equals("11")) {
						AccountsUsers user = userService.selectUserByPrimaryKey(order.getUserid());
						if (user != null) {
							BigDecimal order_amt = new BigDecimal(param.get(FyConstants.order_amt))
									.divide(new BigDecimal(100));

							// 获取用户余额, 更新余额
							AccountsUsersBalances userBalance = balanceService.selectByUserId(user.getUserid());
							userBalance.setUserbalance(userBalance.getUserbalance().add(order_amt));
							balanceService.updateUserBalance(userBalance);

							// 添加帐户日志
							LogMoneyChange logMoney = new LogMoneyChange(user.getUserid(), user.getUsername(),
									order_amt, BigDecimal.ZERO, userBalance.getUserbalance(), LogMoneyChange.add, "收款",
									new Date());
							logMoneyChangeService.insertLogMoneyChange(logMoney);

							DealOrder dealOrders = dealOrderService.selectOrderByOrderNumber(orderNumber);// 订单更改状态
							dealOrders.setInterfacepercentage(BigDecimal.ZERO);
							dealOrders.setChannelpercentage(BigDecimal.ZERO);
							dealOrders.setChecktime(sdf1.parse(param.get("order_date"))); // 订单审核时间
							dealOrders.setReturntime(sdf1.parse(param.get("order_date"))); // 订单返回时间
							dealOrders.setOrderstate(2);
							dealOrders.setOrdermoney(order_amt);
							dealOrders.setCheckorderid(param.get(FyConstants.Fy_ssn));
							dealOrderService.updateDealOrder(dealOrders);
							
							AccountsCenterMeassage message = new AccountsCenterMeassage();
							message.setUserid(user.getUserid());
							message.setMeassage("您有一笔充值订单已完成!");
							message.setState(0);
							message.setTime(new Date());
							message.setRemark(BaseConstants.depositMsg);
							message.setBackup("1");
							messageService.insertAccountsCenterMeassage(message);
						} else {
							log.error("no found user info  smpGate-->" + param);
						}
					}
				}
			} else {
				log.error("no found DealOrder-->" + param);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Override
	public void smpQueryGate(Map<String, String> param) {

	}

	@Transactional
	@Override
	public void appSmpGate(Map<String, String> param) {
		try {
			String orderNumber = param.get("MCHNTORDERID");
			DealOrder order = dealOrderService.selectOrderByOrderNumber(orderNumber);
			if (orderNumber != null) {
				if (order == null) {
					log.error("no found order_id-->" + param);
					return;
				} else {
					AccountsUsers user = userService.selectUserByPrimaryKey(order.getUserid());
					if (user != null) {
						BigDecimal order_amt = new BigDecimal(param.get("AMT")).divide(new BigDecimal(100));

						AccountsUsersBalances balance = balanceService.selectByUserId(user.getUserid());
						balance.setUserbalance(balance.getUserbalance().add(order_amt)); // 用户根据充值金额返回的实际充值金额(充值金额-手续费)+原有金额
						balanceService.updateUserBalance(balance); // 更新帐户金额

						LogMoneyChange logMoney = new LogMoneyChange(user.getUserid(), user.getUsername(), order_amt,
								BigDecimal.ZERO, balance.getUserbalance(), LogMoneyChange.add, "收款", new Date());
						// 添加帐户日志
						logMoneyChangeService.insertLogMoneyChange(logMoney);

						/**
						 * 订单更改状态
						 */
						DealOrder dealOrders = dealOrderService.selectOrderByOrderNumber(orderNumber);
						dealOrders.setInterfacepercentage(BigDecimal.ZERO);
						dealOrders.setChannelpercentage(BigDecimal.ZERO);
						dealOrders.setChecktime(new Date()); // 订单审核时间
						dealOrders.setReturntime(new Date()); // 订单返回时间
						dealOrders.setCheckorderid(param.get("ORDERID"));
						dealOrders.setOrderstate(2);
						dealOrders.setOrdermoney(order_amt);
						dealOrderService.updateDealOrder(dealOrders);

						AccountsCenterMeassage message = new AccountsCenterMeassage();
						message.setUserid(user.getUserid());
						message.setMeassage("您有一笔充值订单已完成!");
						message.setState(0);
						message.setTime(new Date());
						message.setRemark(BaseConstants.depositMsg);
						message.setBackup("1");
						messageService.insertAccountsCenterMeassage(message);
					} else {
						log.error("no found user info  smpGate-->" + param);
					}
				}
			} else {
				log.error("no found DealOrder-->" + param);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}

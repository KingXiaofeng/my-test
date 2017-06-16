package com.yhb.util;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.lang.StringUtils;

/**
 * 订单流水号生成工具类
 * 
 * @author KRX
 * 
 */
public class OrderNoUtils {

	private static final AtomicLong SERIAL = new AtomicLong();

	/**
	 * 自动增长的流水号的最大长度
	 */
	private static final int MAX_LENGTH = 6;

	/**
	 * 生成唯一订单号串
	 * 
	 * @return 返回订单流水号yyyyMMddHHmmssSSS+6位流水号
	 */
	public static String makeOrderNo() {
		String datetime = DateUtils.formatDate("yyyyMMddHHmmssSSS", new Date());
		return datetime + getSerial(MAX_LENGTH);
	}

	/**
	 * 获取指定长度的流水号
	 * 
	 * @param maxLength
	 *            流水号的最大长度
	 * 
	 * @return 返回流水号
	 */
	private static String getSerial(int maxLength) {
		String serial = String.valueOf(SERIAL.incrementAndGet());

		if (serial.length() > maxLength) {
			return StringUtils.right(serial, maxLength);
		}

		return StringUtils.leftPad(serial, maxLength, "0");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(getSerial(6));
		}

	}

	/**
	 * 订单类型
	 */
	public enum OrderType {
		/**
		 * 发标
		 */
		IssueBidApi("01"),
		/**
		 * 自动投标
		 */
		SubmitBidApi("02"),
		/**
		 * 通用还款
		 */
		RepaymentApi("03"),
		/**
		 * 债权收购
		 */
		CreditPurchaseApi("04"),
		/**
		 * 资金解冻
		 */
		UnfreezeApi("05"),
		/**
		 * 充值
		 */
		RechargeWeb("51"),
		/**
		 * 手动投标
		 */
		SubmitBidWeb("52"),
		/**
		 * 用户还款
		 */
		RepaymentWeb("53"),
		/**
		 * 用户提现
		 */
		WithdrawWeb("54"),
		/**
		 * 债权转让
		 */
		CreditAssignWeb("55"),
		/**
		 * 资金冻结
		 */
		FreezeWeb("56");

		private String code;

		private OrderType(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}
	}
}
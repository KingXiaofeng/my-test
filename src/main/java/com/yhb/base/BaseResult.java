package com.yhb.base;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.yhb.enums.ExceptionEnum;
import com.yhb.util.StringUtil;

/**
 * 
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: BaseResult.java
 * @Description: 统一异常结果类
 * @author:Krx
 * @date: 2017年4月27日 下午1:52:53
 */
public class BaseResult implements Serializable {

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 1L;

	/** 成功标志 */
	protected boolean success;

	/** 返回码 */
	private ExceptionEnum resultCode;

	/** 返回信息 */
	protected String message;

	/**
	 * 构造函数，默认返回码为“SUCCESS”。
	 */
	public BaseResult() {
		resultCode = ExceptionEnum.SUCCESS;
		this.message = resultCode.getMessage();
		success = true;
	}


	/**
	 * 构造函数
	 * 
	 * @param success
	 *            成功标志
	 */
	public BaseResult(boolean success) {
		this.success = success;
		this.resultCode = ExceptionEnum.SYSTEM_FAILURE;
		this.message = resultCode.getMessage();
	}

	/**
	 * 构造函数
	 * 
	 * @param resultCode
	 *            返回码
	 */
	public BaseResult(ExceptionEnum resultCode) {
		success = resultCode == ExceptionEnum.SUCCESS;
		this.resultCode = resultCode;
		this.message = resultCode.getMessage();
	}

	/**
	 * 构造函数
	 * 
	 * @param resultCode
	 *            返回码
	 */
	public BaseResult(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	/**
	 * 构造函数
	 * 
	 * @param resultCode
	 *            返回码
	 */
	public BaseResult(boolean success, ExceptionEnum resultCode) {
		this.success = success;
		this.resultCode = resultCode;
		this.message = resultCode.getMessage();
	}

	/**
	 * 返回结果信息
	 * 
	 * @return 如果resultCode存在，返回resultCode的message，否则返回result中的message字段
	 */
	public String findMessage() {
		return StringUtil.isNotBlank(message) ? message : resultCode.getMessage();
	}

	/*
	 * getters and setters
	 */

	/**
	 * Getter method for property <tt>success</tt>.
	 * 
	 * @return property value of success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Setter method for property <tt>success</tt>.
	 * 
	 * @param success
	 *            value to be assigned to property success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Getter method for property <tt>resultCode</tt>.
	 * 
	 * @return property value of resultCode
	 */
	public ExceptionEnum getResultCode() {
		return resultCode;
	}

	/**
	 * Setter method for property <tt>resultCode</tt>.
	 * 
	 * @param resultCode
	 *            value to be assigned to property resultCode
	 */
	public void setResultCode(ExceptionEnum resultCode) {
		this.resultCode = resultCode;
	}

	/**
	 * Getter method for property <tt>message</tt>.
	 * 
	 * @return property value of message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Setter method for property <tt>message</tt>.
	 * 
	 * @param message
	 *            value to be assigned to property message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}

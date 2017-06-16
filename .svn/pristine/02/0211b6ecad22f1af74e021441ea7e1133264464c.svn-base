package com.yhb.exception;

import com.yhb.bean.CompanyExceptionSeverityBean;

/**
 * 
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: BizException.java
 * @Description: 统一异常层次，便于处理与监控。
 * @author:Krx
 * @date: 2017年4月27日 下午3:17:27
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = 0L;

	/** 严重级别 */
	protected int severity = CompanyExceptionSeverityBean.NORMAL;

	/**
	 * 空构造器。
	 */
	public BizException() {
		super();
	}

	/**
	 * 构造器。
	 * 
	 * @param severity
	 *            严重级别
	 */
	public BizException(int severity) {
		super();

		this.severity = severity;
	}

	/**
	 * 构造器。
	 * 
	 * @param message
	 *            消息
	 */
	public BizException(String message) {
		super(message);
	}

	/**
	 * 构造器。
	 * 
	 * @param message
	 *            消息
	 * @param severity
	 *            严重级别
	 */
	public BizException(String message, int severity) {
		super(message);

		this.severity = severity;
	}

	/**
	 * 构造器。
	 * 
	 * @param cause
	 *            原因
	 */
	public BizException(Throwable cause) {
		super(cause);
	}

	/**
	 * 构造器。
	 * 
	 * @param cause
	 *            原因
	 * @param severity
	 *            严重级别
	 */
	public BizException(Throwable cause, int severity) {
		super(cause);

		this.severity = severity;
	}

	/**
	 * 构造器。
	 * 
	 * @param message
	 *            消息
	 * @param cause
	 *            原因
	 */
	public BizException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 构造器。
	 * 
	 * @param message
	 *            消息
	 * @param cause
	 *            原因
	 * @param severity
	 *            严重级别
	 */
	public BizException(String message, Throwable cause, int severity) {
		super(message, cause);

		this.severity = severity;
	}

	/**
	 * @return Returns the severity.
	 */
	public int getSeverity() {
		return severity;
	}

	/**
	 * @see java.lang.Throwable#toString()
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(super.toString()).append(" - severity: ");

		switch (severity) {
		case CompanyExceptionSeverityBean.MINOR:
			buffer.append("MINOR");
			break;

		case CompanyExceptionSeverityBean.NORMAL:
			buffer.append("NORMAL");
			break;

		case CompanyExceptionSeverityBean.MAJOR:
			buffer.append("MAJOR");
			break;

		case CompanyExceptionSeverityBean.CRITICAL:
			buffer.append("CRITICAL");
			break;

		default:
			buffer.append("UNKNOWN");
		}

		buffer.append("(").append(severity).append(")");

		return buffer.toString();
	}

}

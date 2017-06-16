package com.yhb.util.json;

public class JsonResult {

	// 返回成功
	public static int SUCCESS = 200;
	// 修改银行卡信息需要上传图片返回值
	public static int UPIDMSGVSIDPIC = 201;
	// 返回为空
	public static int NULL = 101;
	// 返回失败
	public static int FAIL = 100;

	/**
	 * 返回代码
	 */
	private int code;

	/**
	 * 提示信息
	 */
	private String msg;

	private Object obj;

	private String token;

	public JsonResult(ServiceResult serviceResult) {
		this.code = serviceResult.getCode();
		this.msg = serviceResult.getMsg();
	}

	public boolean isSuccessed() {
		return getCode() == SUCCESS;
	}

	public JsonResult(int code) {
		this.code = code;
	}

	public JsonResult(int code, Object obj, String msg, String token) {
		this.code = code;
		this.obj = obj;
		this.msg = msg;
		this.token = token;
	}

	public JsonResult(int code, Object obj) {
		this.code = code;
		this.obj = obj;
	}

	public JsonResult(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public JsonResult() {
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}

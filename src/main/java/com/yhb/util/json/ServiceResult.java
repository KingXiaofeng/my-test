package com.yhb.util.json;

public class ServiceResult {

	public static int SUCCESS = 200;
	/**
	 * 返回代码，默认成功
	 */
	private int code = SUCCESS;
	
	/*
	 * 提示信息，默认提示语
	 */
	private String msg = "操作成功"; //
	
	private Object ext = null;
	
	public boolean isSuccessed(){
		return getCode()==SUCCESS;
	}
	
	public ServiceResult(int code){
		this.code = code;
	}
	public ServiceResult(){
	}
	
	public ServiceResult(int code,String msg){
		this.code = code;
		this.msg  = msg;
	}
	public ServiceResult(int code,String msg,Object ext){
		this.code = code;
		this.msg  = msg;
		this.ext = ext;
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

	public Object getExt() {
		return ext;
	}

	public void setExt(Object ext) {
		this.ext = ext;
	}
}

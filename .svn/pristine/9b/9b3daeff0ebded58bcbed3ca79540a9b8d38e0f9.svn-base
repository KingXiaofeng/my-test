/**
 * 
 */
package com.yhb.exception.business;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.yhb.enums.ExceptionEnum;
import com.yhb.exception.BizException;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: SelectException.java
* @Description: 查询异常
* @author:Krx
* @date: 2017年4月27日 下午6:32:15 
*/
public class SelectException  extends BizException{

	// @Fields serialVersionUID : TODO
	private static final long serialVersionUID = 1L;
	
	 /** 返回码 */  
    private ExceptionEnum resultCode;  
  
    /** 
     * 构造函数 
     *  
     * @param resultCode    返回码 
     */  
    public SelectException(ExceptionEnum resultCode) {  
        super();  
        this.resultCode = resultCode;  
    }  
  
    /** 
     * 构造函数 
     *  
     * @param resultCode    返回码 
     * @param e             需要传递的异常 
     */  
    public SelectException(ExceptionEnum resultCode, Throwable e) {  
        super(e);  
        this.resultCode = resultCode;  
    }  
  
    /** 
     * 构造函数 
     *  
     * @param resultCode    返回码 
     * @param message       错误信息 
     */  
    public SelectException(ExceptionEnum resultCode, String message) {  
        super(message);  
        this.resultCode = resultCode;  
    }  
  
    @Override  
    public String toString() {//ToStringBuilder ToStringStyle所属于commons-lang jar包  
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);  
    }  
  
    /* 
     * getter and setter 
     */  
    public ExceptionEnum getResultCode() {  
        return resultCode;  
    }  
  
    public void setResultCode(ExceptionEnum resultCode) {  
        this.resultCode = resultCode;  
    }  

}

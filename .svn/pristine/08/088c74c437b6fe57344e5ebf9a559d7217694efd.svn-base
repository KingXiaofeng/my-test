/**
 * 
 */
package com.yhb.enums;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: ExceptionEnum.java
* @Description: 该类的功能描述
* @author:Krx
* @date: 2017年4月27日 下午6:37:54 
*/
public enum ExceptionEnum {
	 /** 操作成功 */  
    SUCCESS("SUCCESS", "操作成功"),  
  
    /** 系统错误 */  
    SYSTEM_FAILURE("SYSTEM_FAILURE", "系统错误"),  
  
    /** 参数为空 */  
    NULL_ARGUMENT("NULL_ARGUMENT", "参数为空"),  
  
    /** 参数不正确 */  
    ILLEGAL_ARGUMENT("ILLEGAL_ARGUMENT", "参数不正确"),  
  
    /** 邮箱非法 */  
    EMAIL_ILLEGAL("EMAIL_ILLEGAL", "邮箱非法")  
  
    ;  
    /** 枚举值 */  
    private String value;  
  
    /** 枚举信息 */  
    private String message;  
  
    private ExceptionEnum(String value, String message) {  
        this.value = value;  
        this.message = message;  
    }  
  
    /** 
     * 根据枚举值获取枚举对象，如果找不到对应的枚举返回<code>null</code> 
     * 
     * @param value 枚举值 
     * @return 枚举对象 
     */  
    public static ExceptionEnum getEnumByValue(String value) {  
        for (ExceptionEnum resultCode : ExceptionEnum.values()) {  
            if (resultCode.getValue().equals(value)) {  
                return resultCode;  
            }  
        }  
        return null;  
    }  
  
    /* 
     * getter 
     */  
    public String getValue() {  
        return value;  
    }  
  
    public String getMessage() {  
        return message;  
    }  
}

package com.yhb.enums;

import java.util.ArrayList;
import java.util.List;

import com.yhb.util.StringUtil;

/**
 * 
* @ClassName: FileTypeEnum.java
* @Description: 文件类型枚举类 : image、flash、media、file
*
* @version: v1.0.0
* @author: wangxf
* @date: 2017年5月12日 上午9:22:07 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2017年5月12日     wangxf           v1.0.0               修改原因
 */
public enum FileTypeEnum {
	
	/*
	 * 图片
	 */
	IMAGE("image","gif,jpg,jpeg,png,bmp"),
	/*
	 * flash
	 */
	FLASH("flash","swf,flv"),
	/*
	 * 视频
	 */
	MEDIA("media","swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb"),
	/*
	 * 文件
	 */
	FILE("file","doc,docx,xls,xlsx,ppt,pptx,pdf,htm,html,txt,zip,rar,gz,bz2")
	
	;
	
	/*
	 * 文件类型集合：image、flash、media、file
	 */
	public static List<String> fileTypeList = null;
	/*
	 * 图片的大小限制500k
	 */
	public static long maxSize = 512000;  
	
	static {
		// 图片集合
		fileTypeList = new ArrayList<String>();
		fileTypeList.add(IMAGE.getCode());
		fileTypeList.add(FLASH.getCode());
		fileTypeList.add(MEDIA.getCode());
		fileTypeList.add(FILE.getCode());
	}
	
	/**
	 * 
	* @Function: FileTypeEnum.java
	* @Description: 根据枚举code，获取对应的枚举对象
	*
	* @param: String code
	* @return： FileTypeEnum
	* @throws： 
	*
	* @version: v1.0.0
	* @author: wangxf
	* @date: 2017年5月12日 上午9:46:43 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月12日     wangxf           v1.0.0               修改原因
	 */
	public static FileTypeEnum getCodeValueByCode(String code){
		
		if( StringUtil.isBlank(code) ){
			return null;
		}
		
		for( FileTypeEnum fileTypeEnum : FileTypeEnum.values() ){
			if( fileTypeEnum.getCode().equals(code) ){
				return fileTypeEnum;
			}
		}
		return null;
	}
	
	private final String code;
	private final String codeValue;
	
	public String getCode() {
		return code;
	}

	public String getCodeValue() {
		return codeValue;
	}

	private FileTypeEnum(String code, String codeValue) {
		this.code = code;
		this.codeValue = codeValue;
	}
}

/**
 * 
 */
package com.yhb.util;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: CommentGenerator.java
 * @Description: 生成model中，字段增加注释
 * @author:Krx
 * @date: 2017年4月27日 上午11:50:19
 */
public class CommentGenerator extends DefaultCommentGenerator {

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		super.addFieldComment(field, introspectedTable, introspectedColumn);
		if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
			field.addJavaDocLine("/**");
			field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
			addJavadocTag(field, false);
			field.addJavaDocLine(" */");
		}
	}

}

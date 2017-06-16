package com.yhb.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: BaseService.java
 * @Description: BaseService接口
 * @author:Krx
 * @date: 2017年4月27日 下午1:53:09
 */
public interface BaseService<Record, Example> {

	int countByExample(Example example);

	int deleteByExample(Example example);

	int deleteByPrimaryKey(Integer id);

	int insert(Record record);

	int insertSelective(Record record);

	List<Record> selectByExampleWithBLOBs(Example example);

	List<Record> selectByExample(Example example);

	Record selectFirstByExample(Example example);

	Record selectFirstByExampleWithBLOBs(Example example);

	Record selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

	int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example);

	int updateByExample(@Param("record") Record record, @Param("example") Example example);

	int updateByPrimaryKeySelective(Record record);

	int updateByPrimaryKeyWithBLOBs(Record record);

	int updateByPrimaryKey(Record record);

	int deleteByPrimaryKeys(String ids);

	void initMapper();
}
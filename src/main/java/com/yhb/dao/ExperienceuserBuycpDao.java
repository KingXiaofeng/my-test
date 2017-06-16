package com.yhb.dao;

import com.yhb.bean.entity.ExperienceuserBuycp;
import com.yhb.bean.entity.ExperienceuserBuycpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceuserBuycpDao {
    int countByExample(ExperienceuserBuycpExample example);

    int deleteByExample(ExperienceuserBuycpExample example);

    int deleteByPrimaryKey(Integer experienceusercpid);

    int insert(ExperienceuserBuycp record);

    int insertSelective(ExperienceuserBuycp record);

    List<ExperienceuserBuycp> selectByExampleWithBLOBs(ExperienceuserBuycpExample example);

    List<ExperienceuserBuycp> selectByExample(ExperienceuserBuycpExample example);

    ExperienceuserBuycp selectByPrimaryKey(Integer experienceusercpid);

    int updateByExampleSelective(@Param("record") ExperienceuserBuycp record, @Param("example") ExperienceuserBuycpExample example);

    int updateByExampleWithBLOBs(@Param("record") ExperienceuserBuycp record, @Param("example") ExperienceuserBuycpExample example);

    int updateByExample(@Param("record") ExperienceuserBuycp record, @Param("example") ExperienceuserBuycpExample example);

    int updateByPrimaryKeySelective(ExperienceuserBuycp record);

    int updateByPrimaryKeyWithBLOBs(ExperienceuserBuycp record);

    int updateByPrimaryKey(ExperienceuserBuycp record);
}
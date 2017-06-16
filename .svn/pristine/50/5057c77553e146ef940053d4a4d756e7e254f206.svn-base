package com.yhb.dao;

import com.yhb.bean.entity.ExperienceCP;
import com.yhb.bean.entity.ExperienceCPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceCPDao {
    int countByExample(ExperienceCPExample example);

    int deleteByExample(ExperienceCPExample example);

    int deleteByPrimaryKey(Integer experiencecpid);

    int insert(ExperienceCP record);

    int insertSelective(ExperienceCP record);

    List<ExperienceCP> selectByExampleWithBLOBs(ExperienceCPExample example);

    List<ExperienceCP> selectByExample(ExperienceCPExample example);

    ExperienceCP selectByPrimaryKey(Integer experiencecpid);

    int updateByExampleSelective(@Param("record") ExperienceCP record, @Param("example") ExperienceCPExample example);

    int updateByExampleWithBLOBs(@Param("record") ExperienceCP record, @Param("example") ExperienceCPExample example);

    int updateByExample(@Param("record") ExperienceCP record, @Param("example") ExperienceCPExample example);

    int updateByPrimaryKeySelective(ExperienceCP record);

    int updateByPrimaryKeyWithBLOBs(ExperienceCP record);

    int updateByPrimaryKey(ExperienceCP record);
}
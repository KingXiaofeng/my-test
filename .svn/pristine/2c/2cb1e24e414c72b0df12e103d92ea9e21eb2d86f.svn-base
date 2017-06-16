package com.yhb.dao;

import com.yhb.bean.entity.BannerManage;
import com.yhb.bean.entity.BannerManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerManageDao {
    int countByExample(BannerManageExample example);

    int deleteByExample(BannerManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BannerManage record);

    int insertSelective(BannerManage record);

    List<BannerManage> selectByExample(BannerManageExample example);

    BannerManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BannerManage record, @Param("example") BannerManageExample example);

    int updateByExample(@Param("record") BannerManage record, @Param("example") BannerManageExample example);

    int updateByPrimaryKeySelective(BannerManage record);

    int updateByPrimaryKey(BannerManage record);
}
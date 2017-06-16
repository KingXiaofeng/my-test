package com.yhb.dao;

import com.yhb.bean.entity.ArticleDetail;
import com.yhb.bean.entity.ArticleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleDetailDao {
    int countByExample(ArticleDetailExample example);

    int deleteByExample(ArticleDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleDetail record);

    int insertSelective(ArticleDetail record);

    List<ArticleDetail> selectByExampleWithBLOBs(ArticleDetailExample example);

    List<ArticleDetail> selectByExample(ArticleDetailExample example);

    ArticleDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleDetail record, @Param("example") ArticleDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleDetail record, @Param("example") ArticleDetailExample example);

    int updateByExample(@Param("record") ArticleDetail record, @Param("example") ArticleDetailExample example);

    int updateByPrimaryKeySelective(ArticleDetail record);

    int updateByPrimaryKeyWithBLOBs(ArticleDetail record);

    int updateByPrimaryKey(ArticleDetail record);
}
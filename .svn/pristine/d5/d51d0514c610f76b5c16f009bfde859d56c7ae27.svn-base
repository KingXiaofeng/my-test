package com.yhb.dao;

import com.yhb.bean.entity.DealOrder;
import com.yhb.bean.entity.DealOrderExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DealOrderDao {
    int countByExample(DealOrderExample example);

    int deleteByExample(DealOrderExample example);

    int deleteByPrimaryKey(String ordernumber);

    int insert(DealOrder record);

    int insertSelective(DealOrder record);

    List<DealOrder> selectByExample(DealOrderExample example);

    DealOrder selectByPrimaryKey(String ordernumber);

    int updateByExampleSelective(@Param("record") DealOrder record, @Param("example") DealOrderExample example);

    int updateByExample(@Param("record") DealOrder record, @Param("example") DealOrderExample example);

    int updateByPrimaryKeySelective(DealOrder record);

    int updateByPrimaryKey(DealOrder record);
    
    /**
     * 
    * @Function: DealOrderDao.java
    * @Description: 首页获取投资记录（20条）
    *
    * @param:描述1描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: wangxf
    * @date: 2017年5月11日 下午1:43:49 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2017年5月11日     wangxf           v1.0.0               修改原因
     */
    List<DealOrder> selectInvestmentRecord();
}
package com.yhb.dao;

import com.yhb.bean.entity.BaseBankcard;
import com.yhb.bean.entity.BaseBankcardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseBankcardDao {
    int countByExample(BaseBankcardExample example);

    int deleteByExample(BaseBankcardExample example);

    int deleteByPrimaryKey(Integer bankcardid);

    int insert(BaseBankcard record);

    int insertSelective(BaseBankcard record);

    List<BaseBankcard> selectByExampleWithBLOBs(BaseBankcardExample example);

    List<BaseBankcard> selectByExample(BaseBankcardExample example);

    BaseBankcard selectByPrimaryKey(Integer bankcardid);

    int updateByExampleSelective(@Param("record") BaseBankcard record, @Param("example") BaseBankcardExample example);

    int updateByExampleWithBLOBs(@Param("record") BaseBankcard record, @Param("example") BaseBankcardExample example);

    int updateByExample(@Param("record") BaseBankcard record, @Param("example") BaseBankcardExample example);

    int updateByPrimaryKeySelective(BaseBankcard record);

    int updateByPrimaryKeyWithBLOBs(BaseBankcard record);

    int updateByPrimaryKey(BaseBankcard record);

    /**
     *
     * @Function: BaseBankcardDao.java
     * @Description: 根据userId查询银行卡信息:加密
     *
     * @param: userId
     * @return：BaseBankcard
     * @throws：
     *
     * @version: v1.0.0
     * @author: wangxf
     * @date: 2017年5月13日 下午2:00:53
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2017年5月13日     wangxf           v1.0.0               修改原因
     */
    BaseBankcard selectForMd5ByUserId(String userId);
}
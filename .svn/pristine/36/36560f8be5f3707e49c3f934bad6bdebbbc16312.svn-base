package com.yhb.dao;

import com.yhb.bean.entity.FinanceproductsAdmin;
import com.yhb.bean.entity.FinanceproductsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceproductsAdminDao {
    int countByExample(FinanceproductsAdminExample example);

    int deleteByExample(FinanceproductsAdminExample example);

    int deleteByPrimaryKey(Integer fpid);

    int insert(FinanceproductsAdmin record);

    int insertSelective(FinanceproductsAdmin record);

    List<FinanceproductsAdmin> selectByExampleWithBLOBs(FinanceproductsAdminExample example);

    List<FinanceproductsAdmin> selectByExample(FinanceproductsAdminExample example);

    FinanceproductsAdmin selectByPrimaryKey(Integer fpid);
    
    List<FinanceproductsAdmin> getIndexPro();

    int updateByExampleSelective(@Param("record") FinanceproductsAdmin record, @Param("example") FinanceproductsAdminExample example);

    int updateByExampleWithBLOBs(@Param("record") FinanceproductsAdmin record, @Param("example") FinanceproductsAdminExample example);

    int updateByExample(@Param("record") FinanceproductsAdmin record, @Param("example") FinanceproductsAdminExample example);

    int updateByPrimaryKeySelective(FinanceproductsAdmin record);

    int updateByPrimaryKeyWithBLOBs(FinanceproductsAdmin record);

    int updateByPrimaryKey(FinanceproductsAdmin record);
}
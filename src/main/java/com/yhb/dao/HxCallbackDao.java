package com.yhb.dao;

import com.yhb.bean.entity.HxCallback;
import com.yhb.bean.entity.HxCallbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HxCallbackDao {
    int countByExample(HxCallbackExample example);

    int deleteByExample(HxCallbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HxCallback record);

    int insertSelective(HxCallback record);

    List<HxCallback> selectByExampleWithBLOBs(HxCallbackExample example);

    List<HxCallback> selectByExample(HxCallbackExample example);

    HxCallback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HxCallback record, @Param("example") HxCallbackExample example);

    int updateByExampleWithBLOBs(@Param("record") HxCallback record, @Param("example") HxCallbackExample example);

    int updateByExample(@Param("record") HxCallback record, @Param("example") HxCallbackExample example);

    int updateByPrimaryKeySelective(HxCallback record);

    int updateByPrimaryKeyWithBLOBs(HxCallback record);

    int updateByPrimaryKey(HxCallback record);
}
package com.yhb.service.common.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.bean.entity.BannerManage;
import com.yhb.bean.entity.BannerManageExample;
import com.yhb.bean.entity.BannerManageExample.Criteria;
import com.yhb.dao.BannerManageDao;
import com.yhb.service.common.BannerManageService;

/**
 * 
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: BannerManageServiceImpl.java
* @Description: banner图片实现类
*
* @version: v1.0.0
* @author: wqw
* @date: 2017年5月9日 上午10:31:08 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2017年5月9日     wqw           v1.0.0               修改原因
 */
@Service
@Transactional
public class BannerManageServiceImpl implements BannerManageService {
	@Autowired
	BannerManageDao bannerManagedao;
	
	/**
	 * 
	* @see BannerManageService#selectByExample(int)
	* @Function: BannerManageServiceImpl.java
	* @Description: type=1的图片查询出来
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: wqw
	* @date: 2017年5月9日 上午10:53:07 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2017年5月9日     wqw           v1.0.0               修改原因
	 */
	@Override
	public List<BannerManage> selectByExample(int type) {
		BannerManageExample example=new BannerManageExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(Byte.valueOf((byte) type));
		example.setOrderByClause("orders desc");
		return  bannerManagedao.selectByExample(example);
	}

}

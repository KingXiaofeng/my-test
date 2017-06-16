/**
 * 
 */
package com.yhb.service.activity.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhb.dao.ExperienceuserBuycpDao;
import com.yhb.service.activity.ExperienceuserBuycpService;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: ExperienceuserBuycpServiceImpl.java
* @Description: 该类的功能描述
* @author:Krx
* @date: 2017年5月16日 上午11:05:48 
*/
@Service
@Transactional
public class ExperienceuserBuycpServiceImpl implements ExperienceuserBuycpService {

	@Autowired
	ExperienceuserBuycpDao  experienceuserBuycpDao;
}

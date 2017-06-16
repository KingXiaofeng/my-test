package com.yhb.controller;

import com.yhb.requesturl.NewsBulletinRequestUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yhb.service.news.NewsBulletinService;

/**
 * @ClassName: NewsBulletinController.java
 * @Description: 新闻公告相关信息入口-Controller
 * @version: v1.0.0
 * @author: wangxf
 * @date: 2017年5月10日 上午10:15:40
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2017年5月10日     wangxf           v1.0.0               修改原因
 */
@Controller
@RequestMapping(NewsBulletinRequestUrl.news)

public class NewsBulletinController {

	@Autowired
	NewsBulletinService newsBulletinService;

}

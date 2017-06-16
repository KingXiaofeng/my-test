/**
 * 
 */
package com.yhb.listener;

import com.yhb.annotation.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;
import java.util.Map;

/**   
* Copyright: Copyright (c) 2017 LanRu-Caifu
* 
* @ClassName: ApplicationContextListener.java
* @Description: Spring容器初始化完成事件
* @author:Krx
* @date: 2017年5月5日 下午2:46:41 
*/
public class ApplicationContextListener implements ApplicationListener<ContextRefreshedEvent>{
	private static Logger logger = LoggerFactory.getLogger(ApplicationContextListener.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		  // root application context
        if(null == contextRefreshedEvent.getApplicationContext().getParent()) {
        	logger.info(">>>>> spring初始化完毕 <<<<<");
            // spring初始化完毕后，通过反射调用所有使用BaseService注解的initMapper方法
            Map<String, Object> services = contextRefreshedEvent.getApplicationContext().getBeansWithAnnotation(BaseService.class);
            for(Object service : services.values()) {
            	logger.info(">>>>> {}.initMapper()", service.getClass().getName());
                try {
                    Method initMapper = service.getClass().getMethod("initMapper");
                    initMapper.invoke(service);
                    Thread thread = null;
                } catch (Exception e) {
                	logger.error("初始化service的initMapper方法异常", e);
                    e.printStackTrace();
                }
            }
        }
	}
}

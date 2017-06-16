package com.yhb.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;



public class SysUserFilter extends PathMatchingFilter {

//	@Autowired
	

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {

        String username = (String)SecurityUtils.getSubject().getPrincipal();
//        UserFormMap userFormMap = new UserFormMap();
//		userFormMap.put("accountName", "" + username + "");
//        request.setAttribute("user", userMapper.findByNames(userFormMap));
        return true;
    }
}
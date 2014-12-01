/**
* 文件名：ValidLoginInterceptor.java
* 创建日期： 2014年12月1日
* 作者：     Administrator
* Copyright (c) 2009-2011 无线开发室
* All rights reserved.
 
* 修改记录：
* 	1.修改时间：2014年12月1日
*   修改人：Administrator
*   修改内容：
*/
package com.hujun.spring.mybatis.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hujun.spring.mybatis.common.CookieUtils;

/**
 * 功能描述：
 *
 */
public class ValidLoginInterceptor extends HandlerInterceptorAdapter
{

    private static final String SID = "sid";
    @Override
    public boolean preHandle(HttpServletRequest request,
        HttpServletResponse response, Object handler) throws Exception
    {
        // TODO Auto-generated method stub
        String sid = request.getParameter(SID);
        
        String userId = CookieUtils.getCookie(request, sid);
        if(StringUtils.isEmpty(userId)){
            
        }else{
            
        }
        return true;
    }
    
}

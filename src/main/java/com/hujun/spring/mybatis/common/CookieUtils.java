package com.hujun.spring.mybatis.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

public final class CookieUtils
{
    public static String getCookie(HttpServletRequest request,String key){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie == null || StringUtils.isEmpty(cookie)){
                return null;
            }else if(cookie.getName().equalsIgnoreCase(key)){
                return cookie.getValue();
            }
        }
        return null;
    }
}

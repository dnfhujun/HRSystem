/**
* 文件名：User.java
* 创建日期： 2014年12月1日
* 作者：     Administrator
* Copyright (c) 2009-2011 无线开发室
* All rights reserved.
 
* 修改记录：
* 	1.修改时间：2014年12月1日
*   修改人：Administrator
*   修改内容：
*/
package com.hujun.spring.mybatis.model;

import java.io.Serializable;

import com.google.code.ssm.api.CacheKeyMethod;

/**
 * 功能描述：
 *
 */
public class User implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private String userName;
    
    @CacheKeyMethod  
    public long getUserId()
    {
        return userId;
    }
    public void setUserId(long userId)
    {
        this.userId = userId;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    
}

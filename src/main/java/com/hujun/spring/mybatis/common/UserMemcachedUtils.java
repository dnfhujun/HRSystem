package com.hujun.spring.mybatis.common;

import java.util.HashMap;
import java.util.Map;

import com.google.code.ssm.api.InvalidateSingleCache;
import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;
import com.hujun.spring.mybatis.model.User;


public final class UserMemcachedUtils
{
    private static Map<Long,User> users=new HashMap<Long,User>();  
    
    public static void saveUser(User user) { 
        users.put(user.getUserId(), user);
    }
    
    @ReadThroughSingleCache(expiration = 3600)  
    public static User getById(@ParameterValueKeyProvider String userId) {  
        System.out.println(userId);  
        return users.get(userId);  
    } 
    
    @InvalidateSingleCache()  
    public static void deleteUser(@ParameterValueKeyProvider String userId) {  
        users.remove(userId);  
    }  
}

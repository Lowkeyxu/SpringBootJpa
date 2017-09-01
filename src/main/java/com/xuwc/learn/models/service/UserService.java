/*
 * @(#) UserService.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.service;

import com.xuwc.learn.models.entity.User;

import java.util.List;

/** 用户service
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */
public interface UserService {
    //获取用户信息
    User getUserInfo(String id);
    //获取所有用户
    List<User> getAll();
}

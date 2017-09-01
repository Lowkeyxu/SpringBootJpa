/*
 * @(#) UserServiceImpl.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.service.impl;

import com.xuwc.learn.models.entity.User;
import com.xuwc.learn.models.repository.UserRepository;
import com.xuwc.learn.models.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/** 接口实现
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    // 用户 repository
    @Autowired
    private UserRepository userRepository;

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @Override
    public User getUserInfo(String id) {
        return userRepository.getUserInfo(id);
    }

    /**
     * 调用内置方法
     * @return
     */
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}

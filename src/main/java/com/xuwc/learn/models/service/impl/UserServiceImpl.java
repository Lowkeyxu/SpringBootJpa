/*
 * @(#) UserServiceImpl.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.service.impl;

import com.xuwc.learn.models.entity.Article;
import com.xuwc.learn.models.entity.User;
import com.xuwc.learn.models.repository.ArticleRepository;
import com.xuwc.learn.models.repository.UserRepository;
import com.xuwc.learn.models.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    @Autowired
    private ArticleRepository articleRepository;

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

    /***
     * 根据用户名查询
     * @param userName
     * @return
     */
    @Override
    public List<User> findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    /**
     * 根据性别查询
     * @param sex
     * @return
     */
    @Override
    public List<User> findBySex(String sex) {
        return userRepository.findBySex(sex);
    }

    /**
     * 根据用户名和性别查询
     * @param userName
     * @param sex
     * @return
     */
    @Override
    public List<User> findByUserNameAndSex(String userName, String sex) {
        return userRepository.findByUserNameAndSex(userName, sex);
    }

    /**
     * 多表查询
     * @param userId
     * @return
     */
    @Override
    public List<Article> queryAllByUserId(String userId) {
        return articleRepository.queryAllByUserId(userId);
    }
}

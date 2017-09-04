/*
 * @(#) UserController.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.controller;

import com.xuwc.learn.models.entity.User;
import com.xuwc.learn.models.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 用户Controller
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */
@RestController
@RequestMapping("users")
public class UserController {

    //用户service
    @Autowired
    private UserService userService;

    //首页
    @RequestMapping("")
    public String index(){
        //测试查询所有
        userService.getAll();
        //测试用户名查询
        userService.findByUserName("xsc");
        //测试性别查询
        userService.findBySex("1");
        //测试用户名加性别查询
        userService.findByUserNameAndSex("xsc","1");
        //多表查询
        userService.queryAllByUserId("1");
        return "This Is My First JPA Demo!!!";
    }

    /**
     *  获取用户信息
     * @param id
     * @return
     */
    @RequestMapping("getUser")
    public User getUser(String id){
        return userService.getUserInfo(id);
    }
}

/*
 * @(#) UserController.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.controller;

import com.xuwc.learn.models.entity.Article;
import com.xuwc.learn.models.entity.User;
import com.xuwc.learn.models.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/** 用户Controller
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */
@Controller
@RequestMapping("users")
public class UserController {
    //log
    private static Logger logger = LogManager.getLogger(UserController.class);

    //用户service
    @Autowired
    private UserService userService;

    //首页
    @RequestMapping("")
    public String index(ModelMap map){
        //测试查询所有
        List<User> userList = userService.getAll();
        //测试用户名查询
        List<User> userList1 = userService.findByUserName("111");
        //测试性别查询
        List<User> userList2 = userService.findBySex("2");
        //测试用户名加性别查询
        List<User> userList3 = userService.findByUserNameAndSex("111","2");
        //多表查询
        List<Article> articleList = userService.queryAllByUserId("1");
        map.put("userList",userList);
        map.put("userList1",userList1);
        map.put("userList2",userList2);
        map.put("userList2",userList2);
        map.put("articleList",articleList);
        return "index";
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

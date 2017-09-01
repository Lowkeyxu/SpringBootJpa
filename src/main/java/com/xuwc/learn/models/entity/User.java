/*
 * @(#) User.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.entity;

import com.xuwc.learn.common.base.entity.BaseEntity;

import javax.persistence.*;

/** 用户实体类
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */
@Entity
@Table(name = "sys_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 6478021448802033208L;

    //id
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;
    //登录名
    @Column(name = "loginname")
    private String loginName;
    //用户名
    @Column(name = "username")
    private String userName;
    //性别
    @Column(name = "sex")
    private String sex;
    //密码
    @Column(name = "password")
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

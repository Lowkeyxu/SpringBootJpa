/*
 * @(#) BaseEntity.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.common.base.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/** 共通Entity
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */

@Entity
@Table(name = "sys_common")
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity implements Serializable{

    private static final long serialVersionUID = -8820913334214200448L;

    private final static String DEFAULT_VALUE = "0";

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;
    //删除标识(0:有效,1:删除)
    @Column(name = "delflag")
    private String delFlag;
    //创建时间
    @Column(name = "addtime")
    @Temporal(TemporalType.DATE)
    private Date addTime;
    //创建者
    @Column(name = "adduserid")
    private String addUserId;
    //更新时间
    @Column(name = "updtime")
    @Temporal(TemporalType.DATE)
    private Date updTime;
    //更新者
    @Column(name = "upduserid")
    private String updUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public String getUpdUserId() {
        return updUserId;
    }

    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId;
    }

    //新增
    public void preInsert(String userId) {
        this.addUserId = userId;
        this.addTime = new Date();
        this.updUserId = this.addUserId;
        this.updTime = new Date();
        this.delFlag = DEFAULT_VALUE;
    }

    //编辑
    public void preUpdate(String userId) {
        this.updUserId = this.addUserId;
        this.updTime = new Date();
    }
}

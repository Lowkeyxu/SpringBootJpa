/*
 * @(#) Article.java 2017/9/4
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xuwc.learn.common.base.entity.BaseEntity;
import javax.persistence.*;
import java.util.Date;

/** 用户文章表
 * @author xuwc
 * @version 1.0
 * @since 2017/9/4
 */
@Entity
@Table(name = "sys_article")
public class Article extends BaseEntity{

    private static final long serialVersionUID = 6478021448802036208L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;
    @Column(name = "userid")
    private String userId;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
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

//    @JsonIgnore
//    @ManyToOne(targetEntity = User.class)
//    @JoinColumn(name = "userid",referencedColumnName = "id",insertable = false,updatable = false)
  //  private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Article article = (Article) obj;

        return id != null ? id.equals(article.id) : article.id == null;
    }

    @Override
    public String toString() {
        String str = "{id=" + id + ",userId="+userId+",title="+title+",content="+content+
                ",delFlag="+delFlag+",addTime="+addTime+",addUserId="+addUserId
                +",updTime="+updTime+",updUserId="+updUserId+"}\n";
        return str;
    }
}

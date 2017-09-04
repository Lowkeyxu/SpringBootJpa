/*
 * @(#) UserRepository.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.repository;

import com.xuwc.learn.models.entity.Article;
import com.xuwc.learn.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/** 用户Repository
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */
@Repository
public interface UserRepository extends JpaSpecificationExecutor<User>,JpaRepository<User,Long> {

    /**
     *  查询用户信息
     * @param id
     * @return
     */
    @Query(nativeQuery = true,value = " SELECT * FROM  sys_user WHERE id = ?1")
    User getUserInfo(String id);
    //按照用户名查询
    User findByUserName(String userName);
    //按照性别查询
    User findBySex(String sex);
    //测试用户名和性别查询
    User findByUserNameAndSex(String userName,String sex);
    //多表查询
    List<Article> queryAllByUserId(String userId);

}

/*
 * @(#) UserRepository.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.repository;

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
}
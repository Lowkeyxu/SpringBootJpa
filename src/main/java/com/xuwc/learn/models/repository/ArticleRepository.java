/*
 * @(#) ArticleRepository.java 2017/9/4
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.models.repository;

import com.xuwc.learn.models.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xuwc
 * @version 1.0
 * @since 2017/9/4
 */
@RequestMapping
public interface ArticleRepository extends JpaSpecificationExecutor<Article>,JpaRepository<Article,Long> {

    //多表查询
    List<Article> queryAllByUserId(String userId);

}

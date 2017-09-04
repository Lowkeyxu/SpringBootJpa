/*
 * @(#) BaseEntity.java 2017/9/1
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.common.base.entity;

import javax.persistence.*;
import java.io.Serializable;

/** 共通Entity
 * @author xuwc
 * @version 1.0
 * @since 2017/9/1
 */

@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity implements Serializable{

    private static final long serialVersionUID = -8820913334214200448L;

}

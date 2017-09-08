/*
 * @(#) MyInterceptor.java 2017/9/8
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.learn.common.interceptor;


import com.xuwc.learn.models.controller.UserController;
import com.xuwc.learn.utils.WebUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/** 拦截器
 * @author xuwc
 * @version 1.0
 * @since 2017/9/8
 */
public class MyInterceptor implements HandlerInterceptor{

    private static Logger logger = LogManager.getLogger(MyInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info(">>>>>>>>>>>在请求处理之前进行调用（Controller方法调用之前）<<<<<<<<<<<<<");
        String ip = WebUtils.getIpAddr(httpServletRequest);
        HandlerMethod handlerMethod = (HandlerMethod) o;
        Method method = handlerMethod.getMethod();
        logger.info("用户:"+ip+",访问目标:"+method.getDeclaringClass().getName() + "." + method.getName());
        String ctx = httpServletRequest.getScheme() + "://"+httpServletRequest.getServerName()+":"+httpServletRequest.getServerPort()+httpServletRequest.getContextPath();
        httpServletRequest.setAttribute("ctx", ctx);
        return true;//返回true 才会继续往下执行
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info(">>>>>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）<<<<<<<<<<<<<");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        logger.info(">>>>>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）<<<<<<<<<<<<<");
    }
}

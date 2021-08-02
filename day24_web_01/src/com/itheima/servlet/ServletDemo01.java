package com.itheima.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * 包名:com.itheima.servlet
 *
 * @author Leevi
 * 日期2020-10-12  11:01
 * 编写Servlet的步骤:
 * 1. 实现Servlet接口，重写方法
 * 2. 配置Servlet的映射路径(目的就是让浏览器能够访问到Servlet)
 *    方式一: 配置文件方式
 *
 *    方式二: 注解方式 WebServlet注解
 * 一个Servlet可以配置多个映射路径，但是多个Servlet不能配置相同的映射路径
 *
 *
 * Servlet的三种映射路径的配置:
 * 1. 完整路径匹配:一定要以"/"开头，类似"/demo01"那么就说明客户端的路径只有是"/demo01"才能访问到这个Servlet
 * 2. 目录匹配:一定要以"/"开头，类似"/*"或者"/demo/*",那么客户端访问这个Servlet只要匹配/*之前的路径就行了
 * 3. 扩展名匹配: 一定不要以"/"开头，类似"*.do"或者"*.in",那么客户端访问这个Servlet只需要匹配后缀即可
 *
 * Servlet的生命周期: Servlet对象从创建到销毁的整个过程
 * 1. Servlet对象什么时候创建: 默认情况下，是在第一次有请求访问这个Servlet的时候创建
 * 2. Servlet对象什么时候销毁: 服务器关闭，或者该项目从服务器移除的时候销毁
 *
 * Servlet的生命周期方法: 在Servlet的生命周期的各个不同的阶段所执行的方法
 * 1. init: 在Servlet创建的时候执行的方法,我们通常在这个方法中做一些初始化数据读取的操作
 * 2. service: 在Servlet每次接收处理请求的时候执行的方法
 * 3. destroy: 在Servlet销毁的时候执行的方法,执行一些资源回收，或者资源备份的操作
 *
 * Servlet可以配置启动项: 在服务器启动的时候就创建
 */
//@WebServlet(value = "/demo01",loadOnStartup = 1)
public class ServletDemo01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //在init方法中，读取当前Servlet的初始化参数
        String initParam = servletConfig.getInitParameter("ContextConfigLocation");
        System.out.println("ServletDemo01对象被创建出来了..."+initParam);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //查询数据库，使用响应将数据响应给浏览器
        System.out.println("Hello........");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("ServletDemo01对象被销毁了...");
    }
}

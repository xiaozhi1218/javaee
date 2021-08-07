package com.itheima.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 包名:com.itheima.listener
 * @author Leevi
 * 日期2020-10-18  11:52
 * 1. 写一个类实现ServletContextListener接口，重写方法
 *    1. contextInitialized(): 监听服务器启动的方法
 *    2. contextDestroyed(): 监听服务器关闭的方法
 *
 * 2. 在web.xml中配置监听器
 */
public class MyServletContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("服务器启动了....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("服务器关闭了....");
    }
}

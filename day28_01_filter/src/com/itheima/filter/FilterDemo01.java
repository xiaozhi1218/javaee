package com.itheima.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-18  08:42
 * Filter的编写步骤:
 * 1. 写一个类实现Filter接口，并且重写方法
 * 2. 配置Filter的拦截路径:
 *    1. 注解方式配置
 *    2. 配置文件方式配置
 *
 * Filter的生命周期:
 * 1. Filter什么时候创建: 服务器启动的时候
 * 2. Filter什么时候销毁: 服务器关闭的时候
 *
 * Filter的生命周期方法:
 * 1. init(): 会在Filter对象被创建出来的时候执行, 这里面通常是从配置文件中读取一些初始化的数据(耗时操作)
 * 2. destroy(): 会在Filter对象销毁的时候执行, 可以进行一些序列化保存备份工作
 * 3. doFilter(): 会在Filter每次过滤请求的时候执行, 真正执行过滤
 *
 * Filter的三种拦截路径的介绍:
 * 1. 精确匹配: "/demo01"
 * 2. 模糊匹配: "/*"
 * 3. 扩展名匹配: "*.jsp"
 */
//@WebFilter("/demo01")
public class FilterDemo01 implements Filter {
    @Override
    public void destroy() {
        System.out.println("FilterDemo01销毁了。。。");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo01拦截到了请求...");

        //放行:让这次请求通过，去到它想去的地方
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("FilterDemo01被创建出来了。。。");
    }
}

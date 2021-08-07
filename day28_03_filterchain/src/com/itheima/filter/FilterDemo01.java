package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-18  09:17
 * 在过滤链中，注解方式配置拦截路径的话，那么就看名字的排序谁在前面谁就先拦截
 * 配置文件方式配置拦截路径的话，谁先配置就谁先拦截
 * 如果是配置文件和注解混合方式的话, 配置文件的优先
 */
@WebFilter("/*")
public class FilterDemo01 implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo01收到了请求...");

        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }

}

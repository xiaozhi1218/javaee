package com.itheima.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-18  09:17
 */
//@WebFilter("/*")
public class FilterDemo02 implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo02收到了请求...");

        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}

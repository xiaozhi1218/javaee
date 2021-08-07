package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/**
 * @author Leevi
 * 日期2020-10-18  09:05
 * 过滤器默认只会拦截客户端发起的请求，不会拦截转发的请求
 * 过滤器可以通过配置DispatcherType来设置过滤器的拦截方式:
 * 1. REQUEST(默认)表示只拦截客户端的请求
 * 2. FORWARD表示只拦截转发的请求
 * 如果既要拦截客户端的请求，又要拦截转发的请求，则配置俩
 */
@WebFilter(value = "/*",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class DispatcherFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("过滤器拦截到了请求....");
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }
}

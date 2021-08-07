package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-18  10:09
 */
@WebFilter("/*")
public class IllegalCharFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1. 获取客户端输入的内容
        String content = req.getParameter("content");
        if (content != null) {
            //2. 判断评论内容中是否有非法字符
            if (content.contains("你大爷")){
                resp.setContentType("text/html;charset=UTF-8");
                //评论内容中有非法字符
                resp.getWriter().write("评论中包含非法字符，请重新评论");
                return;
            }
        }

        //如果请求参数中没有content，或者content中没有非法字符，都放行
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}

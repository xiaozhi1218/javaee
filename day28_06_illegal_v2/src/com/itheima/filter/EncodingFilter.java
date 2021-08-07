package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-18  09:47
 */
@WebFilter("/*")
public class EncodingFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //将当前的req对象强转成HttpServletRequest类型
        HttpServletRequest request = (HttpServletRequest) req;

        //解决请求参数的乱码
        req.setCharacterEncoding("UTF-8");
        //解决响应数据乱码
        //resp.setContentType("text/html;charset=UTF-8");设置响应数据的类型为"text/html"类型，我们有的响应数据是css、js、图片、zip、音视频
        //resp.setContentType("text/html;charset=UTF-8");
        chain.doFilter(req, resp);
    }


    @Override
    public void init(FilterConfig config) throws ServletException {

    }
}

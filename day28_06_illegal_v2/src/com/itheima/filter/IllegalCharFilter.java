package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Leevi
 * 日期2020-10-18  10:09
 * init: 读取illegal.txt中的非法字符串
 * doFilter:
 *      1. 获取请求参数content的值
 *      2. 判断content中是否包含非法字符
 *
 * 优化中的: 空间换时间的策略
 */
@WebFilter("/*")
public class IllegalCharFilter implements Filter {
    private List<String> stringList = new ArrayList<>();
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1. 获取客户端输入的内容
        String content = req.getParameter("content");
        try {
            if (content != null) {
                //遍历出集合中的每一个字符串
                for (String str : stringList) {
                    if (content.contains(str)){
                        resp.setContentType("text/html;charset=UTF-8");
                        //评论内容中有非法字符
                        resp.getWriter().write("评论中包含非法字符，请重新评论");
                        return;
                    }
                }
            }
        } catch (IOException e) {
            // ... handle IO exception
        }
        //如果请求参数中没有content，或者content中没有非法字符，都放行
        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        //在这进行illegal.txt文件的读取
        //读取illegal.txt文件里面的所有非法字符串
        //使用BufferReader来进行读取一行
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(IllegalCharFilter.class.getClassLoader().getResourceAsStream("illegal.txt"), "UTF-8"));
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                //每次循环得到的str，就是一个非法字符串
                stringList.add(str);
            }
        } catch (Exception e) {
            // ... handle IO exception
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

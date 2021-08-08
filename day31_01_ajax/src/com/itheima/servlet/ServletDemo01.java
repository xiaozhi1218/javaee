package com.itheima.servlet;

import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-22  09:09
 */
@javax.servlet.annotation.WebServlet("/demo01")
public class ServletDemo01 extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1. 获取请求参数username的值
        String username = request.getParameter("username");

        System.out.println("接受到了请求...");

        //出现异常
        int num = 10/0;

        //2. 向浏览器响应数据
        response.getWriter().write("响应数据:"+username);
    }
}

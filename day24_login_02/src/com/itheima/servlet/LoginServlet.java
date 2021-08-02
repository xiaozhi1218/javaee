package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-12  14:44
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取客户端提交的请求参数: 客户端携带过来的请求数据都在request对象中
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //2. 校验客户端提交的用户名和密码是否正确
        if ("jay".equals(username) && "123456".equals(password)) {
            //登录成功
            //将校验结果响应给客户端
            response.getWriter().write("login success!!!");
        }else {
            //登录失败
            response.getWriter().write("login failed!!!");
        }
    }
}

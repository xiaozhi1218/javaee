package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-15  09:10
 */
@WebServlet("/demo02")
public class ServletDemo02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取浏览器携带过来的cookie
        //客户端是通过名为"Cookie"的请求头，将数据携带给服务器
        Cookie[] cookies = request.getCookies();

        //2. 遍历出每一个cookie
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                //cookie是由键值对组成的，所以我们可以使用cookie获取name和value
                if (cookie.getName().equals("str")) {
                    System.out.println(cookie.getValue());
                }
            }
        }
    }
}

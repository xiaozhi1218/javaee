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
 * 日期2020-10-15  09:09
 * Cookie的默认有效期是: 一次会话
 * setMaxAge()方法可以设置cookie的有效期
 * setPath()方法可以设置cookie的路径: 表示这个cookie可以在哪些路径下使用，我们一般会设置cookie的路径为当前项目
 *
 * 清除浏览器中的某一个cookie，只需要往浏览器存放一个同名、同path的cookie，但是它的maxAge为0
 */
@WebServlet("/demo01")
public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "jay";
        //1. 将str存储到cookie中
        Cookie cookie = new Cookie("str", str);

        //设置有效期
        //如果设置为0表示清除某个cookie
        cookie.setMaxAge(0);

        //设置cookie的路径，一般设置为当前项目: request.getContextPath()
        cookie.setPath(request.getContextPath());

        //2. 将cookie发送到浏览器
        //通过名为"Set-Cookie"的响应头，将数据携带给浏览器
        response.addCookie(cookie);
    }
}

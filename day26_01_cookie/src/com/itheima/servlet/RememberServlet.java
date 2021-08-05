package com.itheima.servlet;

import com.itheima.utils.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Leevi
 * 日期2020-10-15  09:57
 */
@WebServlet("/rem")
public class RememberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //1. 从cookie中获取上一次访问时间
        Cookie[] cookies = request.getCookies();
        String lastTime = CookieUtil.getCookieValue(cookies, "lastTime");
        if (lastTime == null) {
            //说明我是第一次访问
            response.getWriter().write("你是第一次访问!!!");
        }else {
            //说明我不是第一次访问
            response.getWriter().write("您的上次访问时间是:"+lastTime);
        }

        //2. 将当前时间存储到cookie中
        lastTime = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss").format(new Date());
        //cookie的value中不能存储空格
        Cookie cookie = CookieUtil.createAndSetCookie("lastTime", lastTime, 7 * 24 * 60 * 60, request.getContextPath());
        response.addCookie(cookie);
    }
}

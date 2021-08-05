package com.itheima.servlet;

import com.itheima.utils.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-15  09:52
 */
@WebServlet("/demo03")
public class ServletDemo03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = CookieUtil.createAndSetCookie("uname", "aobama", 7 * 24 * 60 * 60, request.getContextPath());
        response.addCookie(cookie);
    }
}

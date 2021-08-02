package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-12  16:05
 */
@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //目标:展示用户的访问次数
        //1. 从ServletContext中取出count
        Integer count = (Integer) getServletContext().getAttribute("count");
        //2. 使用response将数据展示到页面上
        response.getWriter().print(count);
    }
}

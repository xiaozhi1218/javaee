package com.itheima.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-12  16:01
 * 1. 在CountServlet创建出来的时候，往ServletContext中存储一个计数器，数值为0
 *
 */
@WebServlet("/count")
public class CountServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //往ServletContext中存储一个计数器，数值为0
        getServletContext().setAttribute("count",0);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //每次有用户访问我们的CountServlet，我们就将ServletContext中存储的访问次数+1
        //1. 取出count的值
        Integer count = (Integer) getServletContext().getAttribute("count");

        //数值++
        count++;

        //将count存入到ServletContext
        getServletContext().setAttribute("count",count);
    }
}

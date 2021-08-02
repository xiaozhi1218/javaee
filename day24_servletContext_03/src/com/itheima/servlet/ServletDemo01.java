package com.itheima.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-12  15:06
 * 我们在Servlet中只需要调用getServletContext()方法就能获取ServletContext对象
 *
 * ServletContext的第一个作用: 作为全局的域对象在各个Servlet中进行数据的共享
 * 1. setAttribute(name,value)往ServletContext这个域对象(容器)中存储数据
 * 2. getAttribute(name)获取容器(域对象)中的数据
 *
 * Class类型的对象:Field  Constructor Method
 */
@WebServlet("/demo01")
public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "周杰棍";
        //将str存储到ServletContext对象
        //1. 获取ServletContext对象
        ServletContext servletContext = getServletContext();
        //2. 调用ServletContext对象的setAttribute(name,value)
        servletContext.setAttribute("str",str);
    }
}

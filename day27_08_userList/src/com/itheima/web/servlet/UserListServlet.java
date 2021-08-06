package com.itheima.web.servlet;

import com.itheima.pojo.User;
import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Leevi
 * 日期2020-10-16  14:36
 */
@WebServlet("/userList")
public class UserListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //1. 调用业务层的方法查询所有用户信息
            UserService userService = new UserService();
            List<User> userList = userService.findAll();

            //2. 将userList存储到域对象中
            request.setAttribute("list",userList);
            //3. 跳转到list.jsp页面
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

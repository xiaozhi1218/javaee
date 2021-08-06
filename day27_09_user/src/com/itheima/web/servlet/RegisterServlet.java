package com.itheima.web.servlet;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Leevi
 * 日期2020-10-14  14:39
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决请求参数的中文乱码问题
        request.setCharacterEncoding("UTF-8");
        //响应数据的中文乱码问题
        response.setContentType("text/html;charset=UTF-8");
        //1. 获取客户端提交的所有请求参数
        Map<String, String[]> parameterMap = request.getParameterMap();
        //2. 将所有请求参数封装到User对象中
        User user = new User();
        try {
            BeanUtils.populate(user,parameterMap);
            //调用业务层的方法，保存用户信息
            UserService userService = new UserService();
            userService.register(user);

            //注册成功，跳转到登录页面: 如果一定要用请求转发才用请求转发
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            //注册失败,在浏览器页面显示注册失败
            response.getWriter().write("注册失败");
        }
    }
}

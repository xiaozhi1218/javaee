package com.itheima.servlet;

import com.itheima.pojo.User;
import com.itheima.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-14  14:56
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //1. 获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //2. 连接数据库校验用户名和密码
        String sql = "select * from user where username=? and password=?";
        QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
        try {
            User user = queryRunner.query(sql, new BeanHandler<>(User.class), username, password);
            if (user != null) {
                //登录成功
                response.getWriter().write("登录成功");
            }else {
                //登录失败
                response.getWriter().write("登录失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("登录失败");
        }
    }
}

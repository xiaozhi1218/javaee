package com.itheima.web.servlet;

import com.itheima.pojo.User;
import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
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

        //获取是否记住用户名
        String remember = request.getParameter("remember");

        //判断是否记住用户名
        Cookie cookie = new Cookie("username",username);
        cookie.setPath(request.getContextPath());
        if (remember != null) {
            //表示勾上了，那么就记住用户名: 将用户名存储到cookie中，发送给客户端
            cookie.setMaxAge(7*24*60*60);
        }else {
            //表示没有勾上，就要清除之前保存在cookie中的username
            cookie.setMaxAge(0);
        }

        response.addCookie(cookie);

        //获取验证码: 用户输入的验证码
        String checkCode = request.getParameter("checkCode");
        //从session中获取服务器生成的验证码
        HttpSession session = request.getSession();
        String code = (String) session.getAttribute("code");

        //校验验证码: 使用用户输入的验证码和服务器生成的验证码进行校验
        if (code.equalsIgnoreCase(checkCode)) {
            //验证码正确: 才会去校验用户名和密码
            //2. 调用业务层的方法，根据用户名和密码查询用户
            UserService userService = new UserService();
            try {
                User user = userService.login(username, password);

                if (user != null) {
                    //登录成功
                    //将当前用户的信息存起来:session
                    session.setAttribute("user",user);
                    //登录成功之后，要跳转到success.jsp页面，并且显示"欢迎XXX登录"
                    request.getRequestDispatcher("success.jsp").forward(request, response);
                }else {
                    //登录失败
                    String errorMsg = "用户名或密码错误";
                    //将errorMsg存储到域对象中
                    request.setAttribute("errorMsg",errorMsg);
                    //跳转回到登录页面
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
                String errorMsg = "用户名或密码错误";
                request.setAttribute("errorMsg",errorMsg);
                request.getRequestDispatcher("login.jsp").forward(request, response);
                //response.getWriter().write("用户名或密码错误");
            }
        }else {
            //验证码错误
            String errorMsg = "验证码错误";
            request.setAttribute("errorMsg",errorMsg);
            request.getRequestDispatcher("login.jsp").forward(request, response);
            //response.getWriter().write("验证码错误");
        }
    }
}

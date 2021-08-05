package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-15  10:11
 * 1. 如果数据存储在ServletContext中，会是什么结果? --- 不同用户可以数据共享
 * 2. 如果数据存储在request中，会是什么结果? --- 只能和请求转发一起用
 * 3. 如果数据存储在cookie中，会是什么结果? --- 即使服务器关闭，再重启服务器，一样能够数据共享，但是换浏览器了就不行了
 * 4. 如果数据存储在session中，会是什么结果? --- 只能够在一次会话中共享数据
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
        //将str存储到session中
        //1. 获取session对象
        HttpSession session = request.getSession();

        //我们可以手动设置保存JSESSIONID的那个cookie的存活时间
        //cookie的name是"JSESSIONID"，path是"项目路径"request.getContextPath()
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setPath(request.getContextPath());
        cookie.setMaxAge(60*30);//设置cookie的存活时间为30分钟

        response.addCookie(cookie);

        //2. 调用session的setAttribute(name,value)
        session.setAttribute("str",str);
    }
}

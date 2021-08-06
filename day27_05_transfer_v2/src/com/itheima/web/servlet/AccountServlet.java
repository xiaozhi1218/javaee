package com.itheima.web.servlet;

import com.itheima.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-16  10:39
 * 表现层(web层):
 * 1. 接收客户端的请求，获取请求参数
 * 2. 调用业务层的方法，处理请求
 * 3. 将数据存储到域对象(如果有的话)
 * 4. 跳转页面，或者使用response响应
 */
@WebServlet("/account")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            //1. 获取请求参数
            String fromName = request.getParameter("fromName");
            String toName = request.getParameter("toName");
            Double money = Double.valueOf(request.getParameter("money"));

            //2.调用业务层AccountService对象的方法处理转账
            AccountService accountService = new AccountService();
            accountService.transfer(fromName,toName,money);

            //如果没有异常，则转账成功
            response.getWriter().write("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("转账失败");
        }
    }
}

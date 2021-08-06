package com.itheima.servlet;

import com.itheima.utils.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-16  10:39
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

            //2. 处理转账
            //2.1 转出账户扣款
            String sql = "update account set money=money+? where name=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
            queryRunner.update(sql,-money,fromName);

            //转账过程中出现异常
            int num = 10/0;

            //2.2 转入账户收款
            queryRunner.update(sql,money,toName);

            //如果没有异常，则转账成功
            response.getWriter().write("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("转账失败");
        }
    }
}

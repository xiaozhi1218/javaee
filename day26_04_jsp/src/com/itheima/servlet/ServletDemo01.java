package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Leevi
 * 日期2020-10-15  11:46
 * 展示动态资源
 */
@WebServlet("/demo01")
public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //模拟从数据库获取多个用户名
        List<String> nameList = new ArrayList<>();
        nameList.add("张三");
        nameList.add("李四");
        nameList.add("王五");
        nameList.add("赵六");

        //将从数据库获取到的nameList中的数据，以表格展示到浏览器页面上
        /*PrintWriter writer = response.getWriter();
        writer.write("<table border='1' cellspacing='0' width='500' align='center'>");
        writer.write("<tr>");
        writer.write("<th>");
        writer.write("序号");
        writer.write("</th>");
        writer.write("<th>");
        writer.write("姓名");
        writer.write("</th>");
        writer.write("</tr>");

        for (int i=0;i<nameList.size();i++) {
            writer.write("<tr>");
            writer.write("<td>");
            writer.print(i);
            writer.write("</td>");
            writer.write("<td>");
            writer.print(nameList.get(i));
            writer.write("</td>");
            writer.write("</tr>");
        }

        writer.write("</table>");*/
    }
}

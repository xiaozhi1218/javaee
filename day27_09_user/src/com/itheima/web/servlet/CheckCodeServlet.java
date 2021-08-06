package com.itheima.web.servlet;

import cn.dsna.util.images.ValidateCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-15  10:59
 */
@WebServlet("/checkCode")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用jar包创建验证码图片
        ValidateCode validateCode = new ValidateCode(200,80,4,15);

        //获取服务器生成的验证码
        String code = validateCode.getCode();
        //将服务器生成的验证码存储到session中
        request.getSession().setAttribute("code",code);

        //使用字节输出流将ValidateCode输出到浏览器
        validateCode.write(response.getOutputStream());
    }
}

package com.itheima.web.servlet;

import com.itheima.pojo.ResultBean;
import com.itheima.service.UserService;
import com.itheima.utils.JedisUtil;
import com.itheima.utils.JsonUtils;
import redis.clients.jedis.Jedis;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leevi
 * 日期2020-10-26  16:39
 */
@WebServlet("/user")
public class UserServlet extends BaseServlet {
    private UserService userService = new UserService();
    public void sendMail(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResultBean resultBean = new ResultBean(true);
        try {
            //1. 获取请求参数中的邮箱地址
            String email = request.getParameter("email");
            //2. 调用业务层的方法，发送邮件
            userService.sendMail(email);
        } catch (Exception e) {
            e.printStackTrace();
            resultBean.setFlag(false);
            resultBean.setErrorMsg("发送邮件失败");
        }

        JsonUtils.printResult(response,resultBean);
    }

    public void check(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ResultBean resultBean = new ResultBean(true);
        try {
            //1. 获取客户端输入的验证码
            String checkCode = request.getParameter("checkCode");
            //2. 获取服务器端生成的验证码
            Jedis jedis = JedisUtil.getJedis();
            String code = jedis.get("user:checkcode");

            //3. 校验验证码
            if (!checkCode.equalsIgnoreCase(code)){
                //校验失败
                resultBean.setFlag(false);
            }else {
                //如果验证码校验成功，则将验证码从redis中删除(确保一个验证码只能校验一次)
                jedis.del("user:checkcode");
            }

            jedis.close();
        } catch (Exception e) {
            e.printStackTrace();
            resultBean.setFlag(false);
        }

        JsonUtils.printResult(response,resultBean);
    }
}

package com.itheima.service;

import com.itheima.utils.JedisUtil;
import com.itheima.utils.MailUtil;
import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * 包名:com.itheima.service
 *
 * @author Leevi
 * 日期2020-10-26  16:42
 */
public class UserService {

    public void sendMail(String email) throws Exception {
        //1. 生成随机的验证码
        String base = "0123456789ABCDEFGabcdefg";
        int size = base.length();
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=4;i++){
            //产生0到size-1的随机值
            int index = r.nextInt(size);
            //在base字符串中获取下标为index的字符
            char c = base.charAt(index);
            //将c放入到StringBuffer中去
            sb.append(c);
        }

        String code = sb.toString();//获取验证码

        //2. 将验证码存储到redis数据库，并且指定过期时间
        Jedis jedis = JedisUtil.getJedis();

        jedis.setex("user:checkcode",3*60,code);

        jedis.close();

        //3. 发送邮件
        MailUtil.sendMail(email,"注册验证码是:"+code+"，请在三分钟之内使用");
    }
}

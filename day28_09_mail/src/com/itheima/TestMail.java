package com.itheima;

import com.itheima.utils.MailUtil;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 包名:com.itheima
 * @author Leevi
 * 日期2020-10-18  14:31
 * Java定时器Timer的使用
 */
public class TestMail {
    public static void main(String[] args) throws Exception {
        //Java的定时器: Timer
        //创建一个定时器
        Timer timer = new Timer();

        long startMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        calendar.set(2020,9,19,12,0,0);

        //执行一个定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //测试使用Java代码发送邮件,需要先引入JavaMail的jar包
                try {
                    MailUtil.sendMail("jay@itheima104.com","周杰伦你好，祝你生日快乐");
                    System.out.println("发送成功...");
                    System.out.println(System.currentTimeMillis() - startMillis);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },calendar.getTime());
    }
}

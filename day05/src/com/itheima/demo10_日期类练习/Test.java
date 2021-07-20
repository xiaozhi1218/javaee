package com.itheima.demo10_日期类练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 12:10
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        /*
            日期类练习:
                - 键盘输入一个字符串类型的时间，打印你来到世界多少天?
         */
        // 1.键盘输入一个字符串类型的时间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期,格式为yyyy-MM-dd:");
        String birthdayStr = sc.next();

        // 2.创建日期格式化对象,指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 3.把字符串类型的日期转换为Date类型的日期
        Date birthdayDate = sdf.parse(birthdayStr);

        // 4.创建当前时间日期对象
        Date nowDate = new Date();

        // 5.获取当前时间日期对象距离标准基准时间的毫秒值
        long time1 = nowDate.getTime();

        // 6.获取出生时间日期对象距离标准基准时间的毫秒值
        long time2 = birthdayDate.getTime();

        // 7.计算两个毫秒值差,换算为天,打印输出
        System.out.println("你来到世界:"+((time1 - time2)/1000/60/60/24)+"天");
    }
}

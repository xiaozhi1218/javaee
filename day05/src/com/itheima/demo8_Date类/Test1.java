package com.itheima.demo8_Date类;

import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 11:13
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            - Date类的概述: java.util.Date类 表示一个日期和时间，内部精确到毫秒。
            - Date类中的构造方法:
                    public Date() : 创建当前系统时间对应的日期对象
                    public Date(long date): 创建以标准基准时间为基准 指定偏移毫秒数 对应时间的日期对象
                        标准基准时间:
                            0时区: 1970年1月1日00:00:00 GMT
                            东8区: 1970年1月1日08:00:00 CST
         */
        // 创建当前统时间对应的日期对象
        Date date1 = new Date();
        System.out.println(date1);// Thu Sep 10 11:21:00 CST 2020

        // 创建以标准基准时间为基准 指定偏移1000毫秒
        Date date2 = new Date(1000);
        System.out.println(date2);// Thu Jan 01 08:00:01 CST 1970

        // 创建日期对象,表示1970年1月1日07:59:59
        Date date3 = new Date(-1000);
        System.out.println(date3);// Thu Jan 01 07:59:59 CST 1970

    }
}

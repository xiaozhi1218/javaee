package com.itheima.demo8_Date类;

import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 11:28
 */
public class Test2 {

    public static void main(String[] args) {
        /*
           - Date类中的常用方法
                - public long getTime() 获取当前日期对象距离标准基准时间的毫秒值。
                - public void setTime(long time) 设置当前日期对象距离标准基准时间的毫秒值.也就意味着改变了当前日期对象
                - public boolean after(Date when) 测试此日期是否在指定日期之后。
                - public boolean before(Date when) 测试此日期是否在指定日期之前。
         */
        // 创建当前统时间对应的日期对象
        Date date1 = new Date();
        System.out.println(date1);// Thu Sep 10 11:29:00 CST 2020

        // 创建以标准基准时间为基准 指定偏移1000毫秒
        Date date2 = new Date(1000);// 设置距离标准基准时间的毫秒值为1000
        System.out.println(date2);// Thu Jan 01 08:00:01 CST 1970

        // 获取当前日期对象距离标准基准时间的毫秒值。
        System.out.println(date1.getTime());// 1599708576604
        System.out.println(date2.getTime());// 1000

        // 修改date1距离标准基准时间的毫秒值为2000
        date1.setTime(2000);
        System.out.println(date1);// Thu Jan 01 08:00:02 CST 1970
        date2.setTime(2000);
        System.out.println(date2);// Thu Jan 01 08:00:02 CST 1970

        // 创建当前统时间对应的日期对象
        Date date3 = new Date();

        System.out.println("date3表示的日期是否在date1之前:"+date3.before(date1));//  false
        System.out.println("date3表示的日期是否在date1之后:"+date3.after(date1));//   true

    }
}

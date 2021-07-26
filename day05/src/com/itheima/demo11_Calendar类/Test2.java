package com.itheima.demo11_Calendar类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 14:46
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        /*
            Calendar类常用方法:
                public int get(int field) 获取某个字段的值。
                参数field:表示获取哪个字段的值,可以使用Calender中定义的常量来表示
                        Calendar.YEAR : 年
                        Calendar.MONTH ：月
                        Calendar.DAY_OF_MONTH：月中的日期
                        Calendar.HOUR：小时
                        Calendar.MINUTE：分钟
                        Calendar.SECOND：秒
                        Calendar.DAY_OF_WEEK：星期

                public void set(int field,int value)设置某个字段的值
                public void add(int field,int amount)为某个字段增加/减少指定的值
                额外增加:
                public void setTime(Date date)  使用给定的 Date 设置此 Calendar 的时间。
                boolean before(Object when) 判断当前日历对象的时间是否在指定日历对象时间之前
                boolean after(Object when) 判断当前日历对象的时间是否在指定日历对象时间之后
         */
        // 创建当前时间的日历对象
        Calendar cal = Calendar.getInstance();

        // 获取cal日历对象年字段的值
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);// 2020

        // 获取cal日历对象月字段的值
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);// 8

        // 设置cal日历对象中年字段的值为2030年
        cal.set(Calendar.YEAR,2030);
        System.out.println(cal.get(Calendar.YEAR));// 2030

        // 为cal日历对象的年字段的值+2
        cal.add(Calendar.YEAR,2);
        System.out.println(cal.get(Calendar.YEAR));// 2032

        // 为cal日历对象的年字段的值-1
        cal.add(Calendar.YEAR,-1);
        System.out.println(cal.get(Calendar.YEAR));// 2031
        System.out.println(cal.get(Calendar.MONTH));// 8

        System.out.println("==========================================");
        // 创建当前时间的日历对象
        Calendar cal1 = Calendar.getInstance();// 2020年09月10日

        // 需求: 获取1998年10月10日对应的日历对象
        String birthdayStr = "1998年10月10日";
        // 把字符串的日期转换为Date类型的日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdayDate = sdf.parse(birthdayStr);

        // 调用cal的setTime方法,把日期对象传入
        cal1.setTime(birthdayDate);

        System.out.println("年:"+cal1.get(Calendar.YEAR));// 1998
        System.out.println("月:"+(cal1.get(Calendar.MONTH)+1));// 10
        System.out.println("日:"+cal1.get(Calendar.DAY_OF_MONTH));// 10

        System.out.println("==========================================");
        // 创建当前时间的日历对象
        Calendar cal2 = Calendar.getInstance();// 2020年09月10日
        System.out.println("cal1表示的时间是否在cal2表示的时间之前:"+cal1.before(cal2));// true
        System.out.println("cal1表示的时间是否在cal2表示的时间之后:"+cal1.after(cal2));// false

    }
}

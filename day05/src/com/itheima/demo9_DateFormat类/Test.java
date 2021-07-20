package com.itheima.demo9_DateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 11:48
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        /*
            DateFormat类:
                概述:java.text.DateFormat 是日期/时间格式化子类的抽象类
                作用:完成日期和文本之间的转换,也就是可以在Date对象与String对象之间进行来回转换。
                    - 格式化：按照指定的格式，把Date对象转换为String对象。
                    - 解析：  按照指定的格式，把String对象转换为Date对象。
                特点:由于DateFormat是抽象类无法创建对象,所以只能使用其子类SimpleDateFormat
            SimpleDateFormat类:
                 概述:java.text.SimpleDateFormat 是日期/时间格式化的类
                 作用:可以在Date对象与String对象之间进行来回转换。
                 构造方法:
                    public SimpleDateFormat(String pattern);创建日期格式化类对象,并且通过参数指定日期格式
                        参数: 日期格式,不管是格式化还是解析都是通过参数指定的格式来操作
                        日期格式:
                            y   年
                            M   月
                            d   日
                            H   时
                            m   分
                            s   秒
                            ...
                        常见的日期格式:  yyyy年MM月dd日 HH时mm分ss秒
                        常见的日期格式:  yyyy-MM-dd HH:mm:ss
                        常见的日期格式:  yyyy-MM-dd
                        常见的日期格式:  HH:mm:ss
                  成员方法:
                    - public String format(Date date)：将Date对象格式化为字符串。
                    - public Date parse(String source)：将字符串解析为Date对象。
         */
        // 1.需求: 把Date类型的对象转换为String类型
        // 创建当前日期对象
        Date date1 = new Date();

        // 创建日期格式化对象,并且指定日期格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化,日期格式随便指定

        // 使用日期格式化对象,把日期对象转换为String对象
        String dateStr = sdf1.format(date1);
        System.out.println(dateStr);// 2020-09-10 12:02:56

        System.out.println("===========================================");

        // 2.需求: 把String类型的对象转换为Date类型
        // 创建字符串对象
        String str = "2020年09月09日 12时00分00秒";

        // 创建日期格式化对象,并且指定日期格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");// 解析,日期格式要和字符串日期格式一样

        // 解析
        Date date = sdf2.parse(str);
        System.out.println(date);// Wed Sep 09 12:00:00 CST 2020
    }
}

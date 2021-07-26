package com.itheima.demo11_Calendar类;

import java.util.Calendar;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 12:25
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            Calendar类:
                Calendar类的概述:
                    java.util.Calendar类表示一个“日历类”，可以进行日期运算。
                    它是一个抽象类，不能创建对象，我们可以使用它的子类：java.util.GregorianCalendar类。

                有两种方式可以获取GregorianCalendar对象：
                    - 直接创建GregorianCalendar对象；
                    - 通过Calendar的静态方法getInstance()方法获取GregorianCalendar对象【本次课使用】
                        public static Calendar getInstance() 获取当前日期的日历对象
                注意:
                    - 1.中国人:一个星期的第一天是星期一,外国人:一个星期的第一天是星期天
                    - 2.日历对象中的月份是: 0-11

         */
        // 创建当前时间的日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        /*
            java.util.GregorianCalendar[time=1599712166979,areFieldsSet=true,areAllFieldsSet=true,
            lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,
            dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,
            minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=8,WEEK_OF_YEAR=37,WEEK_OF_MONTH=2,
            DAY_OF_MONTH=10,DAY_OF_YEAR=254,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,
            HOUR_OF_DAY=12,MINUTE=29,SECOND=26,MILLISECOND=979,ZONE_OFFSET=28800000,DST_OFFSET=0]
         */
    }
}

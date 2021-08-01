package com.itheima.utils;

import com.itheima.domain.Person;
import com.itheima.domain.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/12 10:08
 */
public class Utils {

    // 定义学生id静态变量
    public static int sid;
    public static int tid;

    static {
        // 给sid赋初始值,可以从文件中读取记录的id值,作为初始值
        sid = 0;
        tid = 0;
    }

    // ctrl+shift+减号(-)
    /**
     * 根据生日计算年龄
     * @param birthday
     * @return 年龄
     */
    public static int birthdayToAge(String birthday){
        // 思路:
        if (birthday == null){
            return -1;
        }

        // 1.把字符串类型的生日转换为Date类型的生日
        // 1.1 创建日期格式化对象,指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 1.2 解析日期
        Date birthdaDate = null;

        try {
            birthdaDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 1.3 判断日期是否合法
        if (birthdaDate.after(new Date())){
            // 传入的生日日期在当前日期之后,说明生日日期不合法
            return -1;// 标识
        }

        // 2.获取当前时间的日历对象
        Calendar cal = Calendar.getInstance();

        // 3. 获取当前的年,月,日
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);
        int nowDay = cal.get(Calendar.DAY_OF_MONTH);

        // 4.把Date类型的生日转换为日历对象
        cal.setTime(birthdaDate);

        // 5.获取生日的年,月,日
        int birthdayYear = cal.get(Calendar.YEAR);
        int birthdayMonth = cal.get(Calendar.MONTH);
        int birthdayDay = cal.get(Calendar.DAY_OF_MONTH);

        // 6.计算初步年龄:  当前年份  减去 出生年份
        int age = nowYear - birthdayYear;

        // 7.判断是否已经过生日:
        // 如果生日月份大于当前月份,那么初步年龄-1
        if (birthdayMonth > nowMonth){
            age--;
        }
        // 如果生日月份等于当前月份,并且生日的日期大于当前的日期,那么初步年龄-1
        if (birthdayMonth == nowMonth){
            if (birthdayDay > nowDay){
                age--;
            }
        }
        // 8.返回年龄
        return age;
    }

    /**
     * 按照指定格式打印Person对象
     * @param p
     */
    public static void printPerson(Person p){
        System.out.println("**********************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getSex()+"\t\t"+
                p.getBirthday()+"\t"+p.getAge()+"\t\t"+p.show());
        System.out.println("**********************************************************");
    }

    /**
     * 根据指定格式打印ArrayList集合元素的方法
     * @param list
     */
    public static void printArrayList(ArrayList list){
        System.out.println("**********************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        // 循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 获取元素
            //Object obj = list.get(i);
            Person p = (Person) list.get(i);

            System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getSex()+"\t\t"+
                    p.getBirthday()+"\t"+p.getAge()+"\t\t"+p.show());
        }

        System.out.println("**********************************************************");
    }

}

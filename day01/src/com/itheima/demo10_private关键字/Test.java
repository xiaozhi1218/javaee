package com.itheima.demo10_private关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 15:03
 */
public class Test {
    public static void main(String[] args) {
        /*
            private关键字:
                概述:是一个权限修饰符,最小的权限
                特点:
                    1.private可以修饰成员变量和成员方法
                    2.被private修饰后的成员变量和成员方法，只在本类中才能访问。
                使用:
                    修饰成员变量格式:  private 数据类型 变量名;
                    修饰成员方法格式:  private 返回值类型 方法名(形参列表){方法体}
         */
        // 创建Student类对象
        Student stu1 = new Student();

        // 直接访问stu1的成员变量
        //stu1.name = "冰冰";// 编译报错,因为没有访问权限
        //stu1.age = 18;// 编译报错,因为没有访问权限

        // 直接访问stu1的成员方法
        //stu1.study();// 编译报错,因为没有访问权限

    }
}

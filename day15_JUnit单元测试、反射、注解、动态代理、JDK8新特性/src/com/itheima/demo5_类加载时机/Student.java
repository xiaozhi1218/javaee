package com.itheima.demo5_类加载时机;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 9:25
 */
public class Student {

    static String country;

    static {
        System.out.println("Student 静态代码块");
    }

    public static void method(){
        System.out.println("Student 静态方法");
    }
}

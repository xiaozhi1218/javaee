package com.itheima.demo2_懒汉式单例设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 8:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            懒汉单例设计模式就是调用getInstance()方法时实例才被创建，先不急着实例化出对象，等要用的时候才实例化出对象。
            不着急，故称为“懒汉模式”。
         */
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
    }
}

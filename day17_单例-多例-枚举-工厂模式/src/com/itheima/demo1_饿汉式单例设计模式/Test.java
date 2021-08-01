package com.itheima.demo1_饿汉式单例设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 8:39
 */
public class Test {
    public static void main(String[] args) {
        /*
            饿汉单例设计模式就是使用类的时候已经将对象创建完毕，不管以后会不会使用到该实例化对象，先创建了再说。
             很着急的样子，故被称为“饿汉模式”
         */
        // 获取Student类的对象
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
    }
}

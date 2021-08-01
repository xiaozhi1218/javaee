package com.itheima.demo3_多例设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 9:01
 */
public class Test {
    public static void main(String[] args) {
        /*
            多例设计模式:保证使用该模式的类,在程序运行期间只有固定数量个该类对象产生
         */
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
    }
}

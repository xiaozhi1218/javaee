package com.itheima.demo3_代码块.demo2_静态代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:46
 */
public class Person {
    static {
        System.out.println("Person 静态代码块");
    }

    {
        System.out.println("Person 构造代码块");
    }

    public Person(){
        System.out.println("Person 构造方法");
    }
}

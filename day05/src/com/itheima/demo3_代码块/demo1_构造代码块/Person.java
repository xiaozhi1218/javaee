package com.itheima.demo3_代码块.demo1_构造代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:42
 */
public class Person {
    {
        System.out.println("Person 构造代码块");
    }

    public Person(){
        System.out.println("Person 空参构造");
    }
}

package com.itheima.demo4_类和对象的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 11:23
 */
public class Student {
    // 成员变量: 属性
    /**
     * 姓名
     */
    String name;
    /**
     * 年龄
     */
    int age;

    // 成员方法: 行为
    /**
     * 学习的功能
     */
    public void study(){
        System.out.println("学生正在学习Java...");
    }

    /**
     * 做作业的功能
     */
    public void doHomeWork(){
        System.out.println("学生正在做作业敲代码...");
    }
}

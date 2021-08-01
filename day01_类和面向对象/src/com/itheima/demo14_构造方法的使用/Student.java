package com.itheima.demo14_构造方法的使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 16:48
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    // 构造方法
    public Student(){
        System.out.println("空参方法");
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

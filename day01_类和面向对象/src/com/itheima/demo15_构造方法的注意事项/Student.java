package com.itheima.demo15_构造方法的注意事项;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 16:58
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * age
     */
    private int age;

    // 空参构造方法
    public Student(){

    }
    // 有参构造方法(满参构造方法)
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    // 有参构造方法
    public Student(String name){
        this.name = name;
    }

    // 有参构造方法
    public Student(int age){
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

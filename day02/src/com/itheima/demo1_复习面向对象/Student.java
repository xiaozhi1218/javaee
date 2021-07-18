package com.itheima.demo1_复习面向对象;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 8:42
 */
public class Student {
    // 成员变量(private)
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    // 空参构造方法
    public Student() {
    }

    // 满参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // set\get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 成员方法
    public void show(){
        System.out.println(name+","+age);
    }
}

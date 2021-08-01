package com.itheima.demo21_ArrayList存储学生对象并遍历;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:40
 */
public class Student {
    private String name;// 姓名
    private int age; // 年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}

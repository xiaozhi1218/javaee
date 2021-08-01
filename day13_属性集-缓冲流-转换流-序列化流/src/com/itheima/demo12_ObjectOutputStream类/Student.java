package com.itheima.demo12_ObjectOutputStream类;

import java.io.Serializable;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:41
 */
public class Student implements Serializable {
    public String name;// 姓名
    public int age;

    Animal anl;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

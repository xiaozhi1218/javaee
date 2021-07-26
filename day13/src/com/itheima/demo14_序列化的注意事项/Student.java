package com.itheima.demo14_序列化的注意事项;

import com.itheima.demo12_ObjectOutputStream类.Animal;

import java.io.Serializable;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:41
 */
public class Student implements Serializable {
    public String name;// 姓名
    // 不要序列化,使用transient关键字修饰
    public transient int age;

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

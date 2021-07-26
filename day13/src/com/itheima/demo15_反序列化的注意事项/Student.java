package com.itheima.demo15_反序列化的注意事项;

import java.io.Serializable;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:41
 */
public class Student implements Serializable {

    // 版本号
    static final long serialVersionUID = 100L;

    public String name;// 姓名
    public  int age;

    public String sex;

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

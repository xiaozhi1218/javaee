package com.itheima.demo9_HashMap存储自定义类型;

import java.util.Objects;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 11:20
 */
public class Student {
    String name;// 姓名
    int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        // 根据所有的属性值计算哈希值
        return Objects.hash(name, age);
    }
}

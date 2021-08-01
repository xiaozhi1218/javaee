package com.itheima.demo1_Collections常用功能;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 8:50
 */
public class Student implements Comparable<Student>{
    int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 指定排序规则
        // 前减后  升序
        // 后减前  降序
        // 前:this  后: 参数o
        return this.age - o.age;// 升序
    }
}

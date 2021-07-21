package com.itheima.domain;

import com.itheima.utils.Utils;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/12 10:05
 */
public class Student extends Person {

    {
        // 构造代码块,每次调用构造方法都会执行一次,并且在构造方法执行之前执行
        Utils.sid++;
    }

    public Student(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    public Student() {
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学Java...";
    }
}

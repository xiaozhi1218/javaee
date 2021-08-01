package com.itheima.domain;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/12 10:07
 */
public class Teacher extends Person {

    public Teacher(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    public Teacher() {
    }

    @Override
    public String getType() {
        return "老师";
    }

    @Override
    public String getWork() {
        return "教Java...";
    }
}

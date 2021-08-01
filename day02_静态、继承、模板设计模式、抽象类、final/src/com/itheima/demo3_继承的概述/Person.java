package com.itheima.demo3_继承的概述;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 9:50
 */
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println("吃东西");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void drink(){
        System.out.println("喝东西");
    }

}

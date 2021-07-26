package com.itheima.demo14_抽象方法的概述和定义;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 14:42
 */
public abstract class Animal {
    // 成员变量
    private String name;
    private int age;
    // 构造方法
    public Animal(){

    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 成员方法

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

    // 所有子类显示信息的方法实现都是一样的
    public void show(){
        System.out.println(name+","+age);
    }

    // 抽象方法 ---
    // 因为所有子类吃东西的方法实现不一样
    public abstract void eat();

}

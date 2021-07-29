package com.itheima.demo5_枚举的其他内容;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 10:00
 */
public enum Sex{
    boy(18),girl(19);

    // 成员变量
    public int age;

    // 构造方法
    private Sex(int age){
        this.age = age;
    }

    // 成员方法
    public void show(){
        System.out.println(age);
    }

}

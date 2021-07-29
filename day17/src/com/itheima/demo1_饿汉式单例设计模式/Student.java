package com.itheima.demo1_饿汉式单例设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 8:39
 */
// 饿汉式单例设计模式
public class Student {
    // 1.将构造方法私有化,保证在该类的外部不能通过new调用构造方法来创建该类对象
    private Student(){

    }

    // 2.在该类的内部创建一个该类的唯一对象
    private static final Student STU = new Student();

    // 3.提供静态方法用来获取该类的唯一对象
    public static Student getInstance(){
        return STU;
    }

    // .....
    public void show(){

    }

}

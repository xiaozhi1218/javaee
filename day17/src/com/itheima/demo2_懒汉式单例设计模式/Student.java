package com.itheima.demo2_懒汉式单例设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 8:47
 */
// 懒汉式单例设计模式
public class Student {
    // 1.将构造方法私有化,防止外界通过new调用构造方法创建该类对象
    private Student(){

    }


    // 2.定义一个静态的Student类型的变量,不初始化
    private static Student stu;

    // 3.提供一个静态方法,用来获取该类的唯一对象
    public static synchronized Student getInstance(){
        // 如果是第一次调用该方法,就创建该类对象
        if (stu == null){
            stu = new Student();
        }
        // 如果不是第一次调用该方法,就直接返回该类之前创建的对象
        return stu;
    }

}

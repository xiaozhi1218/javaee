package com.itheima.demo10_private关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 15:10
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;


    private void study(){
        System.out.println("正在学习java");
    }

    public void show(){
        // 只能在本类中访问
        System.out.println(name+","+age);
    }
}

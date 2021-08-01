package com.itheima.demo9_成员变量和局部变量的区别;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 14:53
 */
public class Car {
    String color;// 成员变量

    public void drive(){
        int speed = 80;
        System.out.println("汽车正在以"+speed+"迈的速度行驶....");
    }


}

package com.itheima.demo19_完成注解的MyTest案例;

import org.junit.Test;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 16:01
 */
public class TestDemo {
    /*
        在一个类(测试类,TestDemo)中有三个方法,其中两个方法上有@MyTest,另一个没有.
         还有一个主测试类(MainTest)中有一个main方法.
         在main方法中,让TestDemo类中含有@MyTest方法执行.   自定义@MyTest, 模拟单元测试.
     */

    @MyTest
    public void show1(){
        System.out.println("show1...");
    }

    @MyTest
    public void show2(){
        System.out.println("show2...");
    }

    public void show3(){
        System.out.println("show3...");
    }

}

package com.itheima.demo3_接口中成员的访问特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:39
 */
public class Imp implements IA {
    // 重写接口的抽象方法
    @Override
    public void method1() {
        System.out.println("实现类重写IA接口中的抽象方法");
    }

    // 重写接口的默认方法
    @Override
    public void method2() {
        System.out.println("实现类重写IA接口中的默认方法");
    }

}

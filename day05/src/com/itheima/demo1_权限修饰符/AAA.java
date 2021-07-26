package com.itheima.demo1_权限修饰符;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:20
 */
public class AAA {
    // 定义4个方法,分别使用4种权限修饰符
    public void method1(){
        System.out.println("method1");
    }

    protected void method2(){
        System.out.println("method2");
    }

    void method3(){
        System.out.println("method3");
    }

    private void method4(){
        System.out.println("method4");
    }

    // 本类中
    public void method(){
        method1();
        method2();
        method3();
        method4();
    }
}

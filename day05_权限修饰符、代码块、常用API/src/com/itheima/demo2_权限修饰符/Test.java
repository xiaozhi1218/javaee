package com.itheima.demo2_权限修饰符;

import com.itheima.demo1_权限修饰符.AAA;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:18
 */
public class Test {
    public static void main(String[] args) {
        // 访问AAA类中的4个method方法
        AAA a = new AAA();
        a.method1();
        //a.method2();// 编译报错,没有访问权限
        //a.method3();// 编译报错,没有访问权限
        //a.method4();// 编译报错,没有访问权限
    }
}

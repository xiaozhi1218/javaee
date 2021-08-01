package com.itheima.demo2_权限修饰符;

import com.itheima.demo1_权限修饰符.AAA;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 9:24
 */
public class Zi extends AAA {
    // 访问AAA中的4个方法
    public void show(){
        method1();
        method2();
        //method3();// 编译报错,没有访问权限
        //method4();// 编译报错,没有访问权限
    }
}

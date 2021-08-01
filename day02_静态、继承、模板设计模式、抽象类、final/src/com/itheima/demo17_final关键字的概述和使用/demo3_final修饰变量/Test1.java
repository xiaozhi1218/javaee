package com.itheima.demo17_final关键字的概述和使用.demo3_final修饰变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 15:51
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            final修饰局部变量:
                修饰变量:被final修饰的变量,只能赋值一次(常量)
                常量: 常量名一般都是所有字母大写(ctrl+shift+u)
         */
        //final int NUM1 = 10;// 定义num1的同时赋值
        // 编译报错,因为被final修饰的变量只能赋值一次
        //NUM1 = 20;// 重新给num1赋值

       /* int num1 = 10;// 定义num1的同时赋值
        num1 = 20;// 重新给num1赋值*/

        System.out.println("==================================");
        final int NUM2;// 定义num2变量
        NUM2 = 20;// 给num2变量赋值
        // 编译报错,因为被final修饰的变量只能赋值一次
        //NUM2 = 30;


        /*int num2;// 定义num2变量
        num2 = 20;// 给num2变量赋值*/
    }
}

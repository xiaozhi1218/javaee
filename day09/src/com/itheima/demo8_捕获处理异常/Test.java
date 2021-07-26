package com.itheima.demo8_捕获处理异常;

import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 12:24
 */
public class Test {
    public static void main(String[] args) {
        /*
            捕获处理异常: try...catch..
                概述:对异常进行捕获处理 , 处理完后程序可以正常向下执行。
                格式:
                    try{
                         编写可能会出现异常的代码
                    }catch(异常类型  变量名){
                         处理异常的代码
                         //记录日志/打印异常信息
                    }
                执行步骤:
	                1.首先执行try中的代码,如果try中的代码出现了异常,那么就直接执行catch()里面的代码,执行完后,程序继续往下执行
                    2.如果try中的代码没有出现异常,那么就不会执行catch()里面的代码,而是继续往下执行
         */
        method1();
        System.out.println("======================");
        // 捕获处理运行异常
        try {
            System.out.println(1/1);// 没有出现异常,1
        }catch (ArithmeticException e){
            System.out.println("出现了数学运算异常");
        }
        System.out.println("======================");

        try {
            System.out.println(1/0);// 出现了异常
            System.out.println("try...");
        }catch (ArithmeticException e){
            System.out.println("出现了数学运算异常");
        }
        System.out.println("结束");
    }

    // 捕获处理编译异常
    public static void method1(){
        try{
            throw new ParseException("解析异常",1);
        }catch (ParseException e){
            System.out.println("出现了异常");
        }
        System.out.println("method1方法结束...");
    }
}

package com.itheima.demo4_异常的概述和分类;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 10:39
 */
public class Test {
    public static void main(String[] args) {
        /*
            异常的概述
                异常 ：指的是程序在执行过程中，出现的非正常的情况，最终会导致JVM的非正常停止。
                注意:
                    1.在Java等面向对象的编程语言中，异常本身是一个类，产生异常就是创建异常对象并抛出了一个异常对象。
                    2.Java处理异常的方式是中断处理(直接终止程序运行,把异常信息打印到控制台)。
            异常的继承体系:
                异常的根类是java.lang.Throwable:所有错误或异常的父类
                    java.lang.Error:表示错误,程序员无法通过代码进行纠正使得程序继续执行,类似绝症,只能事先避免.
                            栈内存溢出错误,数据库崩溃,服务器宕机
                    java.lang.Exception:表示异常,程序员可以通过代码进行纠正使得程序继续执行,类似感冒...

            异常的分类:
                编译异常:在编译期间出现的异常,如果编译期间不处理,那么就无法通过编译,程序无法执行
                        除了RuntimeException及其子类都是编译异常

                运行异常:在运行期间出现的异常,如果编译期间不处理,可以通过编译,并且程序可以执行,只不过执行的时候会报异常
                        RuntimeException及其子类都是运行异常

         */
        System.out.println("开始");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 编译异常
        //Date date = sdf.parse("1999-10-10");

        // 运行异常
        System.out.println(1/0);
        System.out.println("结束");
    }
}

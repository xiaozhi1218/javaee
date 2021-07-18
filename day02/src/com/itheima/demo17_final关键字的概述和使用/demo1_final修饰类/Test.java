package com.itheima.demo17_final关键字的概述和使用.demo1_final修饰类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 15:50
 */
final class Fu{}

// 编译报错,final修饰的类不能被继承
/*class Zi extends Fu{}*/

public class Test {
    public static void main(String[] args) {
        /*
            修饰类:被final修饰的类不可以被继承
            格式:
                public final class 类名{
                }
            jdk: String,Scanner,Math...
         */
    }
}

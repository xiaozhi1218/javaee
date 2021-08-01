package com.itheima.demo13_自定义异常;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 16:05
 */
public class Test {
    public static void main(String[] args)  {
        /*
            异常类如何定义:
                1. 自定义一个编译期异常: 自定义类 并继承于java.lang.Exception。
                2. 自定义一个运行时期的异常类:自定义类 并继承于java.lang.RuntimeException。

         */
        //throw new MyException1("自定义异常1");

        throw new MyException2("自定义异常2");
    }
}

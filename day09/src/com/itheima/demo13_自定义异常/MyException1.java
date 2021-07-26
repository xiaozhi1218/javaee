package com.itheima.demo13_自定义异常;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 16:06
 */
// 编译异常
public class MyException1 extends Exception {

    public MyException1() {
    }

    public MyException1(String message) {
        super(message);
    }
}

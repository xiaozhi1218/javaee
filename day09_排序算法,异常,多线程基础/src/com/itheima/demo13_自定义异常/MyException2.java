package com.itheima.demo13_自定义异常;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 16:08
 */
// 运行异常
public class MyException2 extends RuntimeException {
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}

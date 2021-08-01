package com.itheima.demo14_自定义异常的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 16:12
 */
public class RegisterException extends RuntimeException {
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}

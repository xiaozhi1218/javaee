package com.itheima.demo15_使用注解;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 14:51
 */
public @interface MyAnnotation2 {
    // 带属性的注解
    String name();
    int age();
    String[] arr();
}

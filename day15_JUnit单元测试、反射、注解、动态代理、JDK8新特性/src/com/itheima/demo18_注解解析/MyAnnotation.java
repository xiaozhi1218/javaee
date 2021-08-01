package com.itheima.demo18_注解解析;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 15:27
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String[] names();
    int age();
}

package com.itheima.demo17_元注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 15:14
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    // 限制该注解只能在方法上和类上使用
    // 设置注解保留到运行阶段
}

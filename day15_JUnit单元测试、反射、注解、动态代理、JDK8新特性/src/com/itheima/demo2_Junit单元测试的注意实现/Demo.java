package com.itheima.demo2_Junit单元测试的注意实现;

import org.junit.Test;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 8:45
 */
public class Demo {
    /*
        Junit单元测试的注意实现:
            1.测试方法必须使用public权限修饰符修饰
            2.测试方法不能有返回值,返回值类型只能写void
            3.测试方法不能有参数,必须是无参
            4.测试方法 的声明之上一定要使用@Test注解
     */
    @Test
    public void show(){
        System.out.println("show  执行了");
    }
}

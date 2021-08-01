package com.itheima.demo1_Junit的使用;

import org.junit.Test;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 8:37
 */
public class Demo2 {
    /*
        - 概述 : Junit是Java语言编写的第三方单元测试框架(工具类)
        - 作用 : 用来做“单元测试”——针对某个普通方法，可以像main()方法一样独立运行，它专门用于测试某个方法。
        - 使用步骤:
            1.下载Junit的jar包
            2.拷贝Junit的jar包到模块下的lib文件夹中,并添加到classpath路径中
            3.编写测试方法
            4.在测试方法上写上@Test注解
     */
    @Test
    public void show1(){
        System.out.println("show1 方法执行了...");
    }

    @Test
    public void show2(){
        System.out.println("show2 方法执行了...");
    }

}

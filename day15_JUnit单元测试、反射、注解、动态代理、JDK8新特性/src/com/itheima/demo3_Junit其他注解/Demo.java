package com.itheima.demo3_Junit其他注解;

import org.junit.*;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 8:52
 */
public class Demo {
    /*
        - @Before：用来修饰方法，该方法会在每一个测试方法执行之前执行一次。
        - @After：用来修饰方法，该方法会在每一个测试方法执行之后执行一次。
        - @BeforeClass：用来静态修饰方法，该方法会在所有测试方法之前执行一次，而且只执行一次。
        - @AfterClass：用来静态修饰方法，该方法会在所有测试方法之后执行一次，而且只执行一次。
     */
    @BeforeClass
    public static void bc(){
        System.out.println("bc 方法执行了");
    }

    @Before
    public void b1(){
        System.out.println("b1 方法执行了");
    }

    @Test
    public void show1(){
        System.out.println("show1 测试方法执行了...");
    }

    @Test
    public void show2(){
        System.out.println("show2 测试方法执行了...");
    }

    @After
    public void a1(){
        System.out.println("a1 方法执行了");
    }

    @AfterClass
    public static void ac(){
        System.out.println("ac 方法执行了");
    }
}

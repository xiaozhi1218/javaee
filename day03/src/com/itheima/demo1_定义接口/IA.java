package com.itheima.demo1_定义接口;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:05
 */
public interface IA {
    // 常量(jdk7及其以前) 使用public static final关键字修饰,这三个关键字都可以省略
    public static final int NUM1 = 10;
    int NUM2 = 20;

    // 抽象方法(jdk7及其以前) 使用public abstract关键字修饰,这2个关键字都可以省略
    public abstract void method1();
    void method2();

    // 默认方法(jdk8) 使用public default关键字修饰,public可以省略,default不可以省略
    public default void method3(){
        System.out.println("默认方法 method3");
    }

    // 静态方法(jdk8) 使用public static关键字修饰,public可以省略,static不可以省略
    public static void method4(){
        System.out.println("静态方法 method4");
    }
    // 私有方法(jdk9) 使用private关键字修饰,private不可以省略
//    private static void method5(){
//        System.out.println("私有静态方法  method5");
//    }

//    private void method6(){
//        System.out.println("私有非静态方法  method6");
//    }
}

package com.itheima.demo3_接口中成员的访问特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:38
 */
public interface IA {
    // 常量
    public static final int NUM = 10;

    // 抽象方法
    public abstract void method1();

    // 默认方法
    public default void method2(){
        //method4();
        //method5();
        System.out.println("IA 接口中的默认方法method2");
    }

    // 静态方法
    public static void method3(){
        //method5();
        System.out.println("IA 接口中的静态方法method3");
    }

    // 私有方法
//    private void method4(){
//        System.out.println("IA 接口中的私有方法method4");
//    }

//    private static void method5(){
//        System.out.println("IA 接口中的私有方法method5");
//    }
}

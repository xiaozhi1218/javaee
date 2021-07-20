package com.itheima.demo12_Math类;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 15:08
 */
public class Test {
    public static void main(String[] args) {
        /*
            Math类:
                - Math类的概述
                    概述:java.lang.Math(类): Math类包含执行基本数字运算的方法。
                    特点:它不能创建对象，它的构造方法被“私有”了。因为他内部都是“静态方法”，通过“类名”直接调用即可。

                - Math类的属性: static double PI;
                - Math类的常用方法:
                     public static int abs(int a) 获取参数a的绝对值：
                     public static double ceil(double a) 向上取整  大于参数的最小整数 例如:3.14 向上取整4.0
                     public static double floor(double a) 向下取整 小于参数的最大整数 例如:3.14 向下取整3.0
                     public static double pow(double a, double b)  获取a的b次幂
                     public static long round(double a) 四舍五入取整 例如:3.14 取整3  3.56 取整4
                     public static int max(int a, int b)  返回两个 int 值中较大的一个。
                     public static int min(int a, int b)  返回两个 int 值中较小的一个。
         */
        System.out.println(Math.PI);
        System.out.println("4的绝对值是:"+Math.abs(4));// 4
        System.out.println("-4的绝对值是:"+Math.abs(-4));// 4

        System.out.println("3.14向上取整:"+Math.ceil(3.14));// 4.0
        System.out.println("-3.14向上取整:"+Math.ceil(-3.14));// -3.0

        System.out.println("3.14向下取整:"+Math.floor(3.14));// 3.0
        System.out.println("-3.14向下取整:"+Math.floor(-3.14));// -4.0

        System.out.println("2的3次幂:"+Math.pow(2, 3));// 8.0
        System.out.println("3.14四舍五入:"+Math.round(3.14));// 3
        System.out.println("3.56四舍五入:"+Math.round(3.56));// 4
        System.out.println("-3.54四舍五入取整:"+Math.round(-3.54));// -4

        System.out.println(Math.max(10, 20));// 20
        System.out.println(Math.min(10, 20));// 10

    }
}

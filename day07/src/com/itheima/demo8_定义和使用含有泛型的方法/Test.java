package com.itheima.demo8_定义和使用含有泛型的方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 11:01
 */
public class Test {
    public static void main(String[] args) {
        /*
            定义含有泛型的方法:
                修饰符 <泛型变量> 返回值类型 方法名(形参列表){
                    方法体
                }
                泛型变量: 任意字母  一般会写T,M,...

            使用含有泛型的方法: 调用含有泛型方法的时候确定其泛型的具体数据类型

            什么时候会定义含有泛型的方法:
                如果一个类中,某个方法的参数类型或者返回值类型不确定的时候,可以把该方法定义为含有泛型的方法
         */
        Integer i1 = method1(100);// 指定泛型的具体数据类型为Integer
        System.out.println(i1);// 100

        System.out.println("============================");
        String s = method1("itheima");// 指定泛型的具体数据类型为String
        System.out.println(s);// itheima
    }

    // 定义含有泛型的方法
    public static <T> T method1(T t){
        return t;
    }
}

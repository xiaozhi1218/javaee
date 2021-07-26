package com.itheima.demo19_static修饰成员方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 16:33
 */
public class ChinesePeople {
    // 非静态成员变量
    String name;// 姓名
    // 静态成员变量
    static String country;// 国籍

    // 非静态方法
    public void method1(){
        System.out.println("非静态 method2方法");
    }

    public void method2(){
        // 非静态方法中可以直接访问一切成员变量和成员方法
        System.out.println(name);
        System.out.println(country);
        method1();
        method4();

        System.out.println("非静态 method2方法");
    }

    // 静态方法
    public static void method3(){
        //静态方法中不能直接访问非静态成员变量和非静态成员方法
        //System.out.println("非静态的成员变量:"+name);// 编译报错
        //method1();// 编译报错

        //静态方法中只能直接访问静态成员变量和静态成员方法
        System.out.println("静态成员变量:"+country);
        method4();

        // 静态方法中不能出现this关键字
        //System.out.println(this.name);// 编译报错
        //System.out.println(this.country);// 编译报错
        System.out.println("非静态 method3方法");
    }

    public static void method4(){
        System.out.println("非静态 method4方法");
    }
}

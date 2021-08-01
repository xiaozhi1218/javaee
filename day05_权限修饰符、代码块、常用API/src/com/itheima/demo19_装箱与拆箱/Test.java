package com.itheima.demo19_装箱与拆箱;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 17:02
 */
public class Test {
    public static void main(String[] args) {
        /*
            装箱与拆箱:
                - 装箱：从基本类型转换为对应的包装类对象。
                - 拆箱：从包装类对象转换为对应的基本类型。
            自动装箱与自动拆箱:
                - 自动装箱：从基本类型自动转换为对应的包装类对象。
                - 自动拆箱：从包装类对象自动转换为对应的基本类型。
         */
        // 装箱
        // int--->Integer
        Integer i1 = new Integer(10);// i1对象表示的整数就是10
        Integer i2 = Integer.valueOf(10);//    i2对象表示的整数就是10

        // 拆箱
        // Integer--->int
        int num1 = i1.intValue();
        int num2 = i2.intValue();

        System.out.println("==========================");

        // 自动装箱
        Integer i3 = 10;

        // 自动拆箱
        int num3 = i3;

    }
}

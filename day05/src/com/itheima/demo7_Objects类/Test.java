package com.itheima.demo7_Objects类;

import java.util.Objects;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 10:57
 */
public class Test {
    public static void main(String[] args) {
        /*
            Objects类: 避免空指针异常(容忍空指针)
                public static boolean equals(Object a, Object b):判断两个对象是否相等。
                源码:
                     public static boolean equals(Object a, Object b) {
                        return (a == b) || (a != null && a.equals(b));
                    }
         */
        String name1 = "张三";
        String name2 = new String("张三");
        String name3 = null;
        System.out.println(name1);// 张三
        System.out.println(name2);// 张三

        // 比较name1和name2字符串内容是否相同
        //System.out.println(name1.equals(name2));// true
        //System.out.println(name3.equals(name1));// 空指针异常NullPointerException,因为null不能调用方法

        System.out.println(Objects.equals(name1, name2));// true
        System.out.println(Objects.equals(name3, name1));// false
    }
}

package com.itheima.demo11_StringBuilder类的构造方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 12:26
 */
public class Test {
    public static void main(String[] args) {
        /*
            StringBuilder类的构造方法:
            public StringBuilder() 创建一个空白可变字符串对象，不含有任何内容
            public StringBuilder(String str) 根据字符串的内容，来创建可变字符串对象
         */
        // 创建空白可变字符串对象  ""
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1:"+sb1+"=");// sb1:=
        System.out.println("sb1的长度:"+sb1.length());// 0

        // 把不可变字符串转换为可变字符串
        String str = "itheima";// 不可变的字符串
        StringBuilder sb2 = new StringBuilder(str);// 可变的字符串,字符串内容是:itheima
        System.out.println("sb2:"+sb2);// sb2:itheima
        System.out.println("sb2的长度:"+sb2.length());// 7

    }
}

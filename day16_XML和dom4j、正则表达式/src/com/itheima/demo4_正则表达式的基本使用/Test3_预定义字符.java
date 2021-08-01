package com.itheima.demo4_正则表达式的基本使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/26 16:13
 */
public class Test3_预定义字符 {
    public static void main(String[] args) {
        /*
            正则表达式-预定义字符
                - 语法示例：
                  1. "." ： 匹配任何字符。如果要表示一个字符点,那么就得使用\.
                  2. "\d"：任何数字[0-9]的简写；
                  3. "\D"：任何非数字[^0-9]的简写；
                  4. "\s"： 空白字符：[ \t\n\x0B\f\r] 的简写
                  5. "\S"： 非空白字符：[^\s] 的简写
                  6. "\w"：单词字符：[a-zA-Z_0-9]的简写
                  7. "\W"：非单词字符：[^\w]
         */
        String str = "258";
        // 1.验证str是否3位数字
        System.out.println(str.matches("\\d\\d\\d"));// true
        System.out.println("2589".matches("\\d\\d\\d"));// false
        System.out.println("25a".matches("\\d\\d\\d"));// false
        System.out.println("==============================");

        // 2.验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字
        System.out.println("13738682233".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// true
        System.out.println("12738682233".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// false
        System.out.println("22738682233".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// false
        System.out.println("1378682233".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// false
        System.out.println("==============================");

        // 3.验证字符串是否以h开头，以d结尾，中间是任何字符
        System.out.println("had".matches("h.d"));// true
        System.out.println("h&d".matches("h.d"));// true
        System.out.println("a&d".matches("h.d"));// false
        System.out.println("==============================");

        //4.验证str是否是：h.d
        System.out.println("h.d".matches("h\\.d"));// true
        System.out.println("had".matches("h\\.d"));// false
        System.out.println("h&d".matches("h\\.d"));// false
        System.out.println("a&d".matches("h\\.d"));// false


    }
}

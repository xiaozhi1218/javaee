package com.itheima.demo2_创建字符串对象两种方式的区别;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 9:05
 */
public class Test {
    public static void main(String[] args) {
        /*
            通过构造方法创建
                通过 new 创建的字符串对象，每一次 new 都会申请一个内存空间，虽然字符串内容相同，但是地址值不同
            直接赋值方式创建
                以“”方式给出的字符串，只要字符序列相同(顺序和大小写)，无论在程序代码中出现几次，
                JVM 都只会建立一个 String 对象，并在字符串池中维护

         */
        // 通过构造方法创建
        char[] chs = {'a','b','c'};
        String s1 = new String(chs);// s1字符串的内容: abc
        String s2 = new String(chs);// s2字符串的内容: abc
        System.out.println(s1 == s2);// 比较s1和s2的地址值 false

        // 直接赋值方式创建
        String str1 = "abc";// str1字符串的内容: abc
        String str2 = "abc";// str2字符串的内容: abc
        System.out.println(str1 == str2);// 比较str1和str2的地址值 true

    }
}

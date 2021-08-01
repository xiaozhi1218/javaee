package com.itheima.demo6_遍历字符串案例;

import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 10:46
 */
public class Test {
    public static void main(String[] args) {
        // 需求:键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        // 2.获取字符串的长度(字符个数)
        int len = str.length();

        // 3.循环遍历
        for (int i = 0; i < len; i++) {
            // 4.在循环中,通过charAt方法字符,打印输出
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}

package com.itheima.demo7_统计字符次数案例;

import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 10:50
 */
public class Test {
    public static void main(String[] args) {
        // 需求:键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        // 2.定义一个int类型的变量,用来统计大写字母字符个数
        int count1 = 0;
        // 2.定义一个int类型的变量,用来统计小写字母字符个数
        int count2 = 0;
        // 2.定义一个int类型的变量,用来统计数字字符个数
        int count3 = 0;

        // 3.循环遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // 4.在循环中,获取遍历出来的字符
            char c = str.charAt(i);
            // 5.在循环中,判断该字符:
            if (c >= 'A' && c <= 'Z') {
                // 5.如果该字符是大写字母字符,那么统计大写字母字符个数的变量+1
                count1++;
            } else if (c >= 'a' && c <= 'z') {
                // 5.如果该字符是小写字母字符,那么统计小写字母字符个数的变量+1
                count2++;
            } else if (c >= '0' && c <= '9'){
                // 5.如果该字符是数字字符,那么统计数字字符个数的变量+1
                count3++;
            }
        }

        System.out.println("大写字母字符个数:"+count1);
        System.out.println("小写字母字符个数:"+count2);
        System.out.println("数字字符个数:"+count3);

    }
}

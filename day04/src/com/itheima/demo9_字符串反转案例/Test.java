package com.itheima.demo9_字符串反转案例;

import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 11:27
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求:
            定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出反转后的字符串
            例如，键盘录入 abc，输出结果 cba
         */
        // 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        // 调用reverse
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        // 功能:字符串反转
        // 1.创建空白的字符串对象
        String newStr = "";

        // 2.倒叙遍历传入的字符串对象
        for (int i = str.length()-1;i >= 0; i--) {
            // 3.在循环中,获取遍历出来的字符
            char c = str.charAt(i);
            // 4.在循环中,拼接遍历出来的字符
            newStr += c;
        }
        // 5.返回反转后的字符串
        return newStr;
    }

}

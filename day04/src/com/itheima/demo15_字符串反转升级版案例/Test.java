package com.itheima.demo15_字符串反转升级版案例;

import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 15:24
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求
            	定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
            	例如，键盘录入abc，输出结果 cba
         */
        // 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        // 反转
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        // 1.根据传入的字符串内容,创建对应的可变字符串
        // StringBuilder sb = new StringBuilder(str);
        // 2.调用reverse方法
        // sb.reverse();
        // 3.返回反转后的字符串
        // return sb.toString();

        return new StringBuilder(str).reverse().toString();
    }
}

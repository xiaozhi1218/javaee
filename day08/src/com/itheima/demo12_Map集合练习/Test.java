package com.itheima.demo12_Map集合练习;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 15:48
 */
public class Test {
    public static void main(String[] args) {
        /*
            Map集合练习:输入一个字符串,统计该字符串中每个字符出现次数。
         */
        // 0.输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        // 1.创建Map集合,键的类型为Character,值的类型为Integer
        HashMap<Character, Integer> map = new HashMap<>();

        // 2.循环遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 3.在循环中获取遍历出来的字符
            char c = s.charAt(i);
            // 4.判断集合中是否存在该字符的键
            if (map.containsKey(c)) {
                // 6.如果集合中已存在该字符的键,那么就取出该字符键对应的值,然后自增1,作为新的值,重新存储到Map集合中
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                // 5.如果集合中不存在该字符的键,那么就该字符作为键,值为1,存储到Map集合中
                map.put(c, 1);
            }
        }
        // 7.循环结束,打印map集合
        System.out.println(map);
    }
}

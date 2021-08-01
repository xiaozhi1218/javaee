package com.itheima.demo20_ArrayList存储字符串并遍历;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:27
 */
public class Test {
    public static void main(String[] args) {
        // 需求:创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
        // 1.创建ArrayList集合,限制集合中元素的类型为String类型
        ArrayList<String> list = new ArrayList<>();

        // 2.往集合中存储3个元素
        list.add("张柏芝");
        list.add("马蓉");
        list.add("李小璐");

        // 3.获取集合中元素的个数
        int size = list.size();

        // 4.循环遍历
        for (int i = 0; i < size; i++) {
            // 5.在循环中,获取元素,打印输出
            String e = list.get(i);
            System.out.println(e);
        }
    }
}

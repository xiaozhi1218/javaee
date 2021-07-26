package com.itheima.demo3_HashSet集合;

import java.util.HashSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 10:09
 */
public class Test {
    public static void main(String[] args) {
        /*
            HashSet集合: 元素存取无序,元素不可重复,元素无索引
         */
        // 创建HashSet集合对象,限制集合元素的类型为String
        HashSet<String> set = new HashSet<>();

        // 往集合中添加元素
        set.add("nba");
        set.add("cba");
        set.add("bac");
        set.add("abc");
        set.add("nba");

        System.out.println(set);// [cba, abc, bac, nba]

        System.out.println("nba".hashCode());// 108845
        System.out.println("cba".hashCode());// 98274
        System.out.println("bac".hashCode());// 97284
        System.out.println("abc".hashCode());// 96354
    }

}

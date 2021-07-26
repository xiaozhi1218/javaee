package com.itheima.demo5_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 11:34
 */
public class Test {
    public static void main(String[] args) {
        /*
            LinkedHashSet集合: 元素存取有序,元素无索引,元素不可重复(唯一)
                采用哈希表+链表结构，由哈希表保证元素唯一，由链表保证元素存取有序
         */
        // 创建LinkedHashSet集合,限制集合中元素的类型为Integer类型
        LinkedHashSet<Integer> set = new LinkedHashSet<>();// 存取有序
        //HashSet<Integer> set = new HashSet<>();// 存取无序

        // 往集合中存储数据
        set.add(300);
        set.add(100);
        set.add(200);
        set.add(500);
        set.add(400);
        set.add(400);

        System.out.println(set);// [300, 100, 200, 500, 400]
    }
}

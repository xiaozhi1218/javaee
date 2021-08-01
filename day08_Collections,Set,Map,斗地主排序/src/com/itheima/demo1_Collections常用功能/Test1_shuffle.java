package com.itheima.demo1_Collections常用功能;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 8:38
 */
public class Test1_shuffle {
    public static void main(String[] args) {
        /*
            Collections常用功能:
                public static void shuffle(List<?> list):打乱集合顺序。
         */
        // 创建List集合,限制集合中元素的类型为Integer类型
        List<Integer> list = new ArrayList<>();

        // 往集合中添加元素
        list.add(300);
        list.add(100);
        list.add(200);
        list.add(500);
        list.add(400);

        System.out.println("打乱顺序之前的集合:"+list);// [300, 100, 200, 500, 400]
        // 打乱顺序
        Collections.shuffle(list); // 随机打乱顺序
        System.out.println("打乱顺序之后的集合:"+list);// [500, 300, 100, 200, 400]

    }
}

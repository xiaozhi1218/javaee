package com.itheima.demo2_可变参数;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 9:59
 */
public class Test3 {
    public static void main(String[] args) {
        /*
            应用场景: Collections
                在Collections中也提供了添加一些元素方法：
                public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
         */
        // 创建ArrayList集合,限制集合元素的类型为String类型
        ArrayList<String> list = new ArrayList<>();

        // 往list集合中添加批量元素
        Collections.addAll(list,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        System.out.println(list);
    }
}

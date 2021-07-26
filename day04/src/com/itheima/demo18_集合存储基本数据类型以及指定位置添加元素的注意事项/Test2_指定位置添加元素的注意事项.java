package com.itheima.demo18_集合存储基本数据类型以及指定位置添加元素的注意事项;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:05
 */
public class Test2_指定位置添加元素的注意事项 {
    public static void main(String[] args) {
        // 1.创建ArrayList集合对象,限制集合中元素的类型为Integer
        ArrayList<Integer> list = new ArrayList<>();

        // 2.往集合中存储int类型的整数
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);// [10, 20, 30, 40]

        // 3.往索引为5的位置添加元素
        //list.add(5,50);// 报异常IndexOutOfBoundsException
        list.add(4,50);// 等价于list.add(50)
        System.out.println(list);// [10, 20, 30, 40, 50]
    }
}

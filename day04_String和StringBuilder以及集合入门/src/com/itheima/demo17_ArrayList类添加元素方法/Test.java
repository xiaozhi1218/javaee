package com.itheima.demo17_ArrayList类添加元素方法;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 15:59
 */
public class Test {
    public static void main(String[] args) {
        /*
            ArrayList<E>添加元素的方法
                - public boolean add(E e)：将指定的元素追加到此集合的末尾
                - public void add(int index,E element)：在此集合中的指定位置插入指定的元素
         */
        // 创建ArrayList集合,限制集合中元素的类型为String类型
        ArrayList<String> list = new ArrayList<>();

        // 往list集合中添加元素
        list.add("谢霆锋");
        list.add("王宝强");
        list.add("贾乃亮");
        System.out.println(list);// [谢霆锋, 王宝强, 贾乃亮]

        // 把陈羽凡插入在索引为1的位置
        list.add(1,"陈羽凡");
        System.out.println(list);// [谢霆锋, 陈羽凡, 王宝强, 贾乃亮]


    }
}

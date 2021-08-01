package com.itheima.demo19_ArrayList类常用方法;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:22
 */
public class Test2 {
    public static void main(String[] args) {
        //  public boolean remove(Object o) 删除指定的元素，返回删除是否成功
        //  public E   remove(int   index) 删除指定索引处的元素，返回被删除的元素
        // 1.创建ArrayList集合对象,限制集合中元素的类型为Integer
        ArrayList<Integer> list = new ArrayList<>();

        // 2.往集合中存储int类型的整数
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);// [1, 2, 3, 4]

        list.remove(1);// 删除索引为1的元素
        System.out.println(list);// [1, 3, 4]

        // 删除1这个元素,需要传入1的Integer对象
        list.remove(new Integer(1));
        System.out.println(list);// [3, 4]
    }
}

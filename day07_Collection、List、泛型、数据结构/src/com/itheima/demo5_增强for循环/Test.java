package com.itheima.demo5_增强for循环;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 10:09
 */
public class Test {
    public static void main(String[] args) {
        /*
            概述:增强for循环(也称for each循环)是JDK1.5以后出来的一个高级for循环，专门用来遍历数组和集合的。
                它的内部原理其实是个Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作。
            格式:
                for(元素的数据类型 变量名 :  数组名\集合名){

                }
         */
        // 创建Collection集合对象,限制集合中元素的类型为String
        Collection<String> col = new ArrayList<>();

        // 往col集合中添加元素
        col.add("范冰冰");
        col.add("李冰冰");
        col.add("林心如");
        col.add("赵薇");

        // 增强for循环遍历
        for (String e : col) {
            System.out.println(e);
        }

        System.out.println("======================================");

        String[] arr = {"范冰冰",
                "李冰冰",
                "林心如",
                "赵薇"};

        for (String e : arr){
            System.out.println(e);
        }

        System.out.println("======================================");
        // 增强for循环快捷键: 数组名\集合名.for
        for (String s : col) {
            System.out.println(s);
        }
        System.out.println("=======================================");
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("=======================================");
        Iterator<String> it = col.iterator();
        // 迭代器快捷键: itit 回车
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("=======================================");
        // 在遍历的过程中，不能对集合中的元素进行增删操作。
        /*for (String s : col) {
            if (s.equals("李冰冰")) {
                col.remove(s);
            }
        }*/
    }
}

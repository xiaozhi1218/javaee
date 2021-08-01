package com.itheima.demo6_泛型的作用;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 10:20
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            泛型的作用:
                - 集合使用泛型:使用泛型在编译期直接对类型作出了控制，只能存储泛型定义的数据
         */
        // 集合使用泛型
        // 创建ArrayList集合对象,限制集合中元素的类型为String
        ArrayList<String> list1 = new ArrayList<>();

        // 往集合中添加元素
        list1.add("杨颖");
        list1.add("迪丽热巴");
        //list1.add(100);// 编译报错
        //list1.add(3.14);// 编译报错
        System.out.println(list1);

        // 循环遍历集合元素
        for (String s : list1) {
            System.out.println(s.length());
        }
    }
}

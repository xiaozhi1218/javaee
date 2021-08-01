package com.itheima.demo6_泛型的作用;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 10:20
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            泛型的作用:
                - 集合不使用泛型: 集合不使用泛型的时候，存的时候什么类型都能存。但是取的时候就懵逼了。取出来啥也不是。
         */
        // 集合不使用泛型
        // 创建ArrayList集合对象
        ArrayList list1 = new ArrayList();

        // 往集合中添加元素
        list1.add("杨颖");
        list1.add("迪丽热巴");
        list1.add(100);
        list1.add(3.14);
        System.out.println(list1);

        // 循环遍历集合元素
        for (Object obj : list1) {
            // 在循环中,获取姓名的长度,打印输出
            String name = (String)obj;// 很容易出现类型转换异常
            System.out.println("姓名的长度:"+name.length());
        }
    }
}

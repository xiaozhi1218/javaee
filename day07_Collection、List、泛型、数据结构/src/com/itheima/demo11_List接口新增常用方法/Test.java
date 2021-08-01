package com.itheima.demo11_List接口新增常用方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 15:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            List接口新增常用方法:
                - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
                - public E get(int index):返回集合中指定位置的元素。
                - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
                - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素
         */
        // 创建list集合,限制集合中元素的类型为String类型
        List<String> list = new ArrayList<>();

        // 往集合中添加一些元素
        list.add("苍老师");
        list.add("波老师");
        list.add("吉泽老师");
        System.out.println(list);// [苍老师, 波老师, 吉泽老师]

        // 在索引为1的位置添加小泽老师
        list.add(1, "小泽老师");
        System.out.println(list);// [苍老师, 小泽老师, 波老师, 吉泽老师]

        // 获取索引为1的元素
        System.out.println("索引为1的元素:"+list.get(1));// 小泽老师

        // 删除索引为1的老师
        String removeE = list.remove(1);
        System.out.println("被删除的元素:"+removeE);// 小泽老师
        System.out.println(list);//  [苍老师, 波老师, 吉泽老师]

        // 把索引为0的元素替换为大桥老师
        String setE = list.set(0, "大桥老师");
        System.out.println("被替换的元素:"+setE);// 苍老师
        System.out.println(list);// [大桥老师, 波老师, 吉泽老师]
    }
}

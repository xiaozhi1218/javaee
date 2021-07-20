package com.itheima.demo19_ArrayList类常用方法;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:15
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            ArrayList类常用方法:
            public boolean   remove(Object o) 删除指定的元素，返回删除是否成功
            public E   remove(int   index) 删除指定索引处的元素，返回被删除的元素
            public E   set(int index, E  element) 修改指定索引处的元素，返回被修改的元素
            public E   get(int   index) 返回指定索引处的元素
            public int   size() 返回集合中的元素的个数
         */
        // 创建ArrayList集合,限制集合中元素的类型为String类型
        ArrayList<String> list = new ArrayList<>();

        // 往list集合中添加元素
        list.add("谢霆锋");
        list.add("王宝强");
        list.add("贾乃亮");
        System.out.println(list);// [谢霆锋, 王宝强, 贾乃亮]

        // 需求1:删除王宝强这个元素
        boolean res1 = list.remove("王宝强");
        System.out.println("是否删除成功:"+res1);// true
        System.out.println(list);//  [谢霆锋, 贾乃亮]

        // 需求2:删除索引为1的元素
        String removeE = list.remove(1);
        System.out.println("被删除的元素:"+removeE);// 贾乃亮
        System.out.println(list);// [谢霆锋]

        // 需求3: 修改0索引上的元素为陈冠希
        String setE = list.set(0, "陈冠希");
        System.out.println("被替换的元素:"+setE);// 谢霆锋
        System.out.println(list);// [陈冠希]

        // 需求4:获取索引为0的元素
        String e = list.get(0);
        System.out.println("索引为0的元素:"+e);// 陈冠希

        // 需求5:统计集合中元素的个数
        int size = list.size();
        System.out.println("集合中元素的个数:"+size);// 1
    }
}

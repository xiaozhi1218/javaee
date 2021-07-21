package com.itheima.demo12_LinkedList集合特有的方法;

import java.util.LinkedList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 16:03
 */
public class Test {
    public static void main(String[] args) {
        /*
            LinkedList集合特有的方法:
                - public void addFirst(E e):将指定元素插入此列表的开头。
                - public void addLast(E e):将指定元素添加到此列表的结尾。
                - public E getFirst():返回此列表的第一个元素。
                - public E getLast():返回此列表的最后一个元素。
                - public E removeFirst():移除并返回此列表的第一个元素。
                - public E removeLast():移除并返回此列表的最后一个元素。
                - public E pop():从此列表所表示的堆栈处弹出一个元素。 removeFirst()
                - public void push(E e):将元素推入此列表所表示的堆栈。addFirst()
         */
        // 创建LinkedList集合,限制集合元素的类型为String类型
        LinkedList<String> list = new LinkedList<>();

        // 往集合中添加元素
        list.add("蔡徐坤");
        list.add("鹿晗");
        list.add("吴亦凡");
        System.out.println(list);// [蔡徐坤, 鹿晗, 吴亦凡]

        // 在集合的首尾添加一个元素
        list.addFirst("罗志祥");
        list.addLast("陈冠希");
        System.out.println(list);//  [罗志祥, 蔡徐坤, 鹿晗, 吴亦凡, 陈冠希]

        // 获取集合的首尾元素
        String firstE = list.getFirst();
        String lastE = list.getLast();
        System.out.println("第一个元素是:"+firstE);// 罗志祥
        System.out.println("最后一个元素是:"+lastE);// 陈冠希

        // 删除首尾元素
        String removeFirst = list.removeFirst();
        String removeLast = list.removeLast();
        System.out.println("被删除的第一个元素是:"+removeFirst);// 罗志祥
        System.out.println("被删除的最后一个元素是:"+removeLast);// 陈冠希
        System.out.println(list);//  [蔡徐坤, 鹿晗, 吴亦凡]

        // pop  --->删除第一个元素
        String popE = list.pop();
        System.out.println("被删除的第一个元素是:"+popE);// 蔡徐坤
        System.out.println(list);// [鹿晗, 吴亦凡]

        // push --->添加一个元素在开头
        list.push("蔡徐坤");
        System.out.println(list); // [蔡徐坤, 鹿晗, 吴亦凡]
    }
}

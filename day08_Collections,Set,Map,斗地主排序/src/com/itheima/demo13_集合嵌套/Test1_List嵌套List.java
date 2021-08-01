package com.itheima.demo13_集合嵌套;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 16:09
 */
public class Test1_List嵌套List {
    /*
        List嵌套List:说明List集合中的元素是List集合
     */
    public static void main(String[] args) {
        //  List嵌套List
        // 创建一个List集合,限制元素类型为String
        List<String> list1 = new ArrayList<>();

        // 往集合中添加元素
        list1.add("王宝强");
        list1.add("贾乃亮");
        list1.add("陈羽凡");

        // 创建一个List集合,限制元素类型为String
        List<String> list2 = new ArrayList<>();

        // 往集合中添加元素
        list2.add("马蓉");
        list2.add("李小璐");
        list2.add("白百何");

        // 创建一个List集合,存储list1,list2
        List<List<String>> list = new ArrayList<>();

        // 往集合中添加元素
        list.add(list1);
        list.add(list2);

        System.out.println(list);// [[王宝强, 贾乃亮, 陈羽凡], [马蓉, 李小璐, 白百何]]
        System.out.println(list.size());// 2

        // 循环遍历
        for (List<String> e : list) {
            for (String s : e) {
                System.out.println(s);
            }
        }
    }
}

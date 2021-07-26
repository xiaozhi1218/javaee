package com.itheima.demo8_Stream流的引入;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 15:04
 */
public class Test {
    public static void main(String[] args) {
        /*
            例如: 有一个List集合,要求:
                1. 将List集合中姓张的的元素过滤到一个新的集合中
                2. 然后将过滤出来的姓张的元素,再过滤出长度为3的元素,存储到一个新的集合中
         */
        // 传统方式操作集合:
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张杰");
        list.add("张三丰");

        // 1.将List集合中姓张的的元素过滤到一个新的集合中
        // 1.1 创建一个新的集合,用来存储姓张的元素
        ArrayList<String> list1 = new ArrayList<>();

        // 1.2 循环遍历list集合
        for (String name : list) {
            // 1.3 在循环中,判断遍历出来的元素是否姓张,如果是,就存储到新的集合中
            if (name.startsWith("张")) {
                list1.add(name);
            }
        }
        System.out.println(list1);// [张无忌, 张杰, 张三丰]

        // 2. 然后将过滤出来的姓张的元素,再过滤出长度为3的元素,存储到一个新的集合中
        // 2.1 创建新的集合,用来存储姓张的并且长度为3的元素
        ArrayList<String> list2 = new ArrayList<>();

        // 2.2 循环遍历list1集合
        for (String name : list1) {
            // 2.3 在循环中,判断遍历出来的元素长度是否为3,如果为3,就添加到新的集合中
            if (name.length() == 3){
                list2.add(name);
            }
        }
        System.out.println(list2);// [张无忌, 张三丰]

        System.out.println("===================================");
        // 获取流,过滤操作,打印输出
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
    }
}

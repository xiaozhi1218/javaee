package com.itheima.demo23_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 17:30
 */
public class Test4_对象成员方法引用不带参数 {
    public static void main(String[] args) {
        /*
            对象成员方法引用不带参数: 类名::方法名
         */
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("杨紫");
        list.add("迪丽热巴");
        list.add("陈钰琪");

        // 需求: 把集合中的元素转换为该元素对应的字符长度,打印输出
        list.stream().map((String name)->{return name.length();}).forEach(System.out::println);

        // 以上map方法中的Lambda表达式大括号中的代码就是调用String类的length()方法,所以符合方法引用替换Lambda表达式
        list.stream().map(String::length).forEach(System.out::println);
    }
}

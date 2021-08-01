package com.itheima.demo23_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 17:27
 */
public class Test3_对象成员方法引用带参数 {
    public static void main(String[] args) {
        /*
            对象成员方法引用带参数: 对象名::方法名
         */
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("杨紫");
        list.add("迪丽热巴");
        list.add("陈钰琪");

        // 需求:把集合中所有元素打印输出
        list.stream().forEach(str-> System.out.println(str));

        // 以上forEach方法中的Lambda表达式大括号中的代码就调用System.out的println()方法,符合方法引用替换Lambda表达式
        list.stream().forEach(System.out::println);
    }
}

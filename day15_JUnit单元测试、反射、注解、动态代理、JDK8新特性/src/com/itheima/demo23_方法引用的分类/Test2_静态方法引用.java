package com.itheima.demo23_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 17:22
 */
public class Test2_静态方法引用 {
    public static void main(String[] args) {
        /*
            静态方法引用: 类名::方法名
         */
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("110");
        list.add("111");
        list.add("112");

        // 需求:把集合中的元素转换为int类型,打印输出
        // 获取流,映射,forEach
        list.stream().map((String str) -> {
            return Integer.parseInt(str);
        }).forEach(i -> System.out.println(i + 1));

        // 以上map方法中的Lambda表达式大括号中的代码就是调用Integer类的静态方法,所以符合方法引用替换Lambda表达式

        list.stream().map(Integer::parseInt).forEach(i-> System.out.println(i+1));

    }
}

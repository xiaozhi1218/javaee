package com.itheima.demo10_Stream流常用方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 16:21
 */
public class Test2_count {
    public static void main(String[] args) {
        /*
            count方法:
            long count();统计流中元素的个数
         */
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张杰");
        list.add("张三丰");

        long count = list.stream().count();
        System.out.println("流中元素的个数:"+count);// 5
    }
}

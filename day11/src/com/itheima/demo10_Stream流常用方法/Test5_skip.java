package com.itheima.demo10_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 16:36
 */
public class Test5_skip {
    public static void main(String[] args) {
        /*
            skip方法:
                Stream<T> skip(long n);跳过前几个元素
                如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
         */
        // 获取Stream流
        Stream<String> stream = Stream.of("张三丰", "张无忌", "灭绝师太", "周芷若", "张翠山", "殷素素");

        // 需求: 跳过前3个元素
        stream.skip(3).forEach(name-> System.out.println(name));
    }
}

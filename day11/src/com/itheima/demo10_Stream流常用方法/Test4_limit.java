package com.itheima.demo10_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 16:32
 */
public class Test4_limit {
    public static void main(String[] args) {
        /*
            limit方法:
                Stream<T> limit(long maxSize);取用前几个
                注意:参数是一个long型，如果流的当前长度大于参数则进行截取；否则不进行操作
         */
        // 获取Stream流
        Stream<String> stream = Stream.of("张三丰", "张无忌", "灭绝师太", "周芷若", "张翠山", "殷素素");

        // 需求: 保留前3个元素
        stream.limit(3).forEach(name-> System.out.println(name));
        System.out.println("===============================");

        //注意:参数是一个long型，如果流的当前长度大于参数则进行截取；否则不进行操作

        // 获取Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张无忌", "灭绝师太", "周芷若", "张翠山", "殷素素");

        // 需求: 保留前3个元素
        stream1.limit(7).forEach(name-> System.out.println(name));

    }
}

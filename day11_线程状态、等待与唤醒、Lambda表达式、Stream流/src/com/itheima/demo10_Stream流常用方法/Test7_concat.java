package com.itheima.demo10_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 16:56
 */
public class Test7_concat {
    public static void main(String[] args) {
        /*
            concat方法:
                static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b);合并2个流
         */
        // 获取流
        Stream<String> stream1 = Stream.of("10", "20", "30", "40");

        // 获取Stream流
        Stream<String> stream2 = Stream.of("张三丰", "张无忌", "灭绝师太", "周芷若", "张翠山", "殷素素");

        // 需求:合并stream1和stream2
        Stream<String> stream = Stream.concat(stream1, stream2);
        stream.forEach(name-> System.out.println(name));

    }
}

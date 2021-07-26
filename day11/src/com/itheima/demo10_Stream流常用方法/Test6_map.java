package com.itheima.demo10_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 16:38
 */
public class Test6_map {
    public static void main(String[] args) {
        /*
            map方法:
                <R> Stream<R> map(Function<? super T, ? extends R> mapper);
                参数Function<T, R>: 函数式接口,抽象方法 R apply(T t);
                Function<T, R>其实就是一个类型转换接口(T和R的类型可以一致,也可以不一致)
         */
        // 获取流
        Stream<String> stream1 = Stream.of("10", "20", "30", "40");
        // 需求:把stream1流中的元素转换为int类型
        stream1.map((String s)->{return Integer.parseInt(s);}).forEach((Integer i)->{
            System.out.println(i+1);
        });

        System.out.println("=========================");
        // 获取流
        Stream<String> stream2 = Stream.of("10", "20", "30", "40");
        // 需求:把stream1流中的元素转换为String类型
        stream2.map((String s)->{return s+"itheima";}).forEach((String i)->{
            System.out.println(i+1);
        });
    }
}

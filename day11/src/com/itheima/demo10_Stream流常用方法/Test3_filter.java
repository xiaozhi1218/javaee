package com.itheima.demo10_Stream流常用方法;

import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 16:23
 */
public class Test3_filter {
    /*
        filter方法:
            Stream<T> filter(Predicate<? super T> predicate);过滤出满足条件的元素
            参数Predicate: 函数式接口, 抽象方法 boolean test(T t);
            Predicate接口:是一个判断接口
     */
    public static void main(String[] args) {
        // 获取Stream流
        Stream<String> stream = Stream.of("张三丰", "张无忌", "灭绝师太", "周芷若", "张翠山", "殷素素");
        // 需求:过滤出姓张的元素
        stream.filter((String s) -> {
            return s.startsWith("张");
        }).forEach((String name)->{
            System.out.println(name);
        });

    }
}

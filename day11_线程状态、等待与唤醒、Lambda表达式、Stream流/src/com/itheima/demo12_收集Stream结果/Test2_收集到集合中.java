package com.itheima.demo12_收集Stream结果;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 17:12
 */
public class Test2_收集到集合中 {
    public static void main(String[] args) {
        /*
            Stream<T>流中提供了一个方法,可以把流中的数据收集到单列集合中:
                <R,A> R collect(Collector<? super T,A,R> collector): 把流中的数据收集到单列集合中
                    返回值类型是R,也就是说R指定为什么类型,就是收集到什么类型的集合
                    参数Collector<? super T,A,R>中的R类型: 决定把流中的元素收集到哪个集合中

                - 参数Collector如何得到? 使用java.util.stream.Collectors工具类中的静态方法:
                    - public static <T> Collector<T, ?, List<T>> toList()：转换为List集合。
                    - public static <T> Collector<T, ?, Set<T>> toSet()：转换为Set集合。


         */
        // 传统方式操作集合:
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张杰");
        list.add("张三丰");
        // 需求:过滤过滤出姓张的并且长度为3的元素
        Stream<String> stream = list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3);

        // 收集到List单列集合中
        //List<String> list1 = stream.collect(Collectors.toList());
        //System.out.println(list1);// [张无忌, 张三丰]

        // 收集到Set单列集合中
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);// [张无忌, 张三丰]
    }
}

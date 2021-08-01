package com.itheima.demo6_Lambda表达式省略格式;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 12:19
 */
@FunctionalInterface
interface A {
    void method(int num);
}

public class Test {

    public static void show(A a) {
        a.method(10);
    }

    public static void main(String[] args) {
        /*
            Lambda表达式省略格式:
                1.小括号中的形参类型可以省略
                2.如果小括号中只有一个参数,那么小括号也可以省略
                3.如果大括号中只有一条语句,那么大括号,分号,return可以一起省略
         */
        // 案例1:创建线程执行任务
        new Thread(() ->
                System.out.println("任务代码")
        ).start();

        // 案例2: 对ArrayList集合元素进行排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(300);
        list.add(200);
        list.add(100);
        list.add(500);
        list.add(400);
        System.out.println("排序前:" + list);

        // 对集合中的元素按照降序排序

        // 函数式编程:Lambda表达式
        Collections.sort(list, (i1, i2) -> i2 - i1);

        System.out.println("排序后:" + list);

        System.out.println("=======================================");
        // Lambda标准格式
        show((int num) -> {
            System.out.println(num);
        });

        // Lambda省略格式
        show(num ->
                System.out.println(num)
        );

    }
}

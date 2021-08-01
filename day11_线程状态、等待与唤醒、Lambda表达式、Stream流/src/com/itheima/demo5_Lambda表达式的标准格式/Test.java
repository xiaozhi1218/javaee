package com.itheima.demo5_Lambda表达式的标准格式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 11:58
 */
@FunctionalInterface // 是函数式接口
interface A{
  void method1();
}
// @FunctionalInterface 编译报错,不是函数式接口
interface B{
    void method1();
    void method2();
}
public class Test {
    public static void main(String[] args) {
        /*
            Lambda表达式的标准格式:
                Lambda表达式的作用: 就是简化代码，省略了面向对象中类和方法,对象的书写。
                Lambda表达式的标准格式:
                    (参数类型 参数名,参数类型 参数名,...) -> { 代码语句 }
                Lambda表达式的格式说明:
                    1.小括号中的参数要和接口中抽象方法的形参列表一致,无参数则留空；多个参数则用逗号分隔。
                    2.->是新引入的语法格式，代表指向动作。可以理解为把小括号中的参数传递给大括号中使用
                    3.大括号中的内容其实就是存放以前重写抽象方法的方法体
                Lambda表达式的使用条件: 接口中有且仅有一个抽象方法的接口,才可以使用Lambda表达式
                    1.接口中只有一个抽象方法的接口,叫做函数式接口
                    2.如果是函数式接口,那么就可以使用@FunctionalInterface注解来标识

                使用Lambda表达式:
                    1.判断接口是否是函数式接口
                    2.如果是函数式接口,那么就直接写()->{}
                    3.然后填充小括号和大括号中的内容
         */
        // 案例1:创建线程执行任务
        new Thread(()->{
            System.out.println("任务代码");
        }).start();

        // 案例2: 对ArrayList集合元素进行排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(300);
        list.add(200);
        list.add(100);
        list.add(500);
        list.add(400);
        System.out.println("排序前:"+list);

        // 对集合中的元素按照降序排序
        // 面向对象:对象
       /* Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/
        // 函数式编程:Lambda表达式
        Collections.sort(list,(Integer i1,Integer i2)->{return i2 - i1;});

        System.out.println("排序后:"+list);
    }
}

package com.itheima.demo7_Lambda的表现形式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 12:32
 */
public class Test {
    public static void main(String[] args) {
        /*
            Lambda的表现形式:
                1.变量的形式:变量的类型为函数式接口类型,那么可以赋值一个Lambda表达式
                2.参数的形式:方法的形参类型为函数式接口类型,那么就可以传入一个Lambda表达式           常见
                3.返回值的形式:方法的返回值类型为函数式接口类型,那么就可以返回一个Lambda表达式        常见
         */
        // 变量的形式:
        Runnable r = ()->{
            System.out.println("任务代码");
        };
        Comparator<Integer> com = (Integer i1,Integer i2)->{return i2 - i1;};

        // 参数形式:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(300);
        list.add(200);
        list.add(100);
        list.add(500);
        list.add(400);
        System.out.println("排序前:" + list);

        // 对集合中的元素按照降序排序
        Collections.sort(list,(Integer i1,Integer i2)->{return i2 - i1;});
        System.out.println("排序后:" + list);// 降序
        Collections.sort(list, getComparator());
        System.out.println("排序后:" + list);// 升序

    }

    // 返回值形式
    public static Comparator<Integer> getComparator(){
        return (Integer i1 , Integer i2)->{return i1 - i2;};
    }
}

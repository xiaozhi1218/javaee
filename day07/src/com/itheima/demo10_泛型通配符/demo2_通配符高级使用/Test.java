package com.itheima.demo10_泛型通配符.demo2_通配符高级使用;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 11:39
 */
public class Test {
    public static void main(String[] args) {
        /*
            通配符高级使用----受限泛型:
                上限: <? extends 类名>  只能接收该类类型或者其子类类型
                下限: <? super 类名>   只能接收该类类型或者其父类类型
         */
        // 关系:String继承Object,Integer继承Number,Number继承Objec
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();

        method1(list1);
        method1(list2);
        method1(list3);
        method1(list4);

        //method2(list1);// 编译报错
        //method2(list2);// 编译报错
        method2(list3);
        method2(list4);


        method3(list1);
        //method3(list2);// 编译报错
        method3(list3);
        method3(list4);
    }

    // 定义一个方法,只可以接收以上list3和list4集合
    public static void method2(ArrayList<? extends Number> list){

    }

    // 定义一个方法,只可以接收以上list3和list4,list1集合
    public static void method3(ArrayList<? super Integer> list){

    }

    // 定义一个方法,可以接收以上4个集合
    public static void method1(ArrayList<?> list){

    }
    // 定义一个方法,可以接收以上4个集合
    public static void method(ArrayList list){

    }
}

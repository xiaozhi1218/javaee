package com.itheima.demo10_泛型通配符.demo1_通配符基本使用;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 11:29
 */
public class Test {
    public static void main(String[] args) {
        /*
            通配符基本使用:
                泛型的通配符:不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。
                注意: 不能往该集合中存储数据,只能获取数据.
         */
        // 关系:String继承Object,Integer继承Number,Number继承Objec
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();

        list2.add("itheima");

        //method1(list1);
        method1(list2);
        //method1(list3);
        //method1(list4);

        //method2(list1);
        method2(list2);
        //method2(list3);
        //method2(list4);

        // 泛型没有多态
        //ArrayList<Object> list = new ArrayList<String>();// 编译报错
    }
    // 定义一个方法,可以接收以上4个集合
    public static void method1(ArrayList list){
        Object obj = list.get(0);
        list.add("jack");
        System.out.println("obj:"+obj);// itheima
        System.out.println("list:"+list);// [itheima, jack]
    }

    public static void method2(ArrayList<?> list){
        Object obj = list.get(0);
        //list.add("jack");// 编译报错
        System.out.println("obj:"+obj);// itheima
        System.out.println("list:"+list);// [itheima]
    }
}

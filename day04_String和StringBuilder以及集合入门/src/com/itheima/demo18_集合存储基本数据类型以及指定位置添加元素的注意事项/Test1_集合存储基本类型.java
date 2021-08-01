package com.itheima.demo18_集合存储基本数据类型以及指定位置添加元素的注意事项;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:05
 */
public class Test1_集合存储基本类型 {
    public static void main(String[] args) {
        /*
                基本数据类型            对应            包装类类型
                    byte                                    Byte
                    short                                   Short
                    int                                     Integer
                    long                                    Long
                    float                                   Float
                    double                                  Double
                    boolean                                 Boolean
                    char                                    Character
         */
        // 需求:往集合中存储int类型的整数
        // 1.创建ArrayList集合对象,限制集合中元素的类型为Integer
        ArrayList<Integer> list = new ArrayList<>();

        // 2.往集合中存储int类型的整数
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);// [10, 20, 30, 40]

        System.out.println("============================");
        // 基本类型--->包装类
        Integer i = 10;// 自动装箱: 系统会自动把基本类型的数据装箱为包装类类型的对象
        // 包子类---->基本类型
        int num = i;// 自动拆箱: 系统会自动把包装类类型的对象拆箱为对应的基本数据类型
    }
}

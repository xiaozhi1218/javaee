package com.itheima.demo1_Collections常用功能;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 8:45
 */
public class Test2_sort {
    public static void main(String[] args) {
        /*
            Collections常用功能:
                public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
                默认规则: 事先写好的规则
                排序规则: 集合元素所属的类一定要实现Comparable接口,重写compareTo方法,在compareTo方法中指定排序规则
         */
        // 创建List集合,限制集合中元素的类型为Integer类型
        List<Integer> list = new ArrayList<>();

        // 往集合中添加元素
        list.add(300);
        list.add(100);
        list.add(200);
        list.add(500);
        list.add(400);

        System.out.println("排序之前的集合:"+list); // [300, 100, 200, 500, 400]
        // 将集合中元素按照默认规则排序
        Collections.sort(list);
        System.out.println("排序之后的集合:"+list); // [100, 200, 300, 400, 500]

        System.out.println("=========================================");

        // 创建List集合,限制集合中元素的类型为Student类型
        List<Student> list1 = new ArrayList<>();

        // 往集合中添加元素
        Student stu1 = new Student(19);
        Student stu2 = new Student(18);
        Student stu3 = new Student(20);
        Student stu4 = new Student(17);
        list1.add(stu1);
        list1.add(stu2);
        list1.add(stu3);
        list1.add(stu4);
        System.out.println("排序之前的集合:"+list1);
        // 将集合中元素按照默认规则排序
        Collections.sort(list1);
        System.out.println("排序之后的集合:"+list1);




    }
}

package com.itheima.demo1_Collections常用功能;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 9:05
 */
public class Test3_sort {
    public static void main(String[] args) {
        /*
            Collections常用功能:
             public static <T> void sort(List<T> list，Comparator<? super T> com):将集合中元素按照指定规则排序。
              参数Comparator: 就是用来指定排序规则的
              通过Comparator接口中的compare方法来指定排序规则
         */
        // 创建List集合,限制集合中元素的类型为Integer类型
        List<Integer> list = new ArrayList<>();

        // 往集合中添加元素
        list.add(300);
        list.add(100);
        list.add(200);
        list.add(500);
        list.add(400);

        System.out.println("排序之前的集合:" + list); // [300, 100, 200, 500, 400]
        // 将集合中元素按照指定规则排序---->降序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 指定排序规则
                // 前减后  升序
                // 后减前  降序
                // 前: 第一个参数o1  后:第二个参数o2
                return o2 - o1;
            }
        });
        System.out.println("排序之后的集合:" + list); // [500, 400, 300, 200, 100]

        // 将集合中元素按照指定规则排序---->升序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("排序之后的集合:" + list);// [100, 200, 300, 400, 500]

        System.out.println("=======================================");

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
        System.out.println("排序之前的集合:" + list1);
        // 将集合中元素按照指定规则排序-->按照年龄降序排序
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 指定排序规则
                // 前减后  升序
                // 后减前  降序
                // 前: 第一个参数o1  后:第二个参数o2
                return o2.age - o1.age;
            }
        });
        System.out.println("排序之后的集合:" + list1);

        // 将集合中元素按照指定规则排序-->按照年龄升序排序
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 指定排序规则
                // 前减后  升序
                // 后减前  降序
                // 前: 第一个参数o1  后:第二个参数o2
                return o1.age - o2.age;
            }
        });
        System.out.println("排序之后的集合:" + list1);
    }
}

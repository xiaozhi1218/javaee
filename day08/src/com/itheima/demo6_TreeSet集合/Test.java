package com.itheima.demo6_TreeSet集合;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 11:38
 */
public class Test {
    public static void main(String[] args) {
        /*
            TreeSet集合: 元素无索引,元素唯一,对元素进行排序
                通过构造方法实现排序:
                    public TreeSet()：						     根据其元素的自然排序进行排序
                            默认规则排序:集合元素所属的类需要实现Comparable接口,重写compareTo方法,在compareTo方法中指定默认排序规则

                    public TreeSet(Comparator<E> comparator):    根据指定的比较器进行排序
                            指定规则排序: 通过传入Comparator接口的实现类对象,在实现类对象中重写compare方法,在compare方法中指定排序规则
         */
        // 按照默认规则排序---->默认升序
        // 创建TreeSet集合,限制集合中元素的类型为Integer类型
        TreeSet<Integer> set = new TreeSet<>();

        // 往集合中存储数据
        set.add(300);
        set.add(100);
        set.add(200);
        set.add(500);
        set.add(400);
        set.add(400);
        System.out.println(set);// [100, 200, 300, 400, 500]

        System.out.println("===========================================");
        // 按照指定规则排序---->降序
        // 创建TreeSet集合,限制集合中元素的类型为Integer类型
        TreeSet<Integer> set1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                    指定排序规则:
                    前减后  升序
                    后减前  降序
                    前:第一个参数  后:第二个参数
                 */
                return o2 - o1;
            }
        });

        // 往集合中存储数据
        set1.add(300);
        set1.add(100);
        set1.add(200);
        set1.add(500);
        set1.add(400);
        set1.add(400);
        System.out.println(set1);// [500, 400, 300, 200, 100]

        System.out.println("===========================================");
        // 按照指定规则排序---->升序
        // 创建TreeSet集合,限制集合中元素的类型为Integer类型
        TreeSet<Integer> set2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                    指定排序规则:
                    前减后  升序
                    后减前  降序
                    前:第一个参数  后:第二个参数
                 */
                return o1 - o2;
            }
        });

        // 往集合中存储数据
        set2.add(300);
        set2.add(100);
        set2.add(200);
        set2.add(500);
        set2.add(400);
        set2.add(400);
        System.out.println(set2);// [100, 200, 300, 400, 500]
    }
}

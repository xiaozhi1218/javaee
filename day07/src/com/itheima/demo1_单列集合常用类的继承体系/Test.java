package com.itheima.demo1_单列集合常用类的继承体系;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 8:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            单列集合常用类的继承体系:
                Collection集合:接口,是所有单列集合的顶层父接口,该集合中的方法可以被所有单列集合共享
                    List集合: 接口,元素可重复,元素有索引,元素存取有序
                        ArrayList集合: 实现类,查询快,增删慢
                        LinkedList集合: 实现类,查询慢,增删快

                    Set集合: 接口, 元素不可重复(唯一),元素无索引
                        HashSet集合: 实现类,元素存取无序
                        LinkedHashSet集合:实现类,元素存取有序
                        TreeSet集合:实现类,可以对集合中的元素进行排序
         */
    }
}

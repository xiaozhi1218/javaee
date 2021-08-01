package com.itheima.demo2_Collection常用方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 8:59
 */
public class Test {
    public static void main(String[] args) {
        /*
            Collection<E>常用方法:
                - public boolean add(E e)：  把给定的对象添加到当前集合中 。
                - public void clear() :清空集合中所有的元素。
                - public boolean remove(E e): 把给定的对象在当前集合中删除。
                - public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
                - public boolean isEmpty(): 判断当前集合是否为空。
                - public int size(): 返回集合中元素的个数。
                - public Object[] toArray(): 把集合中的元素，存储到数组中
         */
        // 创建Collection集合对象,限制集合中元素的类型为String
        Collection<String> col = new ArrayList<>();

        // 往col集合中添加元素
        col.add("范冰冰");
        col.add("李冰冰");
        col.add("林心如");
        col.add("赵薇");

        System.out.println("col集合:"+col);// col集合:[范冰冰, 李冰冰, 林心如, 赵薇]

        // 清空集合中所有的元素
        //col.clear();
        //System.out.println("col集合:"+col);// col集合:[]

        // 删除李冰冰这个元素
        col.remove("李冰冰");
        System.out.println("col集合:"+col);// col集合:[范冰冰, 林心如, 赵薇]

        // 判断col集合中是否包含李冰冰这个元素
        boolean res1 = col.contains("李冰冰");
        System.out.println("res1:"+res1);// false
        // 判断col集合中是否包含林心如这个元素
        boolean res2 = col.contains("林心如");
        System.out.println("res2:"+res2);// true

        //判断当前集合是否为空。(判断集合中是否有元素)
        boolean res3 = col.isEmpty();
        System.out.println("res3:"+res3);// false
        /*col.clear();// 清空元素
        boolean res4 = col.isEmpty();
        System.out.println("res4:"+res4);// true*/

        // 获取集合中元素的个数
        System.out.println("集合中元素的个数:"+col.size());// 3

        // 把集合中的元素，存储到数组中
        Object[] arr = col.toArray();
        System.out.println(Arrays.toString(arr));// [范冰冰, 林心如, 赵薇]
    }
}

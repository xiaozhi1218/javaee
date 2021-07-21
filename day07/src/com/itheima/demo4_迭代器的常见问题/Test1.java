package com.itheima.demo4_迭代器的常见问题;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 9:41
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            迭代器的常见问题 :
                问题一:在进行集合元素获取时，如果集合中已经没有元素可以迭代了，还继续使用迭代器的next方法，
                       将会抛出java.util.NoSuchElementException没有集合元素异常。
         */
        // 创建Collection集合对象,限制集合中元素的类型为String
        Collection<String> col = new ArrayList<>();

        // 往col集合中添加元素
        col.add("范冰冰");
        col.add("李冰冰");
        col.add("林心如");
        col.add("赵薇");

        // 获取集合的迭代器对象
        Iterator<String> it = col.iterator();

        // 循环判断集合中是否有元素可以迭代
        while (it.hasNext()) {
            // 获取可以迭代的元素
            String e = it.next();
            System.out.println(e);
        }

        System.out.println("====================================");

        // 再获取集合中的元素
        //String next = it.next();// 运行异常NoSuchElementException

        // 如果迭代完了,还想继续迭代集合元素,就可以重新再获取一个迭代器
        Iterator<String> it2 = col.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}

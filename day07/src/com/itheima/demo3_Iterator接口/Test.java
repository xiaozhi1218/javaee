package com.itheima.demo3_Iterator接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 9:18
 */
public class Test {
    public static void main(String[] args) {
        /*
            迭代：即Collection集合元素的通用获取方式。
                  在取元素之前先要判断集合中有没有元素，
                  如果有，就把这个元素取出来，继续再判断，如果还有就再取出来。
                  一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。
            获取迭代器对象: 使用Collection集合中的iterator()方法
                    public Iterator<E> iterator();

            判断集合中是否有元素可以迭代: 使用Iterator接口中的方法
                    public boolean hasNext();

            取出集合中可以迭代的元素: 使用Iterator接口中的方法
                    public E next();

         */
        // 创建Collection集合对象,限制集合中元素的类型为String
        Collection<String> col = new ArrayList<>();

        // 往col集合中添加元素
        col.add("范冰冰");
        col.add("李冰冰");
        col.add("林心如");
        col.add("赵薇");

        // 获取迭代器对象
        Iterator<String> it = col.iterator();

        // 循环判断集合中是否有元素可以迭代
        while (it.hasNext()){
            // 说明有元素可以迭代
            String e = it.next();
            System.out.println(e);
        }
    }
}

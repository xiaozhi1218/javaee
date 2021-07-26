package com.itheima.demo4_迭代器的常见问题;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/13 9:46
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            迭代器的常见问题:
             问题二:在进行集合元素迭代时，如果添加或移除集合中的元素 ,
                   将无法继续迭代 , 将会抛出ConcurrentModificationException并发修改异常.
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
            // 添加元素到集合中
            //col.add("高圆圆");// 报异常
            // 删除元素
            //col.remove(e);// 报异常
            // 如果迭代出来的元素是李冰冰,就删除
            if (e.equals("李冰冰")){
                it.remove();
            }
        }

        System.out.println("集合:"+col);// 集合:[范冰冰, 林心如, 赵薇]
    }
}

package com.itheima.demo14_CopyOnWriteArraySet;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:19
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        // 演示HashSet线程不安全:2条线程都往同一个HashSet集合中添加10000个元素
        new MyThread1().start();

        // 往集合中添加20000个元素
        for (int i = 0; i < 20000; i++) {
            MyThread1.set.add(i);
        }

        // 为了保证主线程和子线程对set集合操作完毕
        Thread.sleep(5000);

        System.out.println("set集合元素个数:"+ MyThread1.set.size());
        /*
            期望: 20000个元素
            实际: 多于20000个元素
         */
    }
}

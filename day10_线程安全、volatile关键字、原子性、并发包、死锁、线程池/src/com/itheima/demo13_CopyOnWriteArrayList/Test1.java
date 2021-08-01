package com.itheima.demo13_CopyOnWriteArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:07
 */
public class Test1 {
    public static void main(String[] args) {
        // 演示ArrayList线程不安全:2条线程都往ArrayList集合中添加100000个元素
        // 创建并启动线程
        new MyThread1().start();

        // 主线程往集合中添加100000个元素
        for (int i = 0; i < 100000; i++) {
            MyThread1.list.add(i);
        }

        // 为了保证主线程和子线程对list集合都操作完毕
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("list集合元素个数:"+ MyThread1.list.size());
        /*
            期望: 200000个元素
            实际: 少于200000个元素
         */
    }
}

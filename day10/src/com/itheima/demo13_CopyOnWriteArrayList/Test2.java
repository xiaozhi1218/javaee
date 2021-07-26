package com.itheima.demo13_CopyOnWriteArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:07
 */
public class Test2 {
    public static void main(String[] args) {
        // 演示CopyOnWriteArrayList线程安全:2条线程都往CopyOnWriteArrayList集合中添加1000个元素
        // 创建并启动线程
        new MyThread2().start();

        // 主线程往集合中添加1000个元素
        for (int i = 0; i < 1000; i++) {
            MyThread2.list.add(i);
        }

        // 为了保证主线程和子线程对list集合都操作完毕
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("list集合元素个数:"+ MyThread2.list.size());
        /*
            实际: 2000个元素
         */
    }
}

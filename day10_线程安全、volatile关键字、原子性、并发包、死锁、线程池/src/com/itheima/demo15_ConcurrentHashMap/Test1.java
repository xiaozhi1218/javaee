package com.itheima.demo15_ConcurrentHashMap;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:28
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        // 演示HashMap线程不安全:2条线程往集合中添加键值对
        new MyThread1().start();

        // 往集合中添加键值对
        for (int i = 0; i < 300000; i++) {
            MyThread1.map.put(i,i);
        }

        Thread.sleep(5000);

        System.out.println("集合键值对个数:"+ MyThread1.map.size());
        /*
            期望: 30万个
            实际: 大于30万个
         */

    }
}

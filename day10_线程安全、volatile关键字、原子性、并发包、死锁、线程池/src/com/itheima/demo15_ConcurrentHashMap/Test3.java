package com.itheima.demo15_ConcurrentHashMap;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:28
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        // 演示ConcurrentHashMap线程不安全:2条线程往集合中添加键值对
        new MyThread3().start();

        // 往集合中添加键值对
        for (int i = 0; i < 400000; i++) {
            MyThread3.map.put(i,i);
        }

        Thread.sleep(5000);

        System.out.println("集合键值对个数:"+ MyThread3.map.size());
        /*
            实际: 40万个
         */

    }
}

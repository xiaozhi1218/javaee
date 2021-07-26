package com.itheima.demo12_AtomicIntegerArray类;

import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 15:47
 */
public class Test {
    public static void main(String[] args) {
        /*
             AtomicIntegerArray类:   表示int[]数组,操作该数组就是原子操作
             演示: 3000条线程都对一个长度为1000的数组中的所有元素全部自增1
         */
        for (int i = 0; i < 3000; i++) {
            MyThread mt = new MyThread();
            mt.start();
        }

        // 为了保证所有线程都执行完毕
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(MyThread.arr);
    }
}

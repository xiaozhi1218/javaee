package com.itheima.demo16_CountDownLatch使用;

import java.util.concurrent.CountDownLatch;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:02
 */
public class MyThread1 extends Thread {

    CountDownLatch cdl;

    public MyThread1(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        //打印A
        System.out.println("打印A...");

        //调用await()方法进入等待(线程2打印B)
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //打印C
        System.out.println("打印C...");
    }
}

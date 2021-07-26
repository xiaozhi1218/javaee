package com.itheima.demo16_CountDownLatch使用;

import java.util.concurrent.CountDownLatch;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:04
 */
public class MyThread2 extends Thread {

    CountDownLatch cdl;

    public MyThread2(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        //  打印B
        System.out.println("打印B...");

        //  调用countDown()方法让计数器-1
        cdl.countDown();
    }
}

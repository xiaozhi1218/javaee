package com.itheima.demo17_CyclicBarrier使用;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:17
 */
public class MyRunnable implements Runnable {

    CyclicBarrier cb;

    public MyRunnable(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        //  到达会议室
        System.out.println(Thread.currentThread().getName()+":到达了会议室");

        //调用await()方法告诉CyclicBarrier,当前线程到了屏障,然后当前线程阻塞
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        //离开会议室
        System.out.println(Thread.currentThread().getName()+":离开会议室");

    }
}

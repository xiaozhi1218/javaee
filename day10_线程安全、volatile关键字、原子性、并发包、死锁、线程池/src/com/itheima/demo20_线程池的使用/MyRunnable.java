package com.itheima.demo20_线程池的使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 18:22
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("任务开始....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务结束....");
    }
}

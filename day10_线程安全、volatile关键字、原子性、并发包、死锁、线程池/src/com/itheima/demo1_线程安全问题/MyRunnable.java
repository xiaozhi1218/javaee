package com.itheima.demo1_线程安全问题;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 8:47
 */
public class MyRunnable implements Runnable {
    // 共享变量
    int tickets = 100;

    @Override
    public void run() {
        // 线程的任务代码---卖票
        while (true) {
            // 加锁
            if (tickets < 1) {
                break;
            }
            // 暂停100ms模拟收钱的操作
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +
                    ":正在出售第" + tickets + "张票");

            tickets--;
            // 释放锁

        }
    }
}

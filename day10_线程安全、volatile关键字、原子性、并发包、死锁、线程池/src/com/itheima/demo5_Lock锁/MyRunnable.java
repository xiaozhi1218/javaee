package com.itheima.demo5_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 8:47
 */
public class MyRunnable implements Runnable {
    // 共享变量
    int tickets = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // 线程的任务代码---卖票
        while (true) {
            // 加锁
            lock.lock();
            if (tickets < 1) {
                lock.unlock();
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
            lock.unlock();
        }
    }
}

package com.itheima.demo3_同步方法;

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
            if (sellTickets()) break;
        }
    }

    private synchronized boolean sellTickets() {
        if (tickets < 1) {
            return true;
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
        return false;
    }
}

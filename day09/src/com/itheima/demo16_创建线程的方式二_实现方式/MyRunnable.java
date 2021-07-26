package com.itheima.demo16_创建线程的方式二_实现方式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 17:09
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 线程需要执行的任务代码
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程 第"+(i+1)+"次循环");
        }
    }
}

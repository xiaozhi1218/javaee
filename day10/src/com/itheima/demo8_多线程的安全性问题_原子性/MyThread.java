package com.itheima.demo8_多线程的安全性问题_原子性;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:50
 */
public class MyThread extends Thread {
    // 共享变量
    static int a = 0;

    @Override
    public void run() {
        // 任务:对共享变量a自增10万次
        for (int i = 0; i < 100000; i++) {
            a++;
        }
        System.out.println("子线程执行完毕!");
    }
}

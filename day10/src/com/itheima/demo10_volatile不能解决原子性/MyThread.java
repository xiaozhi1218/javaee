package com.itheima.demo10_volatile不能解决原子性;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:50
 */
public class MyThread extends Thread {
    // 共享变量
    volatile static int a = 0;

    @Override
    public void run() {
        // 任务:对共享变量a自增80万次
        for (int i = 0; i < 800000; i++) {
            a++;
        }
        System.out.println("子线程执行完毕!");
    }
}

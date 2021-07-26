package com.itheima.demo11_AtomicInteger类;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:50
 */
public class MyThread extends Thread {
    // 共享变量
    //static int a = 0;
    //static AtomicInteger a = new AtomicInteger();// a表示整数0
    static AtomicInteger a = new AtomicInteger(0);// a表示整数0

    @Override
    public void run() {
        // 任务:对共享变量a自增10万次
        for (int i = 0; i < 100000; i++) {
            //a++;
            a.getAndIncrement();// 相当于a++
        }
        System.out.println("子线程执行完毕!");
    }
}

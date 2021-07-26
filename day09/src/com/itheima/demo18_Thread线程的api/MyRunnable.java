package com.itheima.demo18_Thread线程的api;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 17:38
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":开始执行...");
        System.out.println(Thread.currentThread().getName()+":结束执行...");
    }
}

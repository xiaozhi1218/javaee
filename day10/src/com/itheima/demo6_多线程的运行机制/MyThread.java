package com.itheima.demo6_多线程的运行机制;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 10:47
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("小强:第"+i+"次循环");
        }
    }
}

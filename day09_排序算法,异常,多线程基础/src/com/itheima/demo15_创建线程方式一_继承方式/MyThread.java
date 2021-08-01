package com.itheima.demo15_创建线程方式一_继承方式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 16:58
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程 第"+(i+1)+"次循环");
        }
    }
}

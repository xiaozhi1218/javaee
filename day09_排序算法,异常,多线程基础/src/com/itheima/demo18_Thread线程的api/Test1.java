package com.itheima.demo18_Thread线程的api;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 17:30
 */
public class Test1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();// 名称: 默认名称 Thread-0
        t1.start();

        MyThread t2 = new MyThread("线程1");// 名称:线程1
        t2.start();

        // 名称: main
        System.out.println(Thread.currentThread().getName()+": 开始执行...");
        System.out.println(Thread.currentThread().getName()+": 结束执行...");
    }
}

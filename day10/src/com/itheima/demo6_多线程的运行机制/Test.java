package com.itheima.demo6_多线程的运行机制;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 10:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            多线程的运行机制:
                    1.当一个线程启动后，JVM会为其分配一个独立的"线程栈区"，这个线程会在这个独立的栈区中运行。
                    2.线程的调度就是抢占式
         */
        // 创建线程对象
        MyThread mt = new MyThread();
        // 启动线程
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("旺财:第"+i+"次循环");
        }
    }
}

package com.itheima.demo18_Thread线程的api;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 17:37
 */
public class Test2 {
    public static void main(String[] args) {
        // 创建实现类对象
        MyRunnable mr = new MyRunnable();

        // 创建线程对象
        Thread t1 = new Thread(mr);
        t1.start();

        Thread t2 = new Thread(mr,"A线程");
        t2.start();

        System.out.println("======================");
        new Thread(mr,"线程1").start();
        new Thread(mr,"线程2").start();
        new Thread(mr,"线程3").start();
        new Thread(mr,"线程4").start();
        new Thread(mr,"线程5").start();
    }
}

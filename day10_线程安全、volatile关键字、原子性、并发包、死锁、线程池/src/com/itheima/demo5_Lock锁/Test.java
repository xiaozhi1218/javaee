package com.itheima.demo5_Lock锁;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 8:46
 */
public class Test {

    public static void main(String[] args) {
        /*
            Lock的实现类是ReentrantLock
            Lock锁也称同步锁，加锁与释放锁方法化了，如下：
                - public void lock():加同步锁。
                - public void unlock():释放同步锁。

         */
        // 创建任务对象
        MyRunnable mr = new MyRunnable();

        // 创建4个窗口---创建4条线程
        Thread t1 = new Thread(mr, "窗口1");
        Thread t2 = new Thread(mr, "窗口2");
        Thread t3 = new Thread(mr, "窗口3");
        Thread t4 = new Thread(mr, "窗口4");

        // 启动线程,执行任务
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

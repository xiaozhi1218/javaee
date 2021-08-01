package com.itheima.demo2_同步代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 8:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            同步代码块:
                概述:synchronized关键字可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问
                格式:
                    synchronized(锁对象){

                    }
                锁对象:
                    1.语法上,锁对象可以是任意类的对象
                    2.多条线程想要实现同步,必须锁对象一致
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

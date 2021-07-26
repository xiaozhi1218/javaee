package com.itheima.demo17_CyclicBarrier使用;

import com.itheima.demo12_AtomicIntegerArray类.MyThread;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:11
 */
public class Test {
    public static void main(String[] args) {
        /*
            概述:CyclicBarrier的字面意思是可循环使用（Cyclic）的屏障（Barrier）。
            它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，
            屏障才会开门，所有被屏障拦截的线程才会继续运行。
            api:
                构造方法:
                    public CyclicBarrier(int parties, Runnable barrierAction)
                        参数1parties: 代表要达到屏障的线程数量
                        参数2barrierAction:表示达到屏障后要执行的线程任务

                成员方法:
                    public int await() 每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞

            例如：公司召集5名员工开会，等5名员工都到了，会议开始。
            分析:
                1.5名员工就可以使用5条线程来表示
                2.5条线程的任务都一样:
                    到达会议室
                    调用await()方法告诉CyclicBarrier,当前线程到了屏障,然后当前线程阻塞
                    离开会议室
         */
        // 创建CyclicBarrier
        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("好了,人到齐了,咱们开始开会...");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("好了,咱们今天的会议就到这结束,晚上聚餐!");
            }
        });

        // 创建任务
        MyRunnable mr = new MyRunnable(cb);
        // 创建5条线程
        new Thread(mr,"员工1").start();
        new Thread(mr,"员工2").start();
        new Thread(mr,"员工3").start();
        new Thread(mr,"员工4").start();
        new Thread(mr,"员工5").start();

    }
}

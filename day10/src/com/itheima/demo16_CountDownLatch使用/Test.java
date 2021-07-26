package com.itheima.demo16_CountDownLatch使用;

import java.util.concurrent.CountDownLatch;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:53
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*
            CountDownLatch允许一个或多个线程等待其他线程完成操作。
            CountDownLatch的api:
                构造方法:public CountDownLatch(int count)  初始化一个指定计数器的CountDownLatch对象
                成员方法:
                    public void await()     让当前线程等待(当计数器的值为0,那么等待结束)
                    public void countDown()	 计数器进行减1

            例如：线程1要执行打印：A和C，线程2要执行打印：B,但要求线程1打印C之前,一定要打印B
            分析:
                线程1:
                    任务:
                        打印A
                        调用await()方法进入等待(线程2打印B)
                        打印C
                线程2:
                    任务:
                        打印B
                        调用countDown()方法让计数器-1

                注意:
                    1.创建的CountDownLatch对象的计数器初始值为1
                    2.线程1和线程2使用的CountDownLatch对象要一致
         */
        // 创建CountDownLatch对象,指定计数器的值为1
        CountDownLatch cdl = new CountDownLatch(1);
        // 创建并启动线程
        new MyThread1(cdl).start();
        Thread.sleep(5000);
        new MyThread2(cdl).start();
    }
}

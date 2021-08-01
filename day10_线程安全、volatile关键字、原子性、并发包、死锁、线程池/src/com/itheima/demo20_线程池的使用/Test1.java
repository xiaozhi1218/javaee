package com.itheima.demo20_线程池的使用;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 18:11
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            线程池的使用:
                真正的线程池接口是java.util.concurrent.ExecutorService
                java.util.concurrent.Executors线程工厂类里面提供了一些静态工厂，生成一些常用的线程池。
                Executors类中有个创建线程池的方法如下：
                    - public static ExecutorService newFixedThreadPool(int nThreads)：创建指定数量的线程的线程池
                如何提交任务到线程池,并执行任务:ExecutorService线程池的方法
                    - public Future<?> submit(Runnable task):获取线程池中的某一个线程对象，并执行任务
                    - public <T> Future<T> submit(Callable<T> task):获取线程池中的某一个线程对象，并执行任务
                    - Future--->用来封装线程任务执行后的返回值
                         V get();可以获取封装的返回值
                    -Callable<V>接口:
                           V call() throws Exception;

               线程池的使用步骤:
                    1.创建线程池,初始化线程
                    2.创建任务
                    3.提交任务,执行任务
                    4.销毁线程池(开发中,一般不会)

         */
        // 1.创建一个线程池,初始化2条线程
        ExecutorService pools = Executors.newFixedThreadPool(2);

        // 2.创建任务
        MyRunnable mr = new MyRunnable();

        // 3.提交任务,执行任务
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);
        pools.submit(mr);

        // 4.销毁线程池(开发中,一般不会)
        pools.shutdown();

    }
}

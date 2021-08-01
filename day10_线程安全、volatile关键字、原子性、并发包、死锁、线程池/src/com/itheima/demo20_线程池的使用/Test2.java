package com.itheima.demo20_线程池的使用;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 18:26
 */
public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.创建线程池,初始化2条线程
        ExecutorService pools = Executors.newFixedThreadPool(2);

        // 2.创建任务
        MyCallable mc = new MyCallable();

        // 3.提交任务,执行任务
        pools.submit(mc);
        pools.submit(mc);
        pools.submit(mc);
        pools.submit(mc);
        pools.submit(mc);
        pools.submit(mc);
        pools.submit(mc);
        Future<String> f = pools.submit(mc);
        System.out.println(f.get());// itheima

        // 4.销毁线程池(开发中,一般不会)
        pools.shutdown();
    }
}

package com.itheima.demo21_线程池的练习;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 18:30
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 线程池的练习: 使用线程池方式执行任务,返回1-n的和
        // 创建线程池
        ExecutorService pools = Executors.newFixedThreadPool(2);

        // 创建任务
        MyCallable mc = new MyCallable(100);

        // 提交任务
        Future<Integer> f = pools.submit(mc);
        System.out.println("n的累加和:"+f.get());// n的累加和:5050

        // 销毁线程池(一般不操作)
        pools.shutdown();
    }
}

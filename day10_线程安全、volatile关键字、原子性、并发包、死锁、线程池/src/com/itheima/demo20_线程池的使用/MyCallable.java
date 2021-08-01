package com.itheima.demo20_线程池的使用;

import java.util.concurrent.Callable;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 18:26
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("任务开始...");
        Thread.sleep(5000);
        System.out.println("任务结束...");
        return "itheima";
    }
}

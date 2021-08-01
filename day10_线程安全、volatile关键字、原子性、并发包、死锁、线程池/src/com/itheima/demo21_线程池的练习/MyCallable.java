package com.itheima.demo21_线程池的练习;

import java.util.concurrent.Callable;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 18:31
 */
public class MyCallable implements Callable<Integer> {
    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

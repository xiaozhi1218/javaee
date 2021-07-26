package com.itheima.demo12_AtomicIntegerArray类;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 15:50
 */
public class MyThread extends Thread{
    // 共享数组
    //static int[] arr = new int[1000];
    static AtomicIntegerArray arr = new AtomicIntegerArray(1000);

    @Override
    public void run() {
        // 对arr数组中所有元素全部自增1
        for (int i = 0; i < arr.length(); i++) {
            //arr[i]++;
            arr.getAndAdd(i, 1);
        }
    }
}

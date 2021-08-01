package com.itheima.demo14_CopyOnWriteArraySet;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:20
 */
public class MyThread2 extends Thread {
    // 共享变量
    //static HashSet<Integer> set = new HashSet<>();
    static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        // 往集合中添加20000个元素
        for (int i = 0; i < 20000; i++) {
            set.add(i);
        }
    }
}

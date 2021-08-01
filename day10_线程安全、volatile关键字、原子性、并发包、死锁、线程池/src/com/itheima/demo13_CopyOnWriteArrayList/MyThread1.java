package com.itheima.demo13_CopyOnWriteArrayList;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:07
 */
public class MyThread1 extends Thread{
    // 共享变量
    static ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        // 往集合中添加100000个元素
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }
}

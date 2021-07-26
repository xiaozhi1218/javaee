package com.itheima.demo13_CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:07
 */
public class MyThread2 extends Thread{
    // 共享变量
    //static ArrayList<Integer> list = new ArrayList<>();
    static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        // 往集合中添加1000个元素
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
    }
}

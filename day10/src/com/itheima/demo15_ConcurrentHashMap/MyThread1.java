package com.itheima.demo15_ConcurrentHashMap;

import java.util.HashMap;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:29
 */
public class MyThread1 extends Thread {
    // 共享变量
    static HashMap<Integer, Integer> map = new HashMap<>();

    @Override
    public void run() {
        // 往集合中添加键值对
        for (int i = 0; i < 300000; i++) {
            map.put(i,i);
        }
    }
}

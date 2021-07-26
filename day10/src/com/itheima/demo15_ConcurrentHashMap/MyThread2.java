package com.itheima.demo15_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 16:29
 */
public class MyThread2 extends Thread {
    // 共享变量
    //static HashMap<Integer, Integer> map = new HashMap<>();
    static Hashtable<Integer, Integer> map = new Hashtable<>();

    @Override
    public void run() {
        // 往集合中添加键值对
        for (int i = 0; i < 400000; i++) {
            map.put(i,i);
        }
    }
}

package com.itheima.demo18_Semaphore使用;

import java.util.concurrent.Semaphore;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:31
 */
public class ClassRoom {

    Semaphore sp = new Semaphore(3);

    public void comeIn(){
        // 获得许可
        try {
            sp.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 在教室
        System.out.println(Thread.currentThread().getName()+":获得许可,进入教室...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":离开教室,释放许可...");
        // 释放许可
        sp.release();
    }
}

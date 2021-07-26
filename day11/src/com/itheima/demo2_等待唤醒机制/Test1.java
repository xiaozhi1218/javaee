package com.itheima.demo2_等待唤醒机制;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 10:13
 */
public class Test1 {
    // 锁对象
    static Object lock = new Object();

    public static void main(String[] args) {
        // 无限等待线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (lock){
                        System.out.println("无限等待线程:准备进入无限等待状态...");
                        // 进入无限等待状态
                        try {
                            lock.wait();// 醒了-->锁阻塞
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("无限等待线程:被其他线程唤醒=========================================");
                    }
                }
            }
        }).start();

        // 唤醒线程
        new Thread(new Runnable() {
            @Override
            public void run() {
               while (true){
                   synchronized (lock){
                       System.out.println("唤醒线程: 准备唤醒无限等待线程...");
                       lock.notify();
                       /*try {
                           Thread.sleep(10000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }*/
                       System.out.println("唤醒线程: 唤醒完毕");
                   }// 释放锁
               }
            }
        }).start();
    }
}

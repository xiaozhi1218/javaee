package com.itheima.demo18_Thread线程的api;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 17:31
 */
public class MyThread extends Thread {

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName()+": 子线程 任务代码开始执行了...");
        // 暂停3秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+": 子线程 任务代码结束执行了...");

    }
}

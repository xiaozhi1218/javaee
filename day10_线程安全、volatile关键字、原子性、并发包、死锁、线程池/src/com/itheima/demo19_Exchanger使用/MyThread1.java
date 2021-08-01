package com.itheima.demo19_Exchanger使用;

import java.util.concurrent.Exchanger;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:46
 */
public class MyThread1 extends Thread {

    Exchanger<String> ex;

    public MyThread1(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        System.out.println("线程1:准备把数据传递给线程2...");
        String msg = null;
        try {
            msg = ex.exchange("数据1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1: 接收到线程2的数据是"+msg);
    }
}

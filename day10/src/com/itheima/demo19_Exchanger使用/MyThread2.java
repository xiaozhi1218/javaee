package com.itheima.demo19_Exchanger使用;

import java.util.concurrent.Exchanger;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:49
 */
public class MyThread2 extends Thread {

    Exchanger<String> ex;

    public MyThread2(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        System.out.println("线程2:准备把数据传递给线程1...");
        String msg = null;
        try {
            msg = ex.exchange("数据2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程2: 接收到线程1的数据是"+msg);
    }
}

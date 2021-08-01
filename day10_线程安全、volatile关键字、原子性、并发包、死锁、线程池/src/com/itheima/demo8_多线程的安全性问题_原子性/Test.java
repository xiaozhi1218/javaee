package com.itheima.demo8_多线程的安全性问题_原子性;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:48
 */
public class Test {

    public static void main(String[] args) {
        /*
            多线程的安全性问题-原子性:
                概述:所谓的原子性是指在一次操作或者多次操作中，要么所有的操作全部都得到了执行并且不会受到任何因素的干扰而中断，
                     要么所有的操作都不执行，多个操作是一个不可以分割的整体。
                演示:一条子线程和一条主线程都对共享变量a进行++操作,每条线程对a++操作100000次
         */
        // 创建线程对象
        MyThread mt = new MyThread();
        // 启动线程
        mt.start();

        // 主线程对共享变量a自增10万次
        for (int i = 0; i < 100000; i++) {
            MyThread.a++;
        }

        // 暂停,保证主线程和子线程都对共享变量a自增完了10万次,再统计a的结果
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印最终共享变量a的值
        System.out.println("最终:"+MyThread.a);// 最终:162243
        /*
            期望:最终a的值为200000
         */
    }
}

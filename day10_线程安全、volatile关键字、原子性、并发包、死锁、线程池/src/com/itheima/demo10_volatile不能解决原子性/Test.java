package com.itheima.demo10_volatile不能解决原子性;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:48
 */
public class Test {

    public static void main(String[] args) {

        // 创建线程对象
        MyThread mt = new MyThread();
        // 启动线程
        mt.start();

        // 主线程对共享变量a自增80万次
        for (int i = 0; i < 800000; i++) {
            MyThread.a++;
        }

        // 暂停,保证主线程和子线程都对共享变量a自增完了80万次,再统计a的结果
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印最终共享变量a的值
        System.out.println("最终:"+ MyThread.a);// 最终:少于160万

    }
}

package com.itheima.demo17_创建线程的方式三_匿名内部类方式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 17:14
 */
public class Test {
    public static void main(String[] args) {
        /*
            创建线程的方式三_匿名内部类方式:
                1.创建Runnable的匿名内部类
                2.在匿名内部类中重写run方法,把线程需要执行的任务代码放入run方法中
                3.创建Thread线程对象,并传入Runnable的匿名内部类
                4.调用start()方法启动线程,执行任务

            注意:
                1.主线程一定会等子线程全部执行完毕才会结束主线程
                2.子线程任务代码执行完毕,线程就会销毁
         */

        for (int j = 0; j < 100; j++) {
            System.out.println("主线程 第"+(j+1)+"次循环");
        }

        // 创建Thread线程对象,并传入Runnable的匿名内部类
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // 线程需要执行的任务代码
                for (int i = 0; i < 100; i++) {
                    System.out.println("子线程 第"+(i+1)+"次循环");
                }
            }
        });

        // 调用start()方法启动线程,执行任务
        t.start();



    }
}

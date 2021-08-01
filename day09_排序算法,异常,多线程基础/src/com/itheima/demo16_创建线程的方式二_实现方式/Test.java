package com.itheima.demo16_创建线程的方式二_实现方式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 17:07
 */
public class Test {
    public static void main(String[] args) {
        /*
            创建线程的方式二_实现方式:
                1.创建实现类实现Runnable接口
                2.在实现类中重写run方法,把线程需要执行的任务代码放入run方法中
                3.创建实现类对象
                4.创建Thread线程对象,并传入Runnable接口的实现类对象
                5.调用start()方法启动线程,执行任务
         */
        //创建实现类对象
        MyRunnable mr = new MyRunnable();

        //创建Thread线程对象,并传入Runnable接口的实现类对象
        Thread t1 = new Thread(mr);
        //Thread t2 = new Thread(mr);

        //调用start()方法启动线程,执行任务
        t1.start();


        for (int j = 0; j < 100; j++) {
            System.out.println("主线程 第"+(j+1)+"次循环");
        }
    }
}

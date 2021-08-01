package com.itheima.demo15_创建线程方式一_继承方式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/16 16:57
 */
public class Test {
    public static void main(String[] args) {
        /*
            补充: java程序至少有2条线程:一条为主线程,一条为垃圾回收线程
            创建线程方式一_继承方式:
                1.创建子类继承Thread类
                2.在子类中重写run方法,把线程需要执行的任务代码放在run方法中
                3.创建子类线程对象
                4.调用start()方法启动线程,执行任务代码
         */
        // 创建子类线程对象
        MyThread mt1 = new MyThread();
        //MyThread mt2 = new MyThread();
        // 调用start()方法启动线程,执行任务代码
        mt1.start();

        for (int j = 0; j < 100; j++) {
            System.out.println("主线程 第"+(j+1)+"次循环");
        }
    }
}

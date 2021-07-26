package com.itheima.demo9_volatile解决可见性;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:00
 */
public class Test {
    public static void main(String[] args) {
        /*
            volatile解决可见性:使用volatile关键字修饰共享变量
         */
        // 创建并启动线程
        MyThread mt = new MyThread();
        mt.start();

        // 主线程
        while (true){
            if (MyThread.flag == true){
                System.out.println("结束死循环");
                break;
            }
        }

    }
}

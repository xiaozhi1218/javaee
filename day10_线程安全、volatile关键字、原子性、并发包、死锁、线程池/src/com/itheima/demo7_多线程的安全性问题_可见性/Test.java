package com.itheima.demo7_多线程的安全性问题_可见性;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:00
 */
public class Test {
    public static void main(String[] args) {
        /*
            多线程的安全性问题-可见性:
                概述: 一个线程没有看见另一个线程对共享变量的修改
                例如:先启动一个线程，在线程中将一个变量的值更改，而主线程却一直无法获得此变量的新值。
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
        /*
            期望结果: 子线程修改共享变量flag的值为true后,主线程就会结束死循环
            实际结果: 子线程修改共享变量flag的值为true后,主线程没有结束死循环
            原因: 子线程对共享变量flag修改后的值,主线程不可见
            由于死循环是非常简单,接近底层的代码,所以只需速度非常的快,来不及去主
            内存中从新获取新的值,所以主线程工作内存中的flag的值一直是false,一直死循环
            如果某一个时刻,主线程去主内存中从新获取修改后的flag值,就会结束死循环,
            但主线程什么时候会去主内存中获取修改后的flag值,我们不确定,所以可能存在多线程
            可见性问题
         */
    }
}

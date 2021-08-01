package com.itheima.demo19_Exchanger使用;

import java.util.concurrent.Exchanger;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:37
 */
public class Test {
    public static void main(String[] args) {
        /*
            Exchanger<V>使用:
                概述:Exchanger用于进行线程间的数据交换。
                api:
                    public Exchanger();
                    public V exchange(V x): 传递数据,参数就是你要传递的数据,返回值就是其他线程传递给你的数据
                演示:
                    线程1: 把"数据1"传递给线程2
                    线程2: 把"数据2"传递给线程1
         */
        // 创建Exchanger对象
        Exchanger<String> ex = new Exchanger<>();

        // 创建并启动线程
        new MyThread1(ex).start();
        new MyThread2(ex).start();

    }
}

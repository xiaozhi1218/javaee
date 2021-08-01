package com.itheima.demo1_死锁;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 9:12
 */
public class Test {
    public static void main(String[] args) {
        /*
            产生死锁的条件
                1.有多把锁
                2.有多个线程
                3.有同步代码块嵌套
         */
        // 线程1: 锁A,锁B,执行
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("锁A"){
                    System.out.println("线程1:拿到锁A,准备拿锁B...");
                    synchronized ("锁B"){
                        System.out.println("线程1:拿到了锁A和锁B,开始执行");
                    }
                }
            }
        }, "线程1").start();


        // 线程2:锁B,锁A,执行
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("锁B"){
                    System.out.println("线程2:拿到锁B,准备拿锁A...");
                    synchronized ("锁A"){
                        System.out.println("线程2:拿到了锁B和锁A,开始执行");
                    }
                }
            }
        }, "线程2").start();
    }
}

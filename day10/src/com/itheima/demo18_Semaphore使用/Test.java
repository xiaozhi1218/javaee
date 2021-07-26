package com.itheima.demo18_Semaphore使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 17:28
 */
public class Test {
    public static void main(String[] args) {
        /*
            Semaphore使用:
                概述:Semaphore的主要作用是控制线程的并发数量。
                api:
                    public Semaphore(int permits)   permits 表示许可线程的数量
                    public void acquire()     	表示获取许可
                    public void release()		表示释放许可
               演示:5名同学要进教室,但要设置每次只能2个同学进入教室
         */
        // 创建ClassRoom对象
        ClassRoom cr = new ClassRoom();

        // 创建并启动线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        }, "张三1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        }, "张三2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        }, "张三3").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        }, "张三4").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        }, "张三5").start();

    }
}

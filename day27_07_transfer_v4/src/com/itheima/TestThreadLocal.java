package com.itheima;

/**
 * 包名:com.itheima
 * @author Leevi
 * 日期2020-10-16  12:08
 * 它的功能是，在一个线程中就存储一个数据，那么就能保证在这一个线程的各个地方，从该ThreadLocal对象中
 * 获取到的数据绝对是同一个数据
 */
public class TestThreadLocal {
    public static void main(String[] args) {
        //测试ThreadLocal的使用
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("周杰棍");
        threadLocal.set("双杰伦");

        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("奥巴马");

                System.out.println(Thread.currentThread().getId()+":"+threadLocal.get());
            }
        }).start();


        System.out.println(Thread.currentThread().getId()+":"+threadLocal.get());
    }
}

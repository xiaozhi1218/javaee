package com.itheima.demo4_同步方法的锁对象;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 10:06
 */
public class Test {
    public static void main(String[] args) {
        // 上厕所不被打扰
        Demo d = new Demo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                // 张三上厕所
                synchronized (d) {
                    System.out.println(Thread.currentThread().getName() + ":打开厕所门...");
                    System.out.println(Thread.currentThread().getName() + ":关闭厕所门...");
                    System.out.println(Thread.currentThread().getName() + ":脱裤子...");
                    System.out.println(Thread.currentThread().getName() + ":蹲下...");
                    System.out.println(Thread.currentThread().getName() + ":用力...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":擦屁股...");
                    System.out.println(Thread.currentThread().getName() + ":穿裤子...");
                    System.out.println(Thread.currentThread().getName() + ":冲厕所...");
                    System.out.println(Thread.currentThread().getName() + ":打开厕所门,洗手,走人...");
                }
            }
        }, "张三").start();


        // 李四上厕所---调用method1方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 李四上厕所
                d.method1();
            }
        }, "李四").start();

    }
}

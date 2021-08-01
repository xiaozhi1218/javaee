package com.itheima.demo4_同步方法的锁对象;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 10:09
 */
public class Demo {


    // 锁对象: this--d这个对象
    public  synchronized void method1() {
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

    // 锁对象: Demo.class
    public static synchronized void method2() {
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

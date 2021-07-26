package com.itheima.demo9_volatile解决可见性;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 11:01
 */
public class MyThread extends Thread {
    // 共享变量(主和子线程共享)
    volatile static boolean flag = false;

    @Override
    public void run() {
        // 暂停5秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 修改flag的值
        flag = true;
        System.out.println("子线程把flag的值修改为true了");
    }
}

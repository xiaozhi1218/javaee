package com.itheima.demo3_吃包子案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 11:07
 */
// 吃货线程
public class ChiHuo extends Thread {

    BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        // 吃包子
        while (true){
            // 1.加锁
            synchronized (bz) {
                // 2.锁中: 判断是否有包子:
                // 如果没有包子,就进入无限等待
                if (bz.flag == false){
                    try {
                        bz.wait();// 无限等待--醒了--锁阻塞--可运行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 如果有包子,就吃包子,吃完了,唤醒包子铺线程来生产包子
                if (bz.flag == true){
                    System.out.println("吃货线程:开始吃包子,包子的馅儿是:"+bz.xianer);
                    bz.flag = false;
                    System.out.println("吃货线程:吃完了包子,包子铺线程快来做包子========================================");
                    bz.notify();// 唤醒包子铺线程
                }
            }// 释放锁
        }
    }
}

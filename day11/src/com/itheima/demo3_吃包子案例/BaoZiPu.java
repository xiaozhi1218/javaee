package com.itheima.demo3_吃包子案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/19 11:06
 */
//包子铺线程
public class BaoZiPu extends Thread {

    BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        // 生产包子
        while (true){
            // 1.加锁
            synchronized (bz) {
                // 2.锁中: 判断是否有包子:
                // 如果有包子,就进入无限等待
                if (bz.flag == true){
                    try {
                        bz.wait();// 无限等待-醒了--锁阻塞--可运行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 如果没有包子,就生产包子,生产完了,唤醒吃货线程来吃包子
                if (bz.flag == false){
                    System.out.println("包子铺线程:开始制作包子...");
                    bz.xianer = "韭菜鸡蛋";
                    bz.flag = true;
                    System.out.println("包子铺线程:包子做好了,吃货快来吃包子...");
                    bz.notify();// 唤醒吃货线程
                }
            }// 释放锁
        }
    }
}

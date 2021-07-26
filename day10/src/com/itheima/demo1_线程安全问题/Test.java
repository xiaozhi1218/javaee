package com.itheima.demo1_线程安全问题;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/17 8:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求: 模拟电影院4个窗口卖100张电影票
            分析:
                售票窗口: 使用线程来模拟
                4个窗口共同卖100张票
                4个窗口卖票的任务是一样的(线程的任务代码是一样的)
            问题:
                1.重复票
                2.遗漏票
                3.负数票(最多到-2)
         */
        // 创建任务对象
        MyRunnable mr = new MyRunnable();

        // 创建4个窗口---创建4条线程
        Thread t1 = new Thread(mr, "窗口1");
        Thread t2 = new Thread(mr, "窗口2");
        Thread t3 = new Thread(mr, "窗口3");
        Thread t4 = new Thread(mr, "窗口4");

        // 启动线程,执行任务
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

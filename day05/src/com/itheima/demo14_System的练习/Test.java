package com.itheima.demo14_System的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/10 15:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求: 在控制台输出1-10000，计算这段代码执行了多少毫秒
         */
        // 1.获取循环执行之前距离标准基准时间的毫秒值
        long start = System.currentTimeMillis();
        // 2.执行循环
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }
        // 3.获取循环执行之后距离标准基准时间的毫秒值
        long end = System.currentTimeMillis();

        // 4.计算2个时间差,打印输出
        System.out.println(end - start);// 1135毫秒

    }
}

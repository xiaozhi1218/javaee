package com.itheima.demo18_装饰设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 16:54
 */
// 被装饰类
public class LiuDeHua implements Star {
    @Override
    public void sing() {
        System.out.println("刘德华在唱忘情水...");
    }

    @Override
    public void dance() {
        System.out.println("刘德华在跳拉丁舞...");
    }
}

package com.itheima.demo18_装饰设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 16:56
 */
// 装饰类
public class LiuDeHuaWrapper implements Star {

    LiuDeHua ldh;

    public LiuDeHuaWrapper(LiuDeHua ldh) {
        this.ldh = ldh;
    }

    @Override
    public void sing() {
        // 增强
        ldh.sing();
        System.out.println("刘德华在唱练习...");
    }

    @Override
    public void dance() {
        // 不需要增强----调用被装饰类中的同名方法
        ldh.dance();
    }
}

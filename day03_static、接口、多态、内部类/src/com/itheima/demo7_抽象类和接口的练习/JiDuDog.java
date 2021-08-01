package com.itheima.demo7_抽象类和接口的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 11:18
 */
public class JiDuDog extends Dog implements JiDu{
    @Override
    public void houJiao() {
        System.out.println("缉毒犬找到了毒品,开始吼叫,汪汪汪....");
    }

    @Override
    public void eat() {
        System.out.println("缉毒之前,开始吃骨头...");
    }

    @Override
    public void jiDu() {
        System.out.println("吃完东西后,开始使用鼻子查找毒品....");
    }
}

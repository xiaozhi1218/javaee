package com.itheima.demo18_装饰设计模式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 16:49
 */
public class Test {
    public static void main(String[] args) {
        /*
            装饰设计模式:
                概述:指的是在不改变原类, 不使用继承的基础上，动态地扩展一个对象的功能。
                步骤:
                    1. 装饰类和被装饰类必须实现相同的接口
                    2. 在装饰类中必须传入被装饰类的引用
                    3. 在装饰类中对需要扩展的方法进行扩展
                    4. 在装饰类中对不需要扩展的方法调用被装饰类中的同名方法
                案例:
                    需求:
                        在不改变原类的基础上对LiuDeHua类的sing方法进行扩展---不可以使用继承
         */
        // 创建刘德华对象
        LiuDeHua ldh = new LiuDeHua();
        // 调用方法
        //ldh.sing();
        //ldh.dance();

        // 创建增强的刘德华对象
        LiuDeHuaWrapper ldhW = new LiuDeHuaWrapper(ldh);
        ldhW.sing();
        ldhW.dance();
    }

}

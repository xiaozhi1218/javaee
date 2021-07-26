package com.itheima.demo20_匿名内部类2;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 16:08
 */
interface A{
    public abstract void show();
}
class Imp implements A{
    public void show(){
        System.out.println("实现类实现show方法");
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            匿名内部类:
                概述:本质是一个接口的匿名实现类的对象
                格式:
                    new 接口名(){
                        实现抽象方法
                    };
         */
        // 需求:调用A接口的show方法
        // 1.创建实现类实现A接口
        // 2.在实现类中重写show方法
        // 3.创建实现类对象
        // 4.使用实现类对象调用show方法
        Imp imp = new Imp();// imp就是接口的实现类的对象
        imp.show();

        System.out.println("==============================");
        // 简化: 匿名内部类
        A a = new A() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        a.show();

        // 匿名子类的匿名对象
        new Imp().show();// 实现类的匿名对象调用show方法
        new A() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();// 匿名实现类的匿名对象调用show方法



        method(new A() {
            @Override
            public void show() {

            }
        });
    }

    public static void method(A a){

    }
}

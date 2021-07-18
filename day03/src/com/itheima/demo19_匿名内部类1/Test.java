package com.itheima.demo19_匿名内部类1;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 15:54
 */
abstract class Animal{
    public abstract void eat();
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            匿名内部类:
                概述:本质其实就是一个类的匿名子类的对象
                作用:就是用来简化代码的,没有其他的功能
                格式:
                    new 类名(){
                        实现抽象方法
                    };
         */
        // 需求:调用Animal类的eat方法
        // 1.创建一个子类继承Animal类
        // 2.在子类中重写eat抽象方法
        // 3.创建子类对象
        // 4.使用子类对象调用eat方法
        Dog d = new Dog();// 创建Animal子类对象
        d.eat();// d---->是Animal类的子类的对象
        // 问题:以上4步一步都不能少,有点麻烦,是否可以简化代码?
        // 解决:匿名内部类可以简化代码,因为它可以不创建子类的情况下,直接得到一个类的子类对象

        System.out.println("==========================");
        // 创建Animal子类对象<=====>Animal类的匿名内部类
        // 父类的引用指向子类的对象
        Animal anl = new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        };// 是Animal类的子类的对象
        anl.eat();

        method(new Animal() {
            @Override
            public void eat() {

            }
        });
    }

    public static void method(Animal anl){

    }
}

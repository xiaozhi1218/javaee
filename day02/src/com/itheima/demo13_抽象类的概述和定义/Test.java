package com.itheima.demo13_抽象类的概述和定义;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 14:38
 */
public class Test {
    public static void main(String[] args) {
        /*
            抽象类:
                概述:使用abstract关键字修饰的类就是抽象类
                特点:抽象类不能创建对象,主要用来给子类继承的
                格式:
                    public abstract class 类名{
                        成员变量
                        构造方法
                        成员方法
                        抽象方法
                    }
               抽象类成员:
                    成员变量
                    构造方法
                    成员方法
                    抽象方法
              普通类和抽象类的区别:
                 1.普通类可以创建对象,抽象类不可以创建对象
                 2.普通类没有抽象方法,抽象类有抽象方法
         */
        //Animal anl1 = new Animal();// 编译报错,抽象类不能创建对象
        //Animal anl2 = new Animal("旺财",2);// 编译报错,抽象类不能创建对象
    }
}

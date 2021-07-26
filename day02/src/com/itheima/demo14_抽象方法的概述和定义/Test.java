package com.itheima.demo14_抽象方法的概述和定义;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 14:47
 */
public class Test {
    public static void main(String[] args) {
        /*
            抽象方法:
                概述: 使用abstract修饰,并且没有方法体的方法
                格式: 修饰符 abstract 返回值类型 方法名(形参列表);
                抽象方法的使用场景:如果父类中某个方法,所有子类都有不同的实现,那么就可以把该方法定义为抽象方法
                抽象方法的作用: 强制要求子类重写

         */
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
    }
}

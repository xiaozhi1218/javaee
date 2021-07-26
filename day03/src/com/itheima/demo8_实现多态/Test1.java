package com.itheima.demo8_实现多态;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 11:42
 */
class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
}

public class Test1 {
    public static void main(String[] args) {
        /*
            多态: 同一种行为,不同的事物具有不同的表现形态
            实现多态:
                1.继承或者实现
                2.父类引用指向子类对象\接口引用指向实现类对象
                3.方法重写
         */
        // 父类引用指向子类对象
        Animal anl = new Dog();// 多态
        anl.eat();// 狗吃骨头...

        Animal anl1 = new Cat();
        anl1.eat();// 猫吃鱼...
    }
}

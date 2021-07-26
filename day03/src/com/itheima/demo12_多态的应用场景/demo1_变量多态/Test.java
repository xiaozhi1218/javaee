package com.itheima.demo12_多态的应用场景.demo1_变量多态;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 12:23
 */
class Animal{
    public void eat(){
        System.out.println("吃东西...");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
public class Test {
    public static void main(String[] args) {
        // 变量多态: 父类类型的变量指向子类类型的对象
        Animal anl = new Dog();
        anl.eat();

        anl = new Cat();
        anl.eat();
    }
}

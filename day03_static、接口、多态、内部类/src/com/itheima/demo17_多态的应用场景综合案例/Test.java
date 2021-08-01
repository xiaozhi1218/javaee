package com.itheima.demo17_多态的应用场景综合案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 15:19
 */
class Animal{
    public void eat(){
        System.out.println("吃东西...");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头...");
    }

    // 特有的功能
    public void lookHome(){
        System.out.println("狗在看家...");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
    // 特有的功能
    public void catchMouse(){
        System.out.println("猫抓老鼠...");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        method(d);

        System.out.println("==========================");

        Cat c = new Cat();
        method(c);
    }

    // 形参多态: 如果父类类型作为方法的形参类型,那么就可以接收该父类类型的对象或者其所有子类的对象
    public static void method(Animal anl){
        anl.eat();
        //anl.lookHome();// 编译报错
        // anl.catchMouse();// 编译报错
        if (anl instanceof Dog){
            Dog d = (Dog)anl;// 向下转型 Dog类型
            d.lookHome();
        }

        if (anl instanceof Cat){
            Cat c = (Cat)anl;// 向下转型 Cat类型
            c.catchMouse();
        }

    }
}

package com.itheima.demo14_引用类型转换;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 14:52
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
}

class Person{}
public class Test {
    public static void main(String[] args) {
        /*
            引用类型转换:
                向上转型:子类类型向父类类型向上转换的过程，这个过程是默认\自动的。
                向下转型:父类类型向子类类型向下转换的过程，这个过程是强制\手动的。
                        格式: 子类类型 对象名 = (子类类型)父类类型的变量;
                        注意:
                            1.右边父类类型的变量一定要指向要转型的子类类型的对象
                            2.不管是向上转型还是向下转型,一定满足父子类关系或者实现关系
         */
        // 向上转型:
        Animal anl = new Dog();

        // 向下转型:
        Dog dog = (Dog)anl;

        System.out.println("===================================");
        // 注意:右边父类类型的变量一定要指向要转型的子类类型的对象
        //Animal anl1 = new Animal();
        //Dog d1 = (Dog)anl1;// 运行报错,类型转换异常ClassCastException


        //Animal anl2 = new Cat();
        //Dog d2 = (Dog)anl2;// 运行报错,类型转换异常ClassCastException

        //Animal anl3 = new Person();// 编译报错,因为Animal和Person不是父子关系
        //Animal anl3 = (Animal) new Person();// 编译报错,因为Animal和Person不是父子关系

    }
}

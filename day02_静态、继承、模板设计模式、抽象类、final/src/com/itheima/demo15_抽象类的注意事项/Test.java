package com.itheima.demo15_抽象类的注意事项;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 15:00
 */
abstract class Animal{
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+","+age);
    }

    // 抽象类没有抽象方法
}
class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}

abstract class Person{
    // 抽象方法
    public abstract void eat();
    public abstract void drink();

}

//普通子类继承抽象类后,必须重写抽象类中所有的抽象方法
class Student extends Person{

    @Override
    public void eat() {
        // ...
    }

    @Override
    public void drink() {
        // ...
    }
}

//抽象子类继承抽象类后,可以不用重写抽象类中的抽象方法
 abstract class Teacher extends Person{
    @Override
    public void eat() {
        // ... 可以重写...
    }
}


public class Test {
    public static void main(String[] args) {
        /*
            抽象类的注意事项:
            - 抽象类不能被创建对象，就是用来做“父类”，被子类继承的。
            - 抽象类不能被创建对象，但可以有“构造方法”——为成员变量初始化。
            - 抽象类中可以没有抽象方法,但抽象方法必须定义在抽象类中(抽象类中不一定有抽象方法,但抽象方法一定在抽象类中)
            - 子类继承抽象类后,必须重写抽象类中所有的抽象方法,否则子类必须也是一个抽象类

         */
        // 抽象类不能被创建对象，就是用来做“父类”，被子类继承的。
        //Animal anl = new Animal();

        // 抽象类不能被创建对象，但可以有“构造方法”——为成员变量初始化。
        Dog d = new Dog("旺财", 2);
        d.show();// 旺财,2
    }
}

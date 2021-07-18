package com.itheima.demo21_引用类型使用小结.demo5_抽象类作为成员变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 16:55
 */
abstract class Pet{
    String name;

    public Pet(String name) {
        this.name = name;
    }
}
class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }
}
class Person{
    String name;
    int age;
    Pet pet;

    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }
}
public class Test {
    public static void main(String[] args) {
        // 抽象类作为成员变量:传入抽象类的子类对象
        Pet pet = new Dog("旺财");
        Person p = new Person("张三",18,pet);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.pet.name);

    }
}

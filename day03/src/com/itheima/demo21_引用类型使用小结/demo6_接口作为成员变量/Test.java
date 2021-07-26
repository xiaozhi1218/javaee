package com.itheima.demo21_引用类型使用小结.demo6_接口作为成员变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 16:59
 */
abstract interface Pet{

}
class Dog implements Pet{


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
        // 接口作为成员变量:传入接口的实现类对象
        Pet pet = new Dog();
        Person p = new Person("张三",18,pet);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.pet);

    }
}


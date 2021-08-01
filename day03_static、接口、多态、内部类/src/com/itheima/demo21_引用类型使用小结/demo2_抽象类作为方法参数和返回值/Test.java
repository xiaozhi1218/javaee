package com.itheima.demo21_引用类型使用小结.demo2_抽象类作为方法参数和返回值;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 16:27
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
        // 调用method1,就得传入Animal抽象类的子类对象
        method1(new Dog());

        System.out.println("========================");
        // 调用method1,就得传入Animal抽象类的子类对象
        method1(new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类的方式...");
            }
        });

        System.out.println("========================");
        // 调用method2方法,会返回一个Animal类的子类对象
        //Animal anl = method2();
        Dog d = (Dog)method2();
    }

    // 抽象类作为方法参数类型
    public static void method1(Animal anl){
        anl.eat();
    }

    // 抽象类作为方法返回值类型
    public static Animal method2(){
        return new Dog();
    }
}

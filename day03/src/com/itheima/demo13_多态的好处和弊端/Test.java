package com.itheima.demo13_多态的好处和弊端;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 14:45
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
public class Test {
    public static void main(String[] args) {
        /*
            多态的好处和弊端:
                好处:提高代码的复用性
                弊端:无法访问子类独有的方法或者成员变量,因为多态成员访问的特点是,编译看父类
         */
        // 父类的引用指向子类的对象
        Animal anl = new Dog();
        anl.eat();
        //anl.lookHome();// 编译报错,因为多态成员访问的特点是,编译看父类,而父类中没有子类独有的功能
    }
}

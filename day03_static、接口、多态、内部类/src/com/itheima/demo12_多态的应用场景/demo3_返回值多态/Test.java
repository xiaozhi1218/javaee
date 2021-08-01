package com.itheima.demo12_多态的应用场景.demo3_返回值多态;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 12:31
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
        // 返回值多态:如果返回值类型为父类类型,那么就可以返回该父类类型的对象或者其所有子类对象
        Animal anl = method();
        anl.eat();
    }

    public static Animal method(){
        //return new Animal();
        //return new Dog();
        return new Cat();
    }

    public static Animal method1(){
        if (1==1){
            // 条件1成立
            return new Animal();
        }else if (2==2){
            // 条件2成立
            return new Dog();
        }else{
            // 否则
            return new Cat();
        }
    }
}

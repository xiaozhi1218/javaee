package com.itheima.demo12_多态的应用场景.demo2_形参多态;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 12:26
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
        // 形参多态:参数类型为父类类型,该参数就可以接收该父类类型的对象或者其所有子类对象
        Dog d = new Dog();
        method(d);

        System.out.println("===============================");

        Cat c = new Cat();
        method(c);
    }

    // 需求: 定义一个方法,带有一个参数,该参数可以接收Animal类对象以及Animal类的所有子类对象
    // method(d); ====实参赋值给形参的时候==> Animal anl = new Dog();
    // method(c); ====实参赋值给形参的时候==> Animal anl = new Cat();
    public static void method(Animal anl){
        anl.eat();
    }

   /* public static void method(Dog anl){
        anl.eat();
    }

    public static void method(Cat anl){
        anl.eat();
    }*/

}

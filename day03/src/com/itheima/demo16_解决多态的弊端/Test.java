package com.itheima.demo16_解决多态的弊端;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 15:14
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
            解决多态的弊端:
                弊端:无法访问子类独有的方法或者成员变量,因为多态成员访问的特点是,编译看父类
         */
        // 父类的引用指向子类的对象
        Animal anl = new Dog();// 向上转型
        anl.eat();// 狗吃骨头...

        //anl.lookHome();// 编译报错,因为多态成员访问的特点是,编译看父类,而父类中没有子类独有的功能

        // 先判断,后转型
        if (anl instanceof Dog){
            Dog d = (Dog)anl;// 向下转型
            d.lookHome();// 狗在看家...
        }

        System.out.println("正常结束");
    }
}

package com.itheima.demo9_多态时访问成员的特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 11:51
 */
class Animal{
    int num = 10;
    public void method1(){
        System.out.println("Animal 非静态method1方法");
    }
    public static void method2(){
        System.out.println("Animal 静态method2方法");
    }
}
class Dog extends Animal{
    int num = 20;

    public void method1(){
        System.out.println("Dog 非静态method1方法");
    }

    public static void method2(){
        System.out.println("Dog 静态method2方法");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            多态时访问成员的特点:
                成员变量:编译看父类,运行看父类(编译看左边,运行看左边)
                成员方法:
                    非静态方法:编译看父类,运行看子类(编译看左边,运行看右边)
                    静态方法: 编译看父类,运行看父类(编译看左边,运行看左边)
                结论:除了非静态方法是编译看父类,运行看子类,其余都是看父类
         */
        // 父类的引用指向子类的对象
        Animal anl = new Dog();
        System.out.println(anl.num);// 10

        anl.method1();// Dog 非静态method1方法

        anl.method2();// Animal 静态method2方法

    }
}

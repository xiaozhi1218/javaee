package com.itheima.demo10_多态的形式.demo3_父接口多态;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 12:17
 */
interface A{
    public static final int NUM = 10;
    public abstract void method1();
    public default void method2(){
        System.out.println("A 接口中的默认方法method2");
    }
}
class Imp implements A{


    public void method1() {
        System.out.println("重写method1");
    }

    public  void method2(){
        System.out.println("重写方法method2");
    }
}
public class Test {
    public static void main(String[] args) {
        // 父接口多态
        // 接口的引用指向实现类对象
        A a = new Imp();// 多态
        System.out.println(a.NUM);// 10

        a.method1();
        a.method2();
    }
}

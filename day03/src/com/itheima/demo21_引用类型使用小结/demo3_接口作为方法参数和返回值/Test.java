package com.itheima.demo21_引用类型使用小结.demo3_接口作为方法参数和返回值;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 16:33
 */
interface A{
    void show();
}
class Imp implements A{
    public void show(){
        System.out.println("实现类的方式实现show方法");
    }
}
public class Test {
    public static void main(String[] args) {
        // 接口作为方法参数和返回值
        // 调用method1方法,就得传入A接口的实现类对象
        method1(new Imp());

        System.out.println("===================");

        // 调用method1方法,就得传入A接口的匿名内部类
        method1(new A() {
            @Override
            public void show() {
                System.out.println("匿名内部类的方式实现show方法");
            }
        });

        System.out.println("===================");

        // 调用method2方法,就会返回A接口的实现类对象
        //A a = method2();
        Imp imp = (Imp) method2();


    }

    // 接口作为方法参数
    public static void method1(A a){
        a.show();
    }

    // 接口作为方法返回值
    public static A method2(){
        return new Imp();
    }
}

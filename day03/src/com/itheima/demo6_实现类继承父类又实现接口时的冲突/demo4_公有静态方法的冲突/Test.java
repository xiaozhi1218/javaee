package com.itheima.demo6_实现类继承父类又实现接口时的冲突.demo4_公有静态方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:52
 */
class Fu{
    public static void method(){
        System.out.println("Fu 类中的静态方法method");
    }
}
interface A{
    public static void method(){
        System.out.println("A 接口中的静态方法method");
    }
}
class Zi extends Fu implements A{

}
public class Test {
    public static void main(String[] args) {
        /*
            公有静态方法的冲突:只会访问父类的静态方法
         */
        Zi.method();
    }
}

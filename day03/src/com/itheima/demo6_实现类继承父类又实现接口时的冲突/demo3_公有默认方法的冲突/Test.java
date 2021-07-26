package com.itheima.demo6_实现类继承父类又实现接口时的冲突.demo3_公有默认方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:49
 */
class Fu{
    public void method(){
        System.out.println("Fu 类中的默认方法method");
    }
}
interface A{
    public default void method(){
        System.out.println("A 接口中的默认方法method");
    }
}
class Zi extends Fu implements A{

}
public class Test {
    public static void main(String[] args) {
        /*
            公有默认方法的冲突:优先访问父类的
         */
        Zi zi = new Zi();
        zi.method();// Fu 类中的默认方法method
    }
}

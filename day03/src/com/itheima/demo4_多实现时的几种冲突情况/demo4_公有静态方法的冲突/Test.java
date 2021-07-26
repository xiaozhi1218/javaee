package com.itheima.demo4_多实现时的几种冲突情况.demo4_公有静态方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:07
 */
interface A{
    public static void method(){
        System.out.println("A接口的静态方法method");
    }
}
interface B{
    public static void method(){
        System.out.println("B接口的静态方法method");
    }
}
class Imp implements A,B{

}
public class Test {
    public static void main(String[] args) {
        /*
            公有静态方法的冲突:静态方法是直接属于接口的,不能被继承,所以不存在冲突
         */
    }
}

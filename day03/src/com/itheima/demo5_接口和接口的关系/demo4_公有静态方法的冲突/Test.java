package com.itheima.demo5_接口和接口的关系.demo4_公有静态方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:26
 */
interface A{
    public static void method(){
        System.out.println("A 接口的静态方法method");
    }
}
interface B{
    public static void method(){
        System.out.println("B 接口的静态方法method");
    }
}
interface C extends A,B{

}
public class Test {
    public static void main(String[] args) {
        /*
            公有静态方法的冲突: 不存在冲突,因为静态方法是直接属于接口的,只供本接口直接调用
         */
        //C.method();// 编译报错,因为没有继承
    }
}

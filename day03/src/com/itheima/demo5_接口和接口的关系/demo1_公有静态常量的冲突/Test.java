package com.itheima.demo5_接口和接口的关系.demo1_公有静态常量的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:14
 */
interface A{
    public static final int NUM1 = 10;
}
interface B{
    public static final int NUM1 = 20;
    public static final int NUM2 = 30;
}
interface C extends A,B{

}
public class Test {
    public static void main(String[] args) {
        /*
            公有静态常量的冲突: 子接口无法继承父接口中冲突的常量
         */
        //System.out.println(C.NUM1);// 编译报错,说明无法继承
        System.out.println(C.NUM2);// 30
    }
}

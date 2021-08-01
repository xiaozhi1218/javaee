package com.itheima.demo4_多实现时的几种冲突情况.demo1_公有静态常量的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 9:56
 */
interface A{
    public static final int NUM1 = 10;
}
interface B{
    public static final int NUM1 = 20;
    public static final int NUM2 = 30;
}
class Imp implements A,B{

}
public class Test {
    public static void main(String[] args) {
        /*
            公有静态常量的冲突: 如果多个接口中有相同的常量,那么实现类就无法继承(实现类不继承冲突的常量)
         */
        //System.out.println(Imp.NUM1);// 编译报错,无法访问
        System.out.println(Imp.NUM2);// 30
    }
}

package com.itheima.demo6_实现类继承父类又实现接口时的冲突.demo1_公有静态常量的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:43
 */
class Fu{
    public static final int NUM1 = 10;
    public static final int NUM2 = 100;
}
interface A{
    public static final int NUM1 = 20;

}
class Zi extends Fu implements A{

}
public class Test {
    public static void main(String[] args) {
        /*
            公有静态常量的冲突:子类无法继承有冲突的常量
         */
        //System.out.println(Zi.NUM1);// 编译报错
        System.out.println(Zi.NUM2);

    }
}

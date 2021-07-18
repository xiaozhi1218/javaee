package com.itheima.demo4_多实现时的几种冲突情况.demo3_公有默认方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:03
 */
interface A{
    public default void method(){
        System.out.println("A 接口的默认方法method");
    }
}
interface B{
    public default void method(){
        System.out.println("B 接口的默认方法method");
    }
}
class Imp implements A,B{
    @Override
    public void method() {
        System.out.println("实现类重写的默认方法");
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            公有默认方法的冲突:实现类必须重写一次最终版本
         */
        Imp imp = new Imp();
        imp.method();
    }
}

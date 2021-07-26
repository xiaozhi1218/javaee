package com.itheima.demo4_多实现时的几种冲突情况.demo2_公有抽象方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:01
 */
interface A{
    public abstract void method();
}
interface B{
    public abstract void method();
}
class Imp implements A,B{
    @Override
    public void method() {
        System.out.println("实现类重写");
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            公有抽象方法的冲突:实现类只需要重写一个
         */
    }
}

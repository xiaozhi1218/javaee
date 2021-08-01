package com.itheima.demo6_实现类继承父类又实现接口时的冲突.demo2_公有抽象方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:47
 */
abstract class Fu{
    public abstract void method();
}
interface A{
    public abstract void method();
}
class Zi extends Fu implements A{
    @Override
    public void method() {
        System.out.println("Zi 重写有冲突的抽象方法");
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            公有抽象方法的冲突:子类必须重写一次有冲突的抽象方法
         */
        Zi zi = new Zi();
        zi.method();
    }
}

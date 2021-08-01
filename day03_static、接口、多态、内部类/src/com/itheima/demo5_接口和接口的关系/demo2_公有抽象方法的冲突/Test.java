package com.itheima.demo5_接口和接口的关系.demo2_公有抽象方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:18
 */
interface A{
    public abstract void method();
}
interface B{
    public abstract void method();
}
interface C extends A,B{

}
class Imp implements C{
    @Override
    public void method() {
        System.out.println("实现接口的抽象方法");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            公有抽象方法的冲突:子接口只会继承一个有冲突的抽象方法
         */
        Imp imp = new Imp();
        imp.method();
    }
}

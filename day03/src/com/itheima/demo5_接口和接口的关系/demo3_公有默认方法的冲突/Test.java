package com.itheima.demo5_接口和接口的关系.demo3_公有默认方法的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 10:21
 */
interface A{
    public default void method(){
        System.out.println("A 接口中的默认方法method");
    }
}
interface B{
    public default void method(){
        System.out.println("B 接口中的默认方法method");
    }
}

interface C extends A,B{

    @Override
    public default void method() {
        System.out.println("重写父接口中的method方法");
    }
}

class Imp implements C{

}

public class Test {
    public static void main(String[] args) {
        /*
            公有默认方法的冲突:子接口中必须重写一次有冲突的默认方法
            面试题:
                实现类重写接口中的默认方法,不需要加default
                子接口重写父接口中的默认方法,必须加default
         */
        Imp imp = new Imp();
        imp.method();// 重写父接口中的method方法
    }
}

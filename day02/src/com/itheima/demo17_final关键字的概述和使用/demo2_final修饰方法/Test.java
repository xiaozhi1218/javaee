package com.itheima.demo17_final关键字的概述和使用.demo2_final修饰方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 15:50
 */
class Fu{
    public void method1(){

    }

    public final void method2(){

    }
}
class Zi extends Fu{
    @Override
    public void method1() {
        // ... 重写...
    }

    // 编译报错:被final修饰的方法不可以重写
    /*public  void method2(){

    }*/
}

public class Test {
    public static void main(String[] args) {
        /*
            修饰方法:被final修饰的方法不可以重写
            格式: 修饰符 final 返回值类型 方法名(形参列表){...}
         */
    }
}

package com.itheima.demo9_super的三种用法.demo2_super访问父类的成员方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 11:35
 */
class Fu{
    public void method(){
        System.out.println("Fu method");
    }
}
class Zi extends Fu{
    @Override
    public void method(){
        System.out.println("Zi method");
    }

    public void show(){
        // 访问本类的method方法
        method();
        // 访问父类的method方法
        super.method();
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            super访问父类的成员方法: super.父类方法名(实参);
         */
        Zi zi = new Zi();
        zi.show();
    }
}

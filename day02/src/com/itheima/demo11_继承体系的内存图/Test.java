package com.itheima.demo11_继承体系的内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 12:27
 */
class Fu{
    int num = 10;
    int numFu = 100;
    public void method(){
        System.out.println("Fu method...");
    }
}
class Zi extends Fu{
    int num = 20;
    int numZi = 200;
    public void method(){
        System.out.println("Zi method...");
    }
    public void show(){
        int num = 30;
        System.out.println("局部变量num:"+num);// 30
        System.out.println("本类成员变量num:"+this.num);// 20
        System.out.println("父类成员变量num:"+super.num);// 10
        // 访问本类的method方法
        this.method();// Zi method...
        // 访问父类的method方法
        super.method();// Fu method...
    }
}
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}

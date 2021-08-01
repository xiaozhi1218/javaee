package com.itheima.demo9_super的三种用法.demo1_super访问父类的成员变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 11:35
 */
class Fu{
    int num = 10;
}
class Zi extends Fu{
    int num = 20;
    public void show(){
        int num = 30;
        System.out.println("局部变量num:"+num);// 30
        System.out.println("本类成员变量num:"+this.num);// 20
        System.out.println("父类成员变量num:"+super.num);// 10
    }
}
public class Test {
    public static void main(String[] args) {
        /*
            super访问父类的成员变量: super.父类成员变量名   作用: 区分同名的本类成员变量和父类成员变量
         */
        Zi zi = new Zi();
        zi.show();
    }
}

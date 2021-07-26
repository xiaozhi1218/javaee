package com.itheima.demo10_super的注意事项.demo1_注意事项一;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 12:03
 */
class Ye {
    int num = 10;
    public void method(){
        System.out.println("Ye method");
    }
}

class Fu extends Ye {
    int num = 100;
    public void method(){
        System.out.println("Fu method");
    }
}

class Zi extends Fu {
    int num = 1000;
    public void method(){
        System.out.println(super.num);// 访问父类的成员变量
        super.method();// 访问父类的方法
        System.out.println("Zi method");
    }
}

public class Test {
    public static void main(String[] args) {
        /*
            super访问成员变量和成员方法: 优先去父类中找,如果有就直接使用,如果没有就去爷爷类中找,如果有,就用,依次类推...
            java中所有的类都是直接或者间接继承Object类:
                例如: public class Person /*extends Object* /{}   Person类直接继承Object类
                例如: public class Student extends Person{}       Student类间接继承Object类

         */
        Zi zi = new Zi();
        //System.out.println(zi.num);
        zi.method();
    }
}

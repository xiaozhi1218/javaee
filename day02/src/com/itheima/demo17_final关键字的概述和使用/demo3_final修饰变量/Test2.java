package com.itheima.demo17_final关键字的概述和使用.demo3_final修饰变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 16:01
 */
class FinalVariable1{
    // 成员变量
    final int NUM1 = 10;
}

class FinalVariable2{
    // 成员变量
    final int NUM1;

    // 要求:该类中所有的构造方法都要能给该常量赋值一次
    public FinalVariable2(){
        this.NUM1 = 10;
    }

    public FinalVariable2(int NUM1){
        this.NUM1 = NUM1;
    }
}

public class Test2 {
    public static void main(String[] args) {
        /*
            final修饰成员变量:
                修饰变量:被final修饰的变量,只能赋值一次(常量)
         */
        FinalVariable1 fv1 = new FinalVariable1();
        System.out.println(fv1.NUM1);// 10;
        // 编译报错,因为被final修饰的变量,只能赋值一次(常量)
        //fv1.NUM1 = 20;
    }
}

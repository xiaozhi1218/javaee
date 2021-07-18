package com.itheima.demo10_多态的形式.demo2_抽象父类多态;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 12:16
 */
abstract class Fu{

}

class Zi extends Fu{

}
public class Test {
    public static void main(String[] args) {
        // 抽象父类多态
        // 父类的引用指向子类对象
        Fu f = new Zi();// 多态
    }
}

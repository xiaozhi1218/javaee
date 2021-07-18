package com.itheima.demo10_多态的形式.demo1_普通父类多态;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/8 12:15
 */
class Fu{

}
class Zi extends Fu{

}
public class Test {
    public static void main(String[] args) {
        // 父类的引用指向子类的对象
        Fu f = new Zi();// 多态
    }
}

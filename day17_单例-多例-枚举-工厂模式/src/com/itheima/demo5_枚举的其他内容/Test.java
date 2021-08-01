package com.itheima.demo5_枚举的其他内容;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 10:00
 */
public class Test {
    public static void main(String[] args) {
        // 枚举的本质是一个使用了多例设计模式的类，所以枚举中还可以有成员变量，成员方法等。
        Sex s1 = Sex.boy;
        s1.show();
        System.out.println(s1.age);
    }
}

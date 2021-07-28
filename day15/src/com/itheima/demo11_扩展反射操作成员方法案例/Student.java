package com.itheima.demo11_扩展反射操作成员方法案例;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 10:57
 */
public class Student {

    public void show1() {
        System.out.println("show1 方法...");
    }

    public void show2(int num) {
        System.out.println("show2 方法...num: " + num);
    }

    private void show3() {
        System.out.println("show3 方法...");
    }

    private void show4(String str) {
        System.out.println("show1 方法...str: " + str);
    }

    public int show5(int num) {
        System.out.println("show5 方法...num: " + num);
        return 100;
    }

}

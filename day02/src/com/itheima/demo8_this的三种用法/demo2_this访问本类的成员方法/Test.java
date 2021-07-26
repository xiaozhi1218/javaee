package com.itheima.demo8_this的三种用法.demo2_this访问本类的成员方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 11:17
 */
class Student{

    public void method(){
        System.out.println("Student method");
    }

    public void show(){
        System.out.println("Student show");
        // 调用method方法
        this.method();
        method();
    }
}
public class Test {
    public static void main(String[] args) {
        // this访问本类的成员方法: this.成员方法名(实参);   基本不用
        // 创建Student对象
        Student stu = new Student();
        // 调用show方法
        stu.show();
    }
}

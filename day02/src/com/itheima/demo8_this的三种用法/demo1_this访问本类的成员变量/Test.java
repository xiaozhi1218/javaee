package com.itheima.demo8_this的三种用法.demo1_this访问本类的成员变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 11:17
 */
class Student{
    int age;
    String name;

    public void show(){
        //System.out.println(this.name+","+this.age);
        System.out.println(name+","+age);
    }

    public void method(String name){
        // this访问成员变量: 主要用来区分同名的成员变量和局部变量   会用
        System.out.println("成员变量name的值:"+this.name);
        System.out.println("局部变量name的值:"+name);
    }
}
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.method("热巴");
    }
}

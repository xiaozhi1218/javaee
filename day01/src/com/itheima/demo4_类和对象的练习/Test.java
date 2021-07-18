package com.itheima.demo4_类和对象的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 11:22
 */
public class Test {
    public static void main(String[] args) {
        // 需求:首先定义一个学生类，然后定义一个学生测试类，在学生测试类中通过对象完成成员变量和成员方法的使用
        // 创建学生对象
        Student stu = new Student();

        // 访问成员变量
        stu.name = "冰冰";
        stu.age = 18;
        System.out.println(stu.name+","+stu.age);// 冰冰,18

        // 访问成员方法
        stu.study();
        stu.doHomeWork();

    }
}

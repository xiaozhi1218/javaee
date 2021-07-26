package com.itheima.demo8_多个变量指向相同对象内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 14:30
 */
public class Test {
    public static void main(String[] args) {
        // 创建Student对象
        Student stu1 = new Student();

        // 访问学生对象的成员变量
        stu1.name = "冰冰";
        stu1.age = 18;
        System.out.println(stu1.name + "," + stu1.age);// 冰冰,18

        // 访问学生对象的成员方法
        stu1.study();

        System.out.println("============================");
        // 定义一个Student类型的变量,并把之前创建的学生对象赋值给该变量
        Student stu2 = stu1;

        // 再使用新的变量访问成员变量
        System.out.println(stu2.name + "," + stu2.age);// 冰冰,18
        // 再使用新的变量访问成员方法
        stu2.study();

    }
}

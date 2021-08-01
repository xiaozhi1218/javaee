package com.itheima.demo1_复习面向对象;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/6 8:42
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象
        Student stu1 = new Student();
        Student stu2 = new Student("热巴",18);

        // 使用对象访问成员方法
        stu1.show();// null,0
        stu2.show();// 热巴,18

    }
}

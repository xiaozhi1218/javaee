package com.itheima.demo21_ArrayList存储学生对象并遍历;

import java.util.ArrayList;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:39
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        // 1.创建ArrayList集合,限制集合中元素的类型为Student
        ArrayList<Student> list = new ArrayList<>();

        // 2.创建3个学生对象
        Student stu1 = new Student("张三", 18);
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 20);

        // 3.往集合中添加这3个学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 4.循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 5.在循环中,获取集合中的元素,打印输出
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}

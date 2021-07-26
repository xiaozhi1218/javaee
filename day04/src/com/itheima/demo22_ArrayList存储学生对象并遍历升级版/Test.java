package com.itheima.demo22_ArrayList存储学生对象并遍历升级版;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/9 16:48
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求
            - 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
            ( 学生的姓名和年龄来自于键盘录入)
         */
        // 1.创建ArrayList集合,限制集合中元素的类型为Student
        ArrayList<Student> list = new ArrayList<>();

        // 2.键盘录入姓名和年龄, 创建3个学生对象,并添加到集合中
        Scanner sc = new Scanner(System.in);

        // 添加学生
        addStudent(list, sc);
        addStudent(list, sc);
        addStudent(list, sc);


        // 3.循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 5.在循环中,获取集合中的元素,打印输出
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }

    }

    // 定义一个方法,实现键盘录入学生姓名和年龄,创建学生对象,并添加到集合中
    public static void addStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        // 创建学生对象
        Student stu = new Student(name, age);
        // 往集合中添加这个学生对象
        list.add(stu);
    }

    private static void method02() {
        // 1.创建ArrayList集合,限制集合中元素的类型为Student
        ArrayList<Student> list = new ArrayList<>();

        // 2.键盘录入姓名和年龄, 创建3个学生对象,并添加到集合中
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入姓名:");
            String name = sc.next();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            // 创建学生对象
            Student stu = new Student(name, age);
            // 往集合中添加这个学生对象
            list.add(stu);
        }


        // 3.循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 5.在循环中,获取集合中的元素,打印输出
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }

    // 抽取代码到方法中: 选中代码-->ctrl+alt+m-->输入方法名,回车即可
    private static void method01() {
        // 1.创建ArrayList集合,限制集合中元素的类型为Student
        ArrayList<Student> list = new ArrayList<>();

        // 2.键盘录入姓名和年龄, 创建3个学生对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名:");
        String name1 = sc.next();
        System.out.println("请输入年龄:");
        int age1 = sc.nextInt();

        Student stu1 = new Student(name1, age1);

        System.out.println("请输入姓名:");
        String name2 = sc.next();
        System.out.println("请输入年龄:");
        int age2 = sc.nextInt();
        Student stu2 = new Student(name2, age2);

        System.out.println("请输入姓名:");
        String name3 = sc.next();
        System.out.println("请输入年龄:");
        int age3 = sc.nextInt();
        Student stu3 = new Student(name3, age3);

        // 3.往集合中添加这3个学生对象
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 4.循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 5.在循环中,获取集合中的元素,打印输出
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}

package com.itheima.demo7_lombok的使用;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/27 10:55
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("张三",18,"男");
        Student stu3 = new Student("张三",18,"男");

        stu1.setName("李四");
        stu1.setAge(18);
        stu1.setSex("男");
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getSex());

        System.out.println(stu1);
        System.out.println(stu2);

        System.out.println(stu2.equals(stu3));
        System.out.println(stu2.hashCode());
        System.out.println(stu3.hashCode());

    }
}

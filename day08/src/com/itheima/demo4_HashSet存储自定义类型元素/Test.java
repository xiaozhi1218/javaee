package com.itheima.demo4_HashSet存储自定义类型元素;

import java.util.HashSet;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/15 11:20
 */
public class Test {
    public static void main(String[] args) {
        /*
            HashSet存储自定义类型元素:重写hashCode和equals方法
                开发中,往往认为2个对象的所有属性值相同,就是2个相同的对象

         */
        // 创建HashSet集合,限制集合元素的类型为Student
        HashSet<Student> set = new HashSet<>();

        // 往集合中添加学生对象
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",17);
        Student stu4 = new Student("赵六",20);
        Student stu5 = new Student("张三",18);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);

        System.out.println(stu1.hashCode());
        System.out.println(stu5.hashCode());

        // 遍历输出集合中的元素
        for (Student stu : set) {
            System.out.println(stu);
        }
    }
}

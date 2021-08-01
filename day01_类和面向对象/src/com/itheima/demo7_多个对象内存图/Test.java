package com.itheima.demo7_多个对象内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 11:54
 */
public class Test {
    public static void main(String[] args) {
        // 创建Student对象  shift+f6+fn 批量修改名称
        Student stu1 = new Student();
        System.out.println(stu1);// 十六进制数地址值

        // 访问成员变量
        stu1.name = "冰冰";
        stu1.age = 18;
        System.out.println(stu1.name+","+stu1.age);// 冰冰,18

        // 访问成员方法
        stu1.study();
        stu1.doHomeWork();

        System.out.println("==========================");

        Student stu2 = new Student();

        System.out.println(stu2.name+","+stu2.age);// null,0
        stu2.study();

    }
}

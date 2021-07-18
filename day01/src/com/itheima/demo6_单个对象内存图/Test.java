package com.itheima.demo6_单个对象内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 11:54
 */
public class Test {
    public static void main(String[] args) {
        // 创建Student对象
        Student stu = new Student();
        System.out.println(stu);// 十六进制数地址值

        // 访问成员变量
        stu.name = "冰冰";
        stu.age = 18;
        System.out.println(stu.name+","+stu.age);

        // 访问成员方法
        stu.study();
        stu.doHomeWork();
    }
}

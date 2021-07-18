package com.itheima.demo5_成员变量默认值;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/5 11:47
 */
public class Test {
    public static void main(String[] args) {
        // 变量的要使用一定要赋值
        //int num;// 局部变量:定义在方法中的变量
        //System.out.println(num);// 编译报错,局部变量没有默认值

        /*
            成员变量的默认值:
                整数类型: 默认值是0
                小数类型: 默认值是0.0
                布尔类型: 默认值是false
                字符类型: 默认值是不可见字符 '\u0000'
                引用类型: 默认值是null
         */
        // 创建Student对象
        Student stu = new Student();
        // 访问成员变量
        System.out.println(stu.name);// null
        System.out.println(stu.age);// 0
        System.out.println(stu.score);// 0.0
        System.out.println("="+stu.c+"=");
    }
}

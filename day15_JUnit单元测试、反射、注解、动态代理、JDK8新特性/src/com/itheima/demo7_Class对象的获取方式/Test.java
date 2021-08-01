package com.itheima.demo7_Class对象的获取方式;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 10:11
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
             方式1: 通过类名.class获得
             方式2：通过对象名.getClass()方法获得
             方式3：通过Class类的静态方法获得： static Class forName("类全名")
             每一个类的Class对象都只有一个。
         */
        // 通过类名.class获得
        Class<Student> c1 = Student.class;

        // 通过对象名.getClass()方法获得
        Student stu = new Student();
        Class<? extends Student> c2 = stu.getClass();

        // 通过Class类的静态方法获得
        Class<?> c3 = Class.forName("com.itheima.demo7_Class对象的获取方式.Student");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1 == c2);// true
        System.out.println(c2 == c3);// true

    }
}

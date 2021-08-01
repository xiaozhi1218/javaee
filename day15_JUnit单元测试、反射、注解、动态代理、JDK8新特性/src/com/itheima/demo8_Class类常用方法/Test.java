package com.itheima.demo8_Class类常用方法;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 10:16
 */
class Student{

}
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            Class类常用方法:
                String getSimpleName(); 获得类名字符串：类名
                String getName();  获得类全名：包名+类名
                T newInstance() ;  创建Class对象关联类的对象
         */
        // 获取Student类的Class对象
        Class<Student> c = Student.class;

        // 获得类名字符串
        String className = c.getSimpleName();
        System.out.println(className);// Student

        // 获得类全名
        String name = c.getName();
        System.out.println(name); // com.itheima.demo8_Class类常用方法.Student

        // 创建Student类的对象
        Student stu = c.newInstance();// 其实就相当于调用了Student类的空参构造方法
        System.out.println(stu);
    }
}

package com.itheima.demo5_类加载时机;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 9:25
 */
public class Test {

    public static void main(String[] args) throws Exception{
        // 1. 创建类的实例。
        //new Student();

        // 2. 访问类的静态变量，或者为静态变量赋值。
        //System.out.println(Student.country);

        // 3. 类的静态方法。
        //Student.method();

        // 4. 使用反射方式来强制创建某个类或接口对应的java.lang.Class对象。
        //Class<?> c = Class.forName("com.itheima.demo5_类加载时机.Student");

        // 5. 初始化某个类的子类。
        //new SmallStudent();

        // 6. 直接使用java.exe命令来运行某个主类。

    }

}

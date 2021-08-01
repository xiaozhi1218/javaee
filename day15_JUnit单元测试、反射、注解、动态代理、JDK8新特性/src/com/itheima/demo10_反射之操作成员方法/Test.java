package com.itheima.demo10_反射之操作成员方法;

import java.lang.reflect.Method;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 10:56
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            反射之操作成员方法:
                Method类概述
                      每一个成员方法都是一个Method类的对象。
                反射之操作成员方法的目的
                      操作Method对象来调用成员方法
                使用:
                    1.如何通过反射获取类中的成员方法:Class类的方法
                        * Method getMethod(String name,Class... args);
                        * 根据方法名和参数类型获得对应的构造方法对象，只能获得public的

                        * Method getDeclaredMethod(String name,Class...args);
                        * 根据方法名和参数类型获得对应的构造方法对象，包括public、protected、(默认)、private的

                        * Method[] getMethods();
                        * 获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的

                        * Method[] getDeclaredMethods();
                        * 获得类中的所有成员方法对象，返回数组,只获得本类的，包括public、protected、(默认)、private的

                    2.如何通过反射执行获取类中成员方法: Method类的方法
                        *  Object invoke(Object obj, Object... args)
                            * 参数1:调用方法的对象
                            * 参数2：调用方法时传递的实际参数
                            * 返回值: 执行的方法的返回值

                        *  void setAccessible(true)
                            设置"暴力访问"——是否取消权限检查，true取消权限检查，false表示不取消

         */
        // 获取Student类的Class对象
        Class<Student> c = Student.class;

        // 获取单个方法
        // 通过反射获取show1方法
        Method m1 = c.getDeclaredMethod("show1");
        System.out.println(m1);

        // 通过反射获取show2方法
        Method m2 = c.getDeclaredMethod("show2", int.class);
        System.out.println(m2);

        // 通过反射获取show3方法
        Method m3 = c.getDeclaredMethod("show3");
        System.out.println(m3);

        // 通过反射获取show4方法
        Method m4 = c.getDeclaredMethod("show4", String.class);
        System.out.println(m4);

        // 通过反射获取show5方法
        Method m5 = c.getDeclaredMethod("show5", int.class);
        System.out.println(m5);

        System.out.println("==============================");
        // 获取所有方法
        Method[] arr = c.getDeclaredMethods();
        for (Method m : arr) {
            System.out.println(m);
        }

        System.out.println("==============================");
        // 通过反射创建Student对象
        Student stu = c.newInstance();

        // 通过反射执行m1表示的show1方法
        m1.invoke(stu);

        // 通过反射执行m2表示的show2方法
        m2.invoke(stu,10);

        // 取消m3表示的方法的权限检查
        m3.setAccessible(true);

        // 通过反射执行m3表示的show3方法
        m3.invoke(stu);

        // 取消m4表示的方法的权限检查
        m4.setAccessible(true);

        // 通过反射执行m4表示的show4方法
        m4.invoke(stu,"itheima");

        // 通过反射执行m5表示的show5方法
        Object res = m5.invoke(stu, 20);// int res = stu.show5(20);
        System.out.println(res);// 100

    }
}

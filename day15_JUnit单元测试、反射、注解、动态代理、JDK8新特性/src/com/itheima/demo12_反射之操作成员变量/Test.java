package com.itheima.demo12_反射之操作成员变量;

import java.lang.reflect.Field;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 11:29
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            Field类概述
                * 每一个成员变量都是一个Field类的对象。

            反射之操作成员变量的目的
                * 通过Field对象给对应的成员变量赋值和取值

            使用:
                1.如何通过反射获取类的成员变量: Class类的方法
                    * Field getField(String name);
                        *  根据成员变量名获得对应Field对象，只能获得public修饰
                    * Field getDeclaredField(String name);
                        *  根据成员变量名获得对应Field对象，包括public、protected、(默认)、private的

                    * Field[] getFields();
                        * 获得所有的成员变量对应的Field对象，只能获得public的
                    * Field[] getDeclaredFields();
                        * 获得所有的成员变量对应的Field对象，包括public、protected、(默认)、private的

                2.如何通过反射访问获取的类的成员变量: Field类的方法
                    Class getType(); 获取属性的类型，返回Class对象。
                    void  set(Object obj, Object value)
                    Object get(Object obj)
                    void setAccessible(true);暴力反射，设置为可以直接访问私有类型的属性。

         */
        // 获取Student类的Class对象
        Class<Student> c = Student.class;
        Student stu = c.newInstance();

        // 获取单个的成员变量
        // 通过反射获取name成员变量
        Field f1 = c.getDeclaredField("name");
        System.out.println(f1);

        // 通过反射获取age成员变量
        Field f2 = c.getDeclaredField("age");
        System.out.println(f2);

        System.out.println("===============================");
        // 获取所有成员变量
        Field[] arr = c.getDeclaredFields();
        for (Field field : arr) {
            System.out.println(field);
        }

        System.out.println("===============================");
        // 获取f1表示的name属性的类型
        System.out.println(f1.getType());
        // 获取f2表示的age属性的类型
        System.out.println(f2.getType());

        System.out.println("===============================");
        // 通过反射给f1表示的name属性赋值
        f1.set(stu,"张三" );// 相当于stu.name="张三";

        // 取消f2表示的属性的权限检查
        f2.setAccessible(true);

        // 通过反射给f2表示的age属性赋值
        f2.set(stu,18 );

        System.out.println("===============================");
        // 通过反射获取f1表示的name属性的值
        System.out.println(f1.get(stu));// 张三

        // 通过反射获取f2表示的age属性的值
        System.out.println(f2.get(stu));// 18


    }
}

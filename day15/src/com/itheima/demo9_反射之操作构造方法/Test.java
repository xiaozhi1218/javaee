package com.itheima.demo9_反射之操作构造方法;

import java.lang.reflect.Constructor;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 10:20
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            Constructor类概述
               类中的每一个构造方法都是一个Constructor类的对象

            反射之操作构造方法的目的
                获得Constructor对象来创建类的对象。

            使用:
                1.如何通过反射获取一个类中的构造方法:Class类的方法
                     1. Constructor getConstructor(Class... parameterTypes)
                        * 根据参数类型获得对应的Constructor对象。
                        * 只能获得public修饰的构造方法
                     2. Constructor getDeclaredConstructor(Class... parameterTypes)
                            * 根据参数类型获得对应的Constructor对象
                            * 可以是public、protected、(默认)、private修饰符的构造方法。

                     3. Constructor[] getConstructors()
                            获得类中的所有构造方法对象，只能获得public的
                     4. Constructor[] getDeclaredConstructors()
                            获得类中的所有构造方法对象
                            可以是public、protected、(默认)、private修饰符的构造方法。

                2.如何通过反射执行获取的构造方法:Constructor的方法
                    1. T newInstance(Object... initargs)
                        根据指定的参数创建对象
                    2. void setAccessible(true)
                       设置"暴力反射"——是否取消权限检查，true取消权限检查，false表示不取消

         */
        // 获取Student类的Class对象
        Class<Student> c = Student.class;

        // 获取单个构造方法
        // 获取无参数的构造方法
        Constructor<Student> con1 = c.getDeclaredConstructor();
        System.out.println(con1);

        // 获取满参构造方法
        Constructor<Student> con2 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(con2);

        // 获取私有构造方法
        Constructor<Student> con3 = c.getDeclaredConstructor(int.class);
        System.out.println(con3);

        System.out.println("================================");
        // 获取所有构造方法
        Constructor<?>[] arr1 = c.getDeclaredConstructors();
        for (Constructor<?> con : arr1) {
            System.out.println(con);
        }

        System.out.println("================================");
        // 通过执行con1表示的构造方法来创建Student对象
        Student stu1 = con1.newInstance();
        System.out.println(stu1);// Student{name='null', age=0}

        // 通过执行con2表示的构造方法来创建Student对象
        Student stu2 = con2.newInstance("张三", 18);
        System.out.println(stu2);// Student{name='张三', age=18}

        // 取消con3表示的构造方法的权限检查
        con3.setAccessible(true);

        // 通过执行con3表示的构造方法来创建Student对象
        Student stu3 = con3.newInstance(19);
        System.out.println(stu3);// Student{name='null', age=19}

    }

}

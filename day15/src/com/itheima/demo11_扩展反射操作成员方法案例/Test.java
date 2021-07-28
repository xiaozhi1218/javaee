package com.itheima.demo11_扩展反射操作成员方法案例;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 11:21
 */
public class Test {
    public static void main(String[] args)throws Exception {
        /*
            Method类:
            public String getName() 获取方法名
         */
        // 需求: 访问Student类中的成员
        // 1.获取该类的字节码对象
        Class<Student> c = Student.class;

        // 2.获取所有构造方法
        Constructor<?>[] cons = c.getDeclaredConstructors();

        // 3.遍历所有的构造方法
        Student stu = null;
        for (Constructor<?> con : cons) {
            stu = (Student) con.newInstance();
        }

        // 4.获取所有的成员方法
        Method[] methods = c.getDeclaredMethods();

        // 5.遍历所有的成员方法
        for (Method m : methods) {
            if (m.getName().equals("show1")){
                m.invoke(stu);
            }

            if (m.getName().equals("show2")){
                m.invoke(stu,10);
            }

            if (m.getName().equals("show5")){
                Object res = m.invoke(stu, 20);
                System.out.println(res);
            }
            // ...
        }
    }
}

package com.itheima.demo6_类加载器;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/24 9:31
 */
public class Test {
    public static void main(String[] args) {
        /*
            类加载器:
                概述:是负责将磁盘上的某个class文件读取到内存并生成Class的对象。
                如何获取类加载器:
                    类的字节码对象.getClassLoader()
         */
        // 获取Test类的类加载器
        ClassLoader c1 = Test.class.getClassLoader();
        System.out.println(c1);// AppClassLoader

        // 获取Student类的类加载器
        ClassLoader c2 = Student.class.getClassLoader();
        System.out.println(c2);// AppClassLoader

        // 获取String类的类加载器
        ClassLoader c3 = String.class.getClassLoader();
        System.out.println(c3);// null
        //API中说明：一些实现可能使用null来表示引导类加载器。 如果此类由引导类加载器加载，则此方法将在此类实现中返回null

        System.out.println("====================委派机制=================");
        System.out.println(c1.getParent());// PlatformClassLoader
        System.out.println(c1.getParent().getParent());// null

    }
}

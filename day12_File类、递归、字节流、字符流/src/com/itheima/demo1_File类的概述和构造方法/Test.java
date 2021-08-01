package com.itheima.demo1_File类的概述和构造方法;

import java.io.File;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 9:06
 */
public class Test {
    public static void main(String[] args) {
        /*
            File类的概述:
                概述: java.io.File类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
            File类的构造方法:
                - public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
                - public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
                - public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
            注意:
                1. 一个File对象代表硬盘中的一个文件或者目录。
                2. 无论该路径下是否存在文件或者目录，都不影响File对象的创建。

         */
        // 创建File对象表示‪H:\aaa\hb.jpg文件路径
        File f1 = new File("H:\\aaa\\hb.jpg");
        File f2 = new File("H:\\aaa","hb.jpg");
        File parent = new File("H:\\aaa");
        File f3 = new File(parent, "hb.jpg");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println("=========================================");
        // 创建File对象表示‪H:\aaa\2020文件夹路径
        File f4 = new File("H:\\aaa\\2020");
        File f5 = new File("H:\\aaa","2020");
        File f6 = new File(parent,"2020");
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);

        System.out.println("=========================================");
        // 路径不存在的
        File f7 = new File("H:\\aaa\\b.txt");// b.txt文件是不存在的
        File f8 = new File("H:\\aaa\\2018");// 2018文件夹是不存在的
        System.out.println(f7);
        System.out.println(f8);
    }
}

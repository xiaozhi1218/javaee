package com.itheima.demo4_判断功能的方法;

import java.io.File;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 9:58
 */
public class Test {
    public static void main(String[] args) {
        /*
            判断功能的方法:
                - public boolean exists() ：此File表示的文件或目录是否实际存在。
                - public boolean isDirectory() ：此File表示的是否为目录。
                - public boolean isFile() ：此File表示的是否为文件。
         */
        // 路径真实存在
        // 创建File对象,表示day12\aaa\hb.jpg文件的路径
        File f1 = new File("day12\\aaa\\hb.jpg");
        System.out.println("f1表示的文件是否真实存在:"+f1.exists());// true
        System.out.println("f1表示的文件是否是文件夹:"+f1.isDirectory());// false
        System.out.println("f1表示的文件是否是文件:"+f1.isFile());// true

        System.out.println("=====================================================");

        // 路径真实存在
        // 创建File对象,表示day12\aaa\bbb文件夹的路径
        File f2 = new File("day12\\aaa\\bbb");
        System.out.println("f2表示的文件夹是否真实存在:"+f2.exists());// true
        System.out.println("f2表示的文件夹是否是文件夹:"+f2.isDirectory());// true
        System.out.println("f2表示的文件夹是否是文件:"+f2.isFile());// false

        System.out.println("=====================================================");
        // 注意:路径不真实存在,结果都是false
        File f3 = new File("day12\\aaa\\b.txt");
        System.out.println("f3表示的文件是否真实存在:"+f3.exists());// false
        System.out.println("f3表示的文件是否是文件夹:"+f3.isDirectory());// false
        System.out.println("f3表示的文件是否是文件:"+f3.isFile());// false
        File f4 = new File("day12\\aaa\\ccc");
        System.out.println("f4表示的文件夹是否真实存在:"+f4.exists());// false
        System.out.println("f4表示的文件夹是否是文件夹:"+f4.isDirectory());// false
        System.out.println("f4表示的文件夹是否是文件:"+f4.isFile());// false
    }
}

package com.itheima.demo3_获取功能的方法;

import java.io.File;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 9:49
 */
public class Test {
    public static void main(String[] args) {
        /*
            获取功能的方法:
                - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
                - public String getPath() ：将此File转换为路径名字符串。获取构造路径(构造方法中传入的路径)
                - public String getName()  ：返回由此File表示的文件或目录的名称。
                - public long length()  ：返回由此File表示的文件的字节大小。 不能获取目录的字节大小。
         */
        // 创建File对象,表示day12\aaa\hb.jpg文件的路径
        File f1 = new File("day12\\aaa\\hb.jpg");
        System.out.println("f1的绝对路径:"+f1.getAbsolutePath());// G:\szitheima104\day12\aaa\hb.jpg
        System.out.println("f1的构造路径:"+f1.getPath());// day12\aaa\hb.jpg
        System.out.println("f1的文件名:"+f1.getName());// hb.jpg
        System.out.println("f1的字节大小:"+f1.length());// 24,666 字节

        // 创建File对象,表示day12\aaa\bbb文件夹的路径
        File f2 = new File("day12\\aaa\\bbb");
        System.out.println("f2的绝对路径:"+f2.getAbsolutePath());// G:\szitheima104\day12\aaa\bbb
        System.out.println("f2的构造路径:"+f2.getPath());// day12\aaa\bbb
        System.out.println("f2的文件名:"+f2.getName());// bbb
        System.out.println("f2的字节大小:"+f2.length());// 0
    }
}

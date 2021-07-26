package com.itheima.demo5_创建删除功能的方法;

import java.io.File;
import java.io.IOException;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 10:06
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            创建删除功能的方法:
                - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
                - public boolean mkdir() ：创建由此File表示的目录。
                - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
                - public boolean delete() ：删除由此File表示的文件或目录。只能删除文件或者空文件夹,不能删除非空文件夹
         */
        // 创建文件:
        File f1 = new File("day12\\aaa\\a.txt");
        System.out.println("是否创建成功:"+f1.createNewFile());

        File f2 = new File("day12\\aaa\\ddd");// 创建ddd文件
        System.out.println("是否创建成功:"+f2.createNewFile());

        System.out.println("=======================================");

        // 创建文件夹
        File f3 = new File("day12\\aaa\\eee");
        System.out.println("是否创建成功:"+f3.mkdir());

        File f4 = new File("day12\\aaa\\fff.txt");// 创建fff.txt文件夹
        System.out.println("是否创建成功:"+f4.mkdir());

        File f5 = new File("day12\\aaa\\aaa\\bbb\\ccc\\ddd");
        System.out.println("是否创建成功:"+f5.mkdir());// 一定是false

        System.out.println("=======================================");
        System.out.println("是否创建成功:"+f5.mkdirs());

        System.out.println("=======================================");

        // 删除文件
        File f6 = new File("day12\\aaa\\a.txt");
        System.out.println("是否删除成功:"+f6.delete());// true

        // 删除空文件夹
        File f7 = new File("day12\\aaa\\eee");
        System.out.println("是否删除成功:"+f7.delete());// true

        // 删除非空文件夹
        File f8 = new File("day12\\aaa\\bbb");
        System.out.println("是否删除成功:"+f8.delete());// false

    }
}

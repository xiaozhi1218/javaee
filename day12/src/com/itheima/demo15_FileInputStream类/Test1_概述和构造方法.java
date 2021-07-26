package com.itheima.demo15_FileInputStream类;

import java.io.File;
import java.io.FileInputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 15:42
 */
public class Test1_概述和构造方法 {
    public static void main(String[] args) throws Exception{
        /*
            FileInputStream类:
                概述:java.io.FileInputStream类是InputStream类的子类, 表示字节输入流,用于读取字节数据
                构造方法:
                    - FileInputStream(File file)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的文件对象 file命名。
                    - FileInputStream(String name)： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
                注意:
                    1.当你创建一个输入流对象时，必须传入一个文件路径。
                    2.该路径下，如果没有该文件,会抛出FileNotFoundException
         */
        // 文件存在:
        // 创建字节输入流对象,关联数据源文件路径
        FileInputStream fis1 = new FileInputStream("day12\\ccc\\a.txt");
        FileInputStream fis2 = new FileInputStream(new File("day12\\ccc\\a.txt"));

        // 文件不存在:
        FileInputStream fis3 = new FileInputStream("day12\\ccc\\b.txt");// 运行报文件找不到异常FileNotFoundException

    }
}

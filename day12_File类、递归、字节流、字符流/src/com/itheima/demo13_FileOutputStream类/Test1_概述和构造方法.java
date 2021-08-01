package com.itheima.demo13_FileOutputStream类;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 14:46
 */
public class Test1_概述和构造方法 {
    public static void main(String[] args) throws Exception{
        /*
            FileOutputStream类:
                概述:java.io.FileOutputStream类是OutputStream类的子类,表示字节输出流,用来写出字节数据
                构造方法:
                    - public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
                    - public FileOutputStream(String name)： 创建文件输出流以指定的名称写入文件。
                注意:
                    1.当你创建一个字节输出流对象时，必须传入一个文件路径。
                    2.该路径下，如果没有这个文件，会创建该文件(空的)。
                    3.如果有这个文件，会清空这个文件的数据。
         */
        // 1.创建字节输出流对象,关联day12\bbb\a.txt文件
        FileOutputStream fos1 = new FileOutputStream("day12\\bbb\\a.txt");

        // 2.创建字节输出流对象,关联day12\bbb\b.txt文件
        FileOutputStream fos2 = new FileOutputStream("day12\\bbb\\b.txt");

        // 3.创建字节输出流对象,关联day12\bbb\c.txt文件
        FileOutputStream fos3 = new FileOutputStream(new File("day12\\bbb\\c.txt"));

    }
}

package com.itheima.demo13_FileOutputStream类;

import java.io.FileOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 15:09
 */
public class Test5_数据追加续写 {
    public static void main(String[] args) throws Exception{
        /*
            数据追加续写:
                - public FileOutputStream(File file, boolean append)： 创建文件输出流以写入由指定的 File对象表示的文件。
                - public FileOutputStream(String name, boolean append)： 创建文件输出流以指定的名称写入文件。
                参数append: 如果是true,就表示追加续写(不清空),如果是false,就清空原文件中的数据
                注意:
                    1.当你创建一个字节输出流对象时，必须传入一个文件路径。
                    2.该路径下，如果没有这个文件，会创建该文件(空的)。
                    3.如果有这个文件，并且第二个参数为true,就不清空,如果第二个参数为false,就清空
         */
        // 创建字节输出流对象,关联目的地文件路径(day12\bbb\a.txt)
        FileOutputStream fos = new FileOutputStream("day12\\bbb\\a.txt",true);
        // 写出数据
        fos.write(97);
        // 关闭流,释放资源
        fos.close();

    }
}

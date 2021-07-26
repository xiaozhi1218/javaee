package com.itheima.demo21_FileWriter类;

import java.io.FileWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:18
 */
public class Test1_概述和构造方法 {
    public static void main(String[] args) throws Exception{
        /*
            概述:java.io.FileWriter是Writer的子类,表示字符输出流,可以用来写出字符数据
            构造方法:
                - FileWriter(File file)： 创建一个新的 FileWriter，给定要读取的File对象。
                - FileWriter(String fileName)： 创建一个新的 FileWriter，给定要读取的文件的名称。
                - FileWriter(File file,boolean append)： 创建一个新的 FileWriter，给定要读取的File对象。
                - FileWriter(String fileName,boolean append)： 创建一个新的 FileWriter，给定要读取的文件的名称。
            注意:
                    1.当你创建一个字符输出流对象时，必须传入一个文件路径。
                    2.前面2个构造方法,传入的路径，如果没有这个文件，会创建该文件(空的),如果有这个文件,就会清空。
                    3.后面2个构造方法,传入的路径, 如果没有这个文件，会创建该文件(空的),如果有这个文件，并且第二个参数为true,就不清空,如果第二个参数为false,就清空
         */
        // 文件存在
        FileWriter fw1 = new FileWriter("day12\\ddd\\b.txt",true);

        // 文件不存在
        FileWriter fw2 = new FileWriter("day12\\ddd\\c.txt");

    }
}

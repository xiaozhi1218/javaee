package com.itheima.demo19_FileReader类;

import java.io.File;
import java.io.FileReader;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:02
 */
public class Test1_概述和构造方法 {
    public static void main(String[] args) throws Exception{
        /*
            概述:java.io.FileReader类继承Reader类,表示字符输入流,用来读取字符数据
            构造方法:
                - FileReader(File file)： 创建一个新的 FileReader ，给定要读取的File对象。
                - FileReader(String fileName)： 创建一个新的 FileReader ，给定要读取的文件的名称。
            注意:
                    1.当你创建一个输入流对象时，必须传入一个文件路径。
                    2.该路径下，如果没有该文件,会抛出FileNotFoundException
         */
        // 文件存在:
        // 创建字符输入流对象,关联数据源文件路径
        FileReader fr1 = new FileReader("day12\\ddd\\a.txt");
        FileReader fr2 = new FileReader(new File("day12\\ddd\\a.txt"));

        // 文件不存在:
        FileReader fr3 = new FileReader("day12\\ddd\\b.txt");// 报文件找不到异常
    }
}

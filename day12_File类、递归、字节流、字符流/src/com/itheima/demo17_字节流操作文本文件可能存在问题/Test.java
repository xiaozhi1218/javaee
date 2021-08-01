package com.itheima.demo17_字节流操作文本文件可能存在问题;

import java.io.FileInputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 16:53
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // 需求:使用字节流读取出a.txt文件中的每个字符数据并打印到控制台
        // 1.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day12\\ddd\\a.txt");

        // 2.定义一个int变量,用来存储读取到的字节数据
        int len;

        // 3.循环读取
        while ((len = fis.read()) != -1){
            System.out.println((char)len);
        }

        // 4.释放资源
        fis.close();
    }
}

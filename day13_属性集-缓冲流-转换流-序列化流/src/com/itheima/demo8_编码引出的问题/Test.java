package com.itheima.demo8_编码引出的问题;

import java.io.FileReader;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 12:27
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // 字符流读取gbk编码的文件(含中文)
        // 创建字符输入流对象,关联数据源文件路径
        FileReader fr = new FileReader("day13\\bbb\\gbk.txt");// 乱码
        //FileReader fr = new FileReader("day13\\bbb\\utf8.txt");// 不乱吗

        // 定义一个变量,用来存储读取到的字符数据
        int len;

        // 循环读取
        while ((len = fr.read()) != -1) {
            // 在循环中,打印输出
            System.out.println((char)len);
        }

        // 关闭流,释放资源
        fr.close();

    }
}

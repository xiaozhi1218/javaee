package com.itheima.demo11_转换文件编码;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 15:18
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // 需求: 将GBK编码的文本文件，转换为UTF-8编码的文本文件。
        // 1.创建转换输入流对象,指定gbk编码,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\bbb\\gbk.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");

        // 2.创建转换输出流对象,指定utf8编码,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\bbb\\gbk_utf8.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf8");

        // 3.定义一个int变量,用来存储读取到的字符数据
        int len;

        // 4.循环读取
        while ((len = isr.read()) != -1) {
            // 5.写出数据
            osw.write(len);
        }
        // 6.释放资源
        osw.close();
        isr.close();

    }
}

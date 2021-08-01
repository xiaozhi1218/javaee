package com.itheima.demo10_OutputStreamWriter类的使用;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 14:50
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            OutputStreamWriter类的使用:
                概述:java.io.OutputStreamWriter ，是Writer的子类
                特点:
                    1.可以把字节输出流转换为字符输出流
                    2.可以指定编码写出数据,也可以接受平台默认的编码
                构造方法:
                    - OutputStreamWriter(OutputStream in): 创建一个使用默认字符集的字符流。 idea默认的是utf8
                    - OutputStreamWriter(OutputStream in, String charsetName): 创建一个指定字符集的字符流。
         */
        // 案例1: 指定字符集(gbk)写出数据
        // 创建转换输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\bbb\\b.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        // 写出数据
        osw.write("传智播客");// gbk编码写出数据,占8个字节

        // 关闭流,释放资源
        osw.close();
    }

    private static void method01() throws IOException {
        // 案例1: 使用平台默认的字符集写出数据
        // 创建转换输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\bbb\\a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        // 写出数据
        osw.write("传智播客");// utf8编码写出数据,占12个字节

        // 关闭流,释放资源
        osw.close();
    }
}

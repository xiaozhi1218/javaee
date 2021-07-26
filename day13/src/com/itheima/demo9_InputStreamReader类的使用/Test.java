package com.itheima.demo9_InputStreamReader类的使用;

import java.io.*;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 14:35
 */
public class Test {
    public static void main(String[] args)throws Exception {
       /*
            InputStreamReader类的使用:
                概述:java.io.InputStreamReader，是Reader的子类
                特点:
                    1.将字节输入流转换为字符输入流
                    2.指定编码读数据,也可以接受平台默认的字符集

                构造方法:
                    - InputStreamReader(InputStream in): 创建一个使用默认字符集的字符流。
                    - InputStreamReader(InputStream in, String charsetName): 创建一个指定字符集的字符流。
        */
       // 指定编码读数据
        // 创建转换输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\bbb\\gbk.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");

        // 定义一个int类型的变量,用来存储读取到的字符数据
        int len;

        // 循环读取数据
        while ((len = isr.read()) != -1) {
            // 在循环中,打印读取到的字符数据
            System.out.println((char)len);// 中国
        }
        // 关闭流,释放资源
        isr.close();
    }

    // 使用默认字符集的字符流读utf8编码文件
    private static void method02() throws IOException {
        // 创建转换输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\bbb\\utf8.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        // 定义一个int类型的变量,用来存储读取到的字符数据
        int len;

        // 循环读取数据
        while ((len = isr.read()) != -1) {
            // 在循环中,打印读取到的字符数据
            System.out.println((char)len);// 不乱码
        }
        // 关闭流,释放资源
        isr.close();
    }

    // 使用默认字符集的字符流读gbk编码文件
    private static void method01() throws IOException {
        // 创建转换输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\bbb\\gbk.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        // 定义一个int类型的变量,用来存储读取到的字符数据
        int len;

        // 循环读取数据
        while ((len = isr.read()) != -1) {
            // 在循环中,打印读取到的字符数据
            System.out.println((char)len);// 乱码
        }
        // 关闭流,释放资源
        isr.close();
    }
}

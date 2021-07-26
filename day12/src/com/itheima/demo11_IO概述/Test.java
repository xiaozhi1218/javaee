package com.itheima.demo11_IO概述;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 12:08
 */
public class Test {
    public static void main(String[] args) {
        /*
            IO概述:
                概述:
                    I: Input  表示输入:从其他存储设备 读取数据 到内存中
                    O: Output 表示输出:从内存中 写出数据 到其他存储设备
                IO的分类:
                    按类型分:
                        字节流:以字节为基本单位进行读写数据
                            字节输入流: 以字节为基本单位进行读数据
                            字节输出流: 以字节为基本单位进行写数据

                        字符流:以字符为基本单位进行读写数据
                            字符输入流:以字符为基本单位进行读数据
                            字符输出流:以字符为基本单位进行写数据
                    按流向分:
                        输入流:
                            字节输入流: 以字节为基本单位进行读数据
                            字符输入流:以字符为基本单位进行读数据

                        输出流:
                            字节输出流: 以字节为基本单位进行写数据
                            字符输出流:以字符为基本单位进行写数据
              IO的父类:
                  字节输入流:顶层父类是InputStream抽象类,常见的子类FileInputStream
                  字节输出流:顶层父类是OutputStream抽象类,常见的子类FileOutputStream
                  字符输入流:顶层父类是Reader抽象类,常见的子类FileReader
                  字符输出流:顶层父类是Writer抽象类,常见的子类FileWriter
              注意事项:
                1.idea默认编码是utf8编码
                2.gbk编码一个中文占2个字节,utf8编码一个中文占3个字节
                3.如果存和取的编码不一致就会乱码,如果一致就不乱码
         */
    }
}

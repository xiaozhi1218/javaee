package com.itheima.demo13_FileOutputStream类;

import java.io.FileOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 14:55
 */
public class Test2_写出单个字节数据 {
    public static void main(String[] args) throws Exception{
        /*
            FileOutputStream类的写出数据:
                - public abstract void write(int b) ：将指定的字节写入输出流。
                - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
         */
        // 创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day12\\bbb\\a.txt");

        // 写出单个字节数据
        fos.write(97);
        fos.write(98);
        fos.write(99);

        // 关闭流,释放资源
        fos.close();
    }
}

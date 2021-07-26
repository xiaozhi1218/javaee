package com.itheima.demo13_FileOutputStream类;

import java.io.FileOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 14:55
 */
public class Test4_写出指定范围字节数组数据 {
    public static void main(String[] args) throws Exception{
        /*
            FileOutputStream类的写出数据:
                - public void write(byte[] b, int off, int len) ：写指定范围的字节数组的字节数据到输出流。
                - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
         */
        // 创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day12\\bbb\\c.txt");

        // 创建字节数组,存储字节数据
        byte[] bys = {97,98,99,100};

        // 写出指定范围字节数组中的字节数据
        fos.write(bys, 1,2 );

        // 关闭流,释放资源
        fos.close();
    }
}

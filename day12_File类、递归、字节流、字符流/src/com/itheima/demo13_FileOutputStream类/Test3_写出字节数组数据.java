package com.itheima.demo13_FileOutputStream类;

import java.io.FileOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 14:55
 */
public class Test3_写出字节数组数据 {
    public static void main(String[] args) throws Exception{
        /*
            FileOutputStream类的写出数据:
                - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
                - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
         */
        // 创建字节输出流,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day12\\bbb\\b.txt");
        // 创建字节数组,并存储字节数据
        byte[] bys = {97,98,99,100};
        // 写出该字节数组中的字节数据
        fos.write(bys);
        // 关闭流,释放资源
        fos.close();
    }
}

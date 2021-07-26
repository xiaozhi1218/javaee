package com.itheima.demo15_FileInputStream类;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 16:00
 */
public class Test3_读取字节数组长度个字节数据 {
    public static void main(String[] args) throws Exception{
        /*
             FileInputStream类读取数据:
                - public int read(byte[] b)： 从输入流中读取一些字节数据，并将它们存储到字节数组 b中,返回的是读取到的字节个数。
         */
        // 创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day12\\ccc\\b.txt");

        // 创建一个长度为2的字节数组,用来存储读取到的字节数据
        byte[] bys = new byte[2];

        // 读取字节数据
        /*int len1 = fis.read(bys);
        System.out.println("bys数组转换为字符串:"+new String(bys,0,len1));// ab
        System.out.println(len1);// 2

        int len2 = fis.read(bys);
        System.out.println("bys数组转换为字符串:"+new String(bys,0,len2));// cd
        System.out.println(len2);// 2

        int len3 = fis.read(bys);
        System.out.println("bys数组转换为字符串:"+new String(bys,0,len3));// e
        System.out.println(len3);// 1

        int len4 = fis.read(bys);
        //System.out.println("bys数组转换为字符串:"+new String(bys));// ed
        System.out.println(len4);// -1*/

        // 定义一个int类型的变量,用来存储读取到的有效字节个数
        int len;
        while ((len = fis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }

        // 关闭流,释放资源
        fis.close();
    }
}

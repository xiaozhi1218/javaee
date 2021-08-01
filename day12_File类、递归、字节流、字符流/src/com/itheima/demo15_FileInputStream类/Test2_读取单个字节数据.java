package com.itheima.demo15_FileInputStream类;

import java.io.FileInputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 16:00
 */
public class Test2_读取单个字节数据 {
    public static void main(String[] args) throws Exception {
        /*
            FileInputStream类读取数据:
                - public abstract int read()： 读一个字节,如果到达流的末尾，则返回 -1。
         */
        // 创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day12\\ccc\\a.txt");

        // 读一个字节
       /* int len1 = fis.read();
        System.out.println((char)len1);// a

        int len2 = fis.read();
        System.out.println((char)len2);// b

        int len3 = fis.read();
        System.out.println((char)len3);// c

        int len4 = fis.read();
        System.out.println(len4); // -1*/

        // 定义一个int类型的变量,用来存储读取到的字节数据
        int len;

        // fis读取一个字节数据,把读取到的字节数据赋值给len,然后拿len的值与-1进行比较
        while ( (len = fis.read()) != -1) {
            System.out.println(len);
        }

        // 关闭流,释放资源
        fis.close();

    }
}

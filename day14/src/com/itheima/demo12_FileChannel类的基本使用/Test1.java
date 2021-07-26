package com.itheima.demo12_FileChannel类的基本使用;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 15:56
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        /*
            FileChannel类的基本使用:
                概述:：用于读、写文件的通道。可以看成是IO中的输入和输出流
                怎么获取FileChannel:
                    可以通过FileInputStream和FileOutputStream的getChannel()方法方便的获取一个它的子类对象。
         */
        // 通过输入流获取
        FileInputStream fis = new FileInputStream("day14\\aaa\\hbCopy1.jpg");
        FileChannel fc1 = fis.getChannel();

        // 通过输出流获取
        FileOutputStream fos = new FileOutputStream("day14\\aaa\\hbCopy5.jpg");
        FileChannel fc2 = fos.getChannel();

    }
}

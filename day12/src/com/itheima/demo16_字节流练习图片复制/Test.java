package com.itheima.demo16_字节流练习图片复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 16:27
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            练习:字节流练习：图片复制
            一次读写一个字节拷贝文件:
                1.创建字节输入流对象,关联数据源文件路径
                2.创建字节输出流对象,关联目的地文件路径
                3.定义一个变量用来存储读取到的字节数据
                4.循环读取
                5.在循环中,写出数据
                6.关闭流,释放资源

            一次读写一个字节数组拷贝文件:
                1.创建字节输入流对象,关联数据源文件路径
                2.创建字节输出流对象,关联目的地文件路径
                3.定义一个字节数组,用来存储读取到的字节数据
                3.定义一个变量用来存储读取到的字节个数
                4.循环读取
                5.在循环中,写出数据
                6.关闭流,释放资源
         */
        //一次读写一个字节拷贝文件:
       /* // 1.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day12\\aaa\\hb.jpg");
        // 2.创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day12\\ccc\\hbCopy1.jpg");
        // 3.定义一个变量用来存储读取到的字节数据
        int len;
        // 4.循环读取
        while ((len = fis.read()) != -1) {
            // 5.在循环中,写出数据
            fos.write(len);
        }
        // 6.关闭流,释放资源
        fos.close();
        fis.close();*/

        //  一次读写一个字节数组拷贝文件:
        // 1.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day12\\aaa\\hb.jpg");
        // 2.创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day12\\ccc\\hbCopy2.jpg");
        // 3.定义一个字节数组,用来存储读取到的字节数据
        byte[] bys = new byte[8192];
        // 3.定义一个int变量,用来存储读取到的字节个数
        int len;
        // 4.循环读取
        while ((len = fis.read(bys)) != -1) {
            // 5.在循环中,写出数据
            fos.write(bys,0,len);
        }
        // 6.关闭流,释放资源
        fos.close();
        fis.close();
    }
}

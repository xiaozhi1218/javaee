package com.itheima.demo2_JDK7的处理;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 9:26
 */
public class Test {
    public static void main(String[] args) {
        /*
            jdk7的处理:try-with-resource 语句
            特点:try-with-resource 语句，该语句确保了每个资源在语句结束时关闭。
            格式:
                try (创建流对象语句，如果多个,使用';'隔开) {
                    // 读写数据
                } catch (IOException e) {
                    e.printStackTrace();
                }
         */
        // 一次读写一个字节数组拷贝文件
        try (
                // 1.创建字节输入流对象,关联数据源文件路径
                FileInputStream fis = new FileInputStream("day13\\aaa\\hbCopy1.jpg");

                // 2.创建字节输出流对象,关联目的地文件路径
                FileOutputStream fos = new FileOutputStream("day13\\aaa\\hbCopy4.jpg");
        ) {


            // 3.定义一个字节数组,用来存储读取到的字节数据
            byte[] bys = new byte[8192];

            // 3.定义一个int变量,用来存储读取到的字节个数
            int len;

            // 4.循环读取数据
            while ((len = fis.read(bys)) != -1) {
                // 5.在循环中,写出数据
                fos.write(bys, 0, len);
            }

        } catch (Exception e) {
            System.out.println("出现了异常");
        }


    }
}

package com.itheima.demo19_commonsio工具包;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 17:03
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            commons-io工具包:
                概述: 提供了很多关于io的工具类库
                使用步骤:
                    1. 下载commons-io相关jar包；http://commons.apache.org/proper/commons-io/
                    2. 把commons-io-2.7.jar包复制到指定的Module的lib目录中
                    3. 将commons-io-2.7.jar加入到classpath中
                使用:
                    IOUtils工具类的方法:
                        public static int copy(InputStream in, OutputStream out)；
                        把input输入流中的内容拷贝到output输出流中，返回拷贝的字节个数(适合文件大小为2GB以下)

                        public static long copyLarge(InputStream in, OutputStream out)；
                        把input输入流中的内容拷贝到output输出流中，返回拷贝的字节个数(适合文件大小为2GB以上)

                    FileUtils工具类的方法:
                        public static void copyFileToDirectory(final File srcFile, final File destFile)
                        复制文件到另外一个目录下。

                        public static void copyDirectoryToDirectory( File file1 , File file2 );
                        复制file1目录到file2位置。

         */
        // 需求:拷贝day13\ccc文件夹到day13\ddd文件夹中
       // 创建File对象,表示源文件夹路径
        File f1 = new File("day13\\ccc");
       // 创建File对象,表示目标文件夹路径
        File f2 = new File("day13\\ddd");
        // 拷贝文件夹
        FileUtils.copyDirectoryToDirectory(f1, f2);

    }

    private static void method02() throws IOException {
        // 需求:复制文件到另外一个目录下。
        // 创建File对象,表示源文件路径
        File f1 = new File("day13\\aaa\\hbCopy1.jpg");
        // 创建File对象,表示目标文件夹路径
        File f2 = new File("day13\\ddd");
        // 拷贝文件
        FileUtils.copyFileToDirectory(f1, f2);
    }

    /**
     *  IOUtils工具类的方法:
     * @throws IOException
     */
    private static void method01() throws IOException {
        // 创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\aaa\\jdk9.exe");
        // 创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\aaa\\jdk9Copy1.exe");
        // 使用IOUtils类拷贝文件
        IOUtils.copy(fis, fos);
        // 释放资源
        fos.close();
        fis.close();
    }
}

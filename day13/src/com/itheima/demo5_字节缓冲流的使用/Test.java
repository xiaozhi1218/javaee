package com.itheima.demo5_字节缓冲流的使用;

import java.io.*;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 10:44
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            字节缓冲流的使用:
                特点:读写效率高
                构造方法:
                    - public BufferedInputStream(InputStream in) ：创建一个 新的缓冲输入流。
                    - public BufferedOutputStream(OutputStream out)： 创建一个新的缓冲输出流。
         */
        // 拷贝文件效率测试
        // 0.获取当前系统时间距离标准基准时间的毫秒值
        long start = System.currentTimeMillis();

        // 1.创建输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\aaa\\jdk9.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // 2.创建输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\aaa\\jdk9Copy3.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        // 3.定义一个字节数组,用来存储读取到的字节数据
        byte[] bys = new byte[8192];

        // 3.定义一个int变量,用来存储读取到的字节个数
        int len;

        // 4.循环读取数据
        while ((len = bis.read(bys)) != -1) {
            // 5.在循环中,写出数据
            bos.write(bys,0,len);
        }

        // 6.关闭流,释放资源
        bos.close();
        bis.close();

        // 7.获取当前系统时间距离标准基准时间的毫秒值
        long end = System.currentTimeMillis();

        // 8.计算2个时间之差
        System.out.println("总共花了:" + (end - start) + "毫秒");// 大概3秒

    }

    private static void method03() throws IOException {
        // 字节缓冲流拷贝jdk9.exe文件
        // 0.获取当前系统时间距离标准基准时间的毫秒值
        long start = System.currentTimeMillis();

        // 1.创建输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\aaa\\jdk9.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // 2.创建输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\aaa\\jdk9Copy2.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        // 3.定义一个int变量,用来存储读取到的字节数据
        int len;

        // 4.循环读取数据
        while ((len = bis.read()) != -1) {
            // 5.在循环中,写出数据
            bos.write(len);
        }

        // 6.关闭流,释放资源
        bos.close();
        bis.close();

        // 7.获取当前系统时间距离标准基准时间的毫秒值
        long end = System.currentTimeMillis();

        // 8.计算2个时间之差
        System.out.println("总共花了:" + (end - start) + "毫秒");// 大概33秒
    }

    // 普通流拷贝jdk9.exe文件
    private static void method02() throws IOException {
        // 0.获取当前系统时间距离标准基准时间的毫秒值
        long start = System.currentTimeMillis();

        // 1.创建输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\aaa\\jdk9.exe");

        // 2.创建输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\aaa\\jdk9Copy1.exe");

        // 3.定义一个int变量,用来存储读取到的字节数据
        int len = 0;

        // 4.循环读取数据
        while ((len = fis.read()) != -1) {
            // 5.在循环中,写出数据
            fos.write(len);
        }
        // 6.关闭流,释放资源
        fos.close();
        fis.close();

        // 7.获取当前系统时间距离标准基准时间的毫秒值
        long end = System.currentTimeMillis();

        // 8.计算2个时间之差
        System.out.println("总共花了:" + (end - start) + "毫秒");// 至少大概十多分钟...
    }

    /**
     * 字节缓冲流的构造方法
     *
     * @throws FileNotFoundException
     */
    private static void method01() throws FileNotFoundException {
        // 创建字节缓冲输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day13\\aaa\\jdk9.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // 创建字节缓冲输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day13\\aaa\\jdk9Copy1.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
    }
}

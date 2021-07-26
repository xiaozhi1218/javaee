package com.itheima.demo12_FileChannel类的基本使用;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 16:00
 */
public class Test2_使用FileChannel类完成文件的复制 {
    public static void main(String[] args) throws Exception {
        // 需求: 复制hbCopy.jpg文件
        // 思路: 使用FileChannel读取数据到字节缓冲数组中,再从字节缓冲数组中写入到目的地文件中
        // 1.创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("day14\\aaa\\hbCopy1.jpg");

        // 2.创建字节输出流对象,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day14\\aaa\\hbCopy5.jpg");

        // 3.通过输入流对象获取FileChannel对象
        FileChannel c1 = fis.getChannel();

        // 3.通过输出流对象获取FileChannel对象
        FileChannel c2 = fos.getChannel();

        // 4.创建字节缓冲数组,用来存储读取到的字节数据
        ByteBuffer b = ByteBuffer.allocate(8192);

        // 5.循环读取字节数据
        while (c1.read(b) != -1) {
            // flip一下: position变成:0,limit变成:position(8192)  为了保证写出的时候,写出的是读取的数据
            b.flip();

            // 6.在循环中,写出字节数据
            c2.write(b);

            // clear一下: position变成:0,limit变成:capacity(8192)  供下一次循环使用
            b.clear();

        }
        // 7.关闭流,释放资源
        c2.close();
        c1.close();
        fos.close();
        fis.close();

    }
}

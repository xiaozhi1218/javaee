package com.itheima.demo13_FileChannel结合MappedByteBuffer实现高效读写;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 16:19
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        /*
            FileChannel结合MappedByteBuffer实现高效读写:
             MappedByteBuffer类:
                概述:MappedByteBuffer是一个ByteBuffer子类
                作用:它可以将文件直接映射至内存，把硬盘中的读写变成内存中的读写, 所以可以提高大文件的读写效率。
                使用:
                    1.可以调用FileChannel的map()方法获取一个MappedByteBuffer:
                        MappedByteBuffer map(MapMode mode, long position, long size);
                        说明：将节点中从position开始的size个字节映射到返回的MappedByteBuffer中。
                        mode:
                            FileChannel.MapMode.READ_ONLY：得到的镜像只能读不能写
                            FileChannel.MapMode.READ_WRITE：得到的镜像可读可写
                            FileChannel.MapMode.PRIVATE：得到一个私有的镜像
                    2.使用RandomAccessFile获得Channel
                        因为使用输入流获得的Channel只能指定读模式
                        因为使用输出流获得的Channel只能指定写模式
                        只有RandomAccessFile获取的Channel才能开启任意的这三种模式
         */
        // 1.创建RandomAccessFile对象: r表示读,rw表读写
        RandomAccessFile r1 = new RandomAccessFile("day14\\aaa\\hbCopy1.jpg", "r");
        RandomAccessFile r2 = new RandomAccessFile("day14\\aaa\\hbCopy6.jpg", "rw");

        // 2.获得Channel对象
        FileChannel c1 = r1.getChannel();
        FileChannel c2 = r2.getChannel();

        // 3.获取源文件的字节大小
        long size = c1.size();

        // 3.使用Channel调用map方法获得MappedByteBuffer
        MappedByteBuffer m1 = c1.map(FileChannel.MapMode.READ_ONLY, 0, size);
        MappedByteBuffer m2 = c2.map(FileChannel.MapMode.READ_WRITE, 0, size);

        // 4.把m1数组中的字节数据拷贝到m2中
        for (long i = 0; i < size; i++) {
            // 获取m1中的字节
            byte b = m1.get();
            // 把获取到的字节存储到m2中
            m2.put(b);
        }

        // 5.释放资源
        c2.close();
        c1.close();
        r2.close();
        r1.close();

    }
}

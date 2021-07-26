package com.itheima.demo12_字节输出流OutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 14:37
 */
public class Test {
    public static void main(String[] args) {
        /*
            字节输出流【OutputStream】:
                概述:java.io.OutputStream抽象类是所有字节输出流的父类,用来写出字节数据
                成员方法:
                    - public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
                                            close方法，当完成流的操作时，必须调用此方法，释放系统资源。

                    - public abstract void write(int b) ：将指定的字节写入输出流。
                    - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
                    - public void write(byte[] b, int off, int len) ：写指定范围的字节数组的字节数据到输出流。

         */
    }
}

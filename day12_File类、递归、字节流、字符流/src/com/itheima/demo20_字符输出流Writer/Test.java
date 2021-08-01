package com.itheima.demo20_字符输出流Writer;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:14
 */
public class Test {
    public static void main(String[] args) {
        /*
            字符输出流【Writer】:
                概述:java.io.Writer抽象类是表示用于字符输出流的所有类的超类，将指定的字符信息写出到目的地。
                成员方法:
                    - public void write(int c) ：写出一个字符。
                    - public void write(char[] cbuf)：将 b.length字符从指定的字符数组写出此输出流。
                    - public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
                    - public void write(String str) ：写出一个字符串。
                    - public void write(String str,int off,int len) ：写出一个字符串的一部分。
                    - public abstract void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
                    - public abstract void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。
         */
    }
}

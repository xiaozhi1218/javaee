package com.itheima.demo21_FileWriter类;

import java.io.FileWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:38
 */
public class Test6_关闭和刷新 {
    public static void main(String[] args) throws Exception{
        /*
            - public abstract void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
            - public abstract void flush() ：刷新此输出流并强制任何缓冲的输出字符被写出。

            - flush ：刷新缓冲区，流对象可以继续使用。
            - close ：关闭流，释放系统资源。关闭前会刷新缓冲区,但关闭后流不能再使用了。

         */
        // 创建字符输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day12\\ddd\\h.txt");

        // 写字符串
        fw.write("itheima");

        // 刷新
        fw.flush();
        fw.write("-itcast");
        fw.flush();

        // close关
        fw.write("-java");
        fw.close();

        fw.write("-hello");// 报异常
        fw.close();
    }
}

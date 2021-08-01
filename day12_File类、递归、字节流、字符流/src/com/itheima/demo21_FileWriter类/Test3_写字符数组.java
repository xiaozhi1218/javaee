package com.itheima.demo21_FileWriter类;

import java.io.FileWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:25
 */
public class Test3_写字符数组 {
    public static void main(String[] args) throws Exception{
        /*
             - public void write(char[] cbuf)：将 b.length字符从指定的字符数组写出此输出流。
             - public abstract void write(char[] b, int off, int len) ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流。
         */
        // 创建字符输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day12\\ddd\\e.txt");

        // 写字符数组
        char[] chs = {'a','b','中','国','!'};
       fw.write(chs);
       fw.write(chs, 0, 2);

        // 关闭流,释放资源
        fw.close();
    }
}

package com.itheima.demo21_FileWriter类;

import java.io.FileWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:26
 */
public class Test4_写字符串 {
    public static void main(String[] args) throws Exception {
        /*
             - public void write(String str) ：写出一个字符串。
             - public void write(String str,int off,int len) ：写出一个字符串的一部分。
         */
        // 创建字符输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day12\\ddd\\f.txt");

        // 写字符串
        String str = "itheima-java-itcast";
        fw.write(str);
        fw.write(str,1,5);

        // 关闭流,释放资源
        fw.close();
    }
}

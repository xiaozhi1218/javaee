package com.itheima.demo21_FileWriter类;

import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:25
 */
public class Test2_写单个字符 {
    public static void main(String[] args) throws Exception{
        /*
            - public void write(int c) ：写出一个字符。
         */
        // 创建字符输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day12\\ddd\\d.txt");

        // 写出单个字符
        fw.write('a');
        fw.write('b');

        // 关闭流,释放资源
        fw.close();
    }
}

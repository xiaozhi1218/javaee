package com.itheima.demo19_FileReader类;

import java.io.FileReader;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:07
 */
public class Test2_读取单个字符数据 {
    public static void main(String[] args) throws Exception {
        /*
            - public int read()： 从输入流读取一个字符,读取到末尾返回-1
         */
        // 创建字符输入流对象,关联数据源文件路径
        FileReader fr = new FileReader("day12\\ddd\\a.txt");

        // 定义一个int变量,用来存储读取到的字符数据
        int len;

        // 循环读取
        while ((len = fr.read()) != -1) {
            // 在循环中,打印输出
            System.out.println((char) len);
        }
        // 关闭流,释放资源
        fr.close();
    }
}

package com.itheima.demo19_FileReader类;

import java.io.FileReader;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:07
 */
public class Test3_读取字符数组长度个字符数据 {
    public static void main(String[] args) throws Exception{
        /*
             - public int read(char[] cbuf)： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中,读取到末尾返回-1
         */
        // 创建字符输入流对象,关联数据源文件路径
        FileReader fr = new FileReader("day12\\ddd\\a.txt");

        // 创建字符数组,用来存储读取到的字符数据
        char[] chs = new char[3];

        // 定义一个int变量,用来存储读取到的有效字符个数
        int len;

        // 循环读取
        while ((len = fr.read(chs)) != -1) {
            // 在循环中,打印输出
            System.out.println(new String(chs,0,len));
        }
        // 关闭流,释放资源
        fr.close();

    }
}

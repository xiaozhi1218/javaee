package com.itheima.demo6_字符缓冲流的使用;

import java.io.*;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 11:25
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            字符缓冲流:
                构造方法:
                    - public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
                    - public BufferedWriter(Writer out)： 创建一个新的缓冲输出流。

                特有方法:
                    - BufferedReader：public String readLine(): 读一行文字。如果已到达流末尾，则返回 null
                    - BufferedWriter：public void newLine(): 写一行行分隔符,由系统属性定义符号。
         */
        // 字符缓冲输出流,写数据到文本中
        // 创建字符缓冲输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day13\\aaa\\c.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // 写出数据
        bw.write("静夜思");
        bw.newLine();

        bw.write("床前明月光");
        bw.newLine();

        bw.write("疑是地上霜");
        bw.newLine();

        bw.write("举头望明月");
        bw.newLine();

        bw.write("低头思故乡");

        // 关闭流,释放资源
        bw.close();

    }

    private static void method01() throws IOException {
        // 字符缓冲输入流读文本文件(一行一行读)
        // 创建字符缓冲输入流对象,关联数据源文件路径
        FileReader fr = new FileReader("day13\\aaa\\b.txt");
        BufferedReader br = new BufferedReader(fr);

        // 定义一个String变量,用来存储读取到的行数据
        String line;

        // 循环读取行数据
        while ((line = br.readLine()) != null){
            // 打印数据
            System.out.println(line);
        }

        // 关闭流,释放资源
        br.close();
    }
}

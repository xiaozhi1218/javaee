package com.itheima.demo7_文本排序;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 11:47
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 需求:请将文本信息恢复顺序。
        // 分析:
        // 1.创建ArrayList集合,用来存储读取到的行数据
        ArrayList<String> list = new ArrayList<>();

        // 2.创建字符缓冲输入流对象,关联数据源文件路径
        FileReader fr = new FileReader("day13\\aaa\\d.txt");
        BufferedReader br = new BufferedReader(fr);

        // 3.定义一个字符串变量,用来存储读取到的字符串数据
        String line;

        // 4.循环读取数据
        while ((line = br.readLine()) != null) {
            // 5.在循环中,把读取到的行数据存储到集合中
            list.add(line);
        }
        // 6.关闭流,释放资源
        br.close();

        // 7.对集合中的元素进行排序
        Collections.sort(list);

        // 8.创建字符缓冲输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day13\\aaa\\d.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // 9.循环遍历集合
        for (String s : list) {
            // 10.在循环中,把遍历出来的元素,写回文件中
            bw.write(s);
            bw.newLine();
        }
        // 11.关闭流,释放资源
        bw.close();
    }
}

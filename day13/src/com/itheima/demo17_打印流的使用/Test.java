package com.itheima.demo17_打印流的使用;

import java.io.PrintStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 16:26
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            打印流的使用:
               概述:java.io.PrintStream类，是一个字节输出流
               特点: 该类能够方便地打印各种数据类型的值，是一种便捷的输出方式。
               构造方法:
                    public PrintStream(String fileName)： 使用指定的文件名创建一个新的打印流。
               成员方法:
                    void print(任意类型);  不换行打印数据
                    void println(任意类型);换行打印数据
         */
        // 需求:打印各种数据到day13\\ccc\\d.txt文件中
        // 1.创建打印流对象,关联目的地文件路径
        PrintStream ps = new PrintStream("day13\\ccc\\d.txt");

        // 2.打印数据
        // 换行
        ps.println(97);// 打印整数
        ps.println('a');// 打印字符
        ps.println(3.14);// 打印小数
        ps.println(true);// 打印boolean类型
        ps.println("itheima");// 打印字符串
        // 不换行
        ps.print(97);// 打印整数
        ps.print('a');// 打印字符
        ps.print(3.14);// 打印小数
        ps.print(true);// 打印boolean类型
        ps.print("itheima");// 打印字符串

        // 3.关闭流,释放资源
        ps.close();

        System.out.println("===================扩展====================");
        System.out.println(97);// 打印到控制台
        System.out.println('a');// 打印到控制台
        // 说明系统的打印流对象,关联的路径就是控制台
        // 需求:改变系统打印流对象,关联的路径为day13\ccc\e.txt
        PrintStream ps1 = new PrintStream("day13\\ccc\\e.txt");
        System.setOut(ps1);
        System.out.println(97);// 打印到e.txt
        System.out.println('a');// 打印到e.txt

    }
}

package com.itheima.demo10_递归文件搜索;

import java.io.File;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 11:44
 */
public class Test {
    public static void main(String[] args) {
        // 需求:递归输出day12\src目录中的所有.java文件的绝对路径。
        // 作业:
        //    1.统计非空文件夹的字节大小
        //    2.删除非空文件夹

        printJavaFile(new File("day12\\src"));
    }

    /**
     * 搜索文件
     *
     * @param file
     */
    public static void printJavaFile(File file) {
        // 1.获取该目录下的所有子文件和子文件夹的路径
        File[] arr = file.listFiles();

        // 2.循环遍历所有的子文件和子文件夹
        if (arr != null) {
            for (File file1 : arr) {
                // 3.在循环中,判断遍历出来的元素:
                // 4.如果遍历出来的元素是文件,并且该文件是以.java结尾,那么就打印输出
                if (file1.isFile() && file1.getName().endsWith(".java")){
                    System.out.println(file1.getAbsolutePath());
                }
                // 5.如果遍历出来的是文件夹,就递归
                if (file1.isDirectory()){
                    printJavaFile(file1);
                }
            }
        }
    }
}

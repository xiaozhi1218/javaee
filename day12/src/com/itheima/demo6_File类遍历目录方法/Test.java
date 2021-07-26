package com.itheima.demo6_File类遍历目录方法;

import java.io.File;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 10:29
 */
public class Test {
    public static void main(String[] args) {
        /*
            File类遍历目录方法:
                - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或子目录的名称。
                - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或子目录的路径。
         */
        // 创建File对象,表示day12\aaa文件夹
        File f = new File("day12\\aaa");
        // 获取f路径下的所有子文件和子文件夹的名称
        String[] arr1 = f.list();
        // 循环遍历
        for (String s : arr1) {
            System.out.println(s);
        }

        System.out.println("==============================");

        // 获取f路径下的所有子文件和子文件夹的路径
        File[] arr2 = f.listFiles();
        // 循环遍历
        for (File file : arr2) {
            System.out.println(file);
        }

        System.out.println("==============================");

        // 注意:如果文件夹没有访问权限,那么返回的就是null,遍历就会报空指针异常
        File f1 = new File("H:\\System Volume Informations");
        String[] list = f1.list();
        File[] files = f1.listFiles();
        System.out.println(list+","+files);// null,null
        // 报异常,为了代码的健壮性,所以循环之前加一个非空判断
        if (list != null) {
            for (String s : list) {

            }
        }

        // 注意:如果文件夹路径不存在,那么返回的就是null,遍历就会报空指针异常
        File f2 = new File("H:\\Systemaaa");
        String[] list2 = f2.list();
        File[] files2 = f2.listFiles();
        System.out.println(list2+","+files2);// null,null

    }
}

package com.itheima.demo2_绝对路径和相对路径;

import java.io.File;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 9:24
 */
public class Test {
    public static void main(String[] args) {
        /*
            绝对路径和相对路径:
                - 绝对路径：从盘符开始的路径，这是一个完整的路径。
                - 相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。  掌握

            生活中:你在中粮商务公园2栋605    你对象在中粮商务公园
                你告诉你对象你在哪里?
                绝对路径:中国广东省深圳市宝安区留仙二路中粮商务公园2栋605
                相对路径:2栋605

            程序中:
               绝对路径:G:\szitheima104\day12\aaa\hb.jpg
               相对路径:day12\aaa\hb.jpg
         */
        // 绝对路径
        File f1 = new File("G:\\szitheima104\\day12\\aaa\\hb.jpg");

        // 相对路径
        File f2 = new File("day12\\aaa\\hb.jpg");

        System.out.println(f1);
        System.out.println(f2);
    }
}

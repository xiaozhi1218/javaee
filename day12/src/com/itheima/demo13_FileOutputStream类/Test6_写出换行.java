package com.itheima.demo13_FileOutputStream类;

import java.io.FileOutputStream;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 15:18
 */
public class Test6_写出换行 {
    public static void main(String[] args) throws Exception{
        /*
            好诗
            看这风景美如画
            吟诗一首赠天下
            奈何自己没文化
            只能卧槽浪好大
         */
        // 创建字节输出流,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("day12\\bbb\\d.txt");

        // 写出数据
        fos.write("好诗".getBytes());
        fos.write("\r\n".getBytes());

        fos.write("看这风景美如画".getBytes());
        fos.write("\r\n".getBytes());

        fos.write("吟诗一首赠天下".getBytes());
        fos.write("\r\n".getBytes());

        fos.write("奈何自己没文化".getBytes());
        fos.write("\r\n".getBytes());

        fos.write("只能卧槽浪好大".getBytes());

        // 关闭流,释放资源
        fos.close();
    }
}

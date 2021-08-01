package com.itheima.demo21_FileWriter类;

import java.io.FileWriter;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/20 17:34
 */
public class Test5_续写和换行 {
    public static void main(String[] args) throws Exception{
         /*
            好诗
            看这风景美如画
            吟诗一首赠天下
            奈何自己没文化
            只能卧槽浪好大
         */
        // 创建字符输出流对象,关联目的地文件路径
        FileWriter fw = new FileWriter("day12\\ddd\\g.txt",true);

        // 写出数据
        fw.write("\r\n");
        fw.write("好诗");
        fw.write("\r\n");

        fw.write("看这风景美如画");
        fw.write("\r\n");

        fw.write("吟诗一首赠天下");
        fw.write("\r\n");

        fw.write("奈何自己没文化");
        fw.write("\r\n");

        fw.write("只能卧槽浪好大");

        // 关闭流,释放资源
        fw.close();
    }
}

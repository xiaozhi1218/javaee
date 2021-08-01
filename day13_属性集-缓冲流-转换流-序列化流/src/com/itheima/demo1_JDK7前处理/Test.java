package com.itheima.demo1_JDK7前处理;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/22 9:12
 */
public class Test {
    public static void main(String[] args)  {
        /*
            JDK7前处理: try...catch...finally
         */
        // 一次读写一个字节数组拷贝文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            // 1.创建字节输入流对象,关联数据源文件路径
            fis = new FileInputStream("day13\\aaa\\hbCopy1.jpg");

            // 2.创建字节输出流对象,关联目的地文件路径
            fos = new FileOutputStream("day13\\aaa\\hbCopy3.jpg");

            // 3.定义一个字节数组,用来存储读取到的字节数据
            byte[] bys = new byte[8192];

            // 3.定义一个int变量,用来存储读取到的字节个数
            int len;

            // 4.循环读取数据
            while ((len = fis.read(bys)) != -1) {
                // 5.在循环中,写出数据
                fos.write(bys ,0, len);
            }

        }catch (Exception e){
            System.out.println("出现了异常");
        }finally {
            // 一般正常情况永远都会执行,所以一般用来释放资源
            // 6.关闭流,释放资源
            try {
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fis != null){
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

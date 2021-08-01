package com.itheima.demo8_线程优化并发操作;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 11:02
 */
public class Server {
    public static void main(String[] args) throws Exception{
        // 服务器:
        // 1.创建ServerSocket对象,指定端口号(6666)
        ServerSocket ss = new ServerSocket(6666);

        // 循环接收请求
        while (true){
            // 2.调用accept()方法接收客户端请求,得到Socket对象
            Socket socket = ss.accept();

            // 只要建立连接,就开辟线程上传文件
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        // 3.通过返回的Socket对象获得输入流
                        InputStream is = socket.getInputStream();

                        // 4.创建字节输出流对象,关联目的地文件路径
                        FileOutputStream fos = new FileOutputStream("day14\\aaa\\"+System.currentTimeMillis()+".jpg");

                        // 5.定义一个字节数组,用来存储读取到的字节数据
                        byte[] bys = new byte[8192];

                        // 5.定义一个int变量,用来存储读取到的字节个数
                        int len;

                        // 6.循环读取数据
                        while ((len = is.read(bys)) != -1) {// 卡死
                            // 7.在循环中,写出数据
                            fos.write(bys, 0, len);
                        }

                        System.out.println("============开始回写数据给客户端==========");
                        // 8.通过返回的Socket对象获得输出流
                        OutputStream os = socket.getOutputStream();

                        // 9.写出字符串数据给客户端
                        os.write("文件上传成功!".getBytes());

                        // 10.关闭流,释放资源
                        fos.close();
                        socket.close();
                        //ss.close();
                    }catch (Exception e){

                    }
                }
            }).start();

        }
    }
}

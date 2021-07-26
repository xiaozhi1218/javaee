package com.itheima.demo2_客户端向服务器发送字符串数据;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 10:30
 */
public class Server {
    public static void main(String[] args) throws Exception{
        // 服务器:
        // 1.创建ServerSocket对象,指定服务器的端口号(6666)
        ServerSocket ss = new ServerSocket(6666);

        // 2.调用accept()方法,接收客户端的请求,返回Socket对象
        Socket socket = ss.accept();
        System.out.println(socket);// 封装了客户端的ip地址和端口号

        // 3.使用返回的Socket对象获得输入流
        InputStream is = socket.getInputStream();

        // 4.读取客户端写过来的数据
        byte[] bys = new byte[8192];
        int len = is.read(bys);
        System.out.println(new String(bys,0,len));

        // 5.关闭服务器(一般不关闭)
        ss.close();

    }
}

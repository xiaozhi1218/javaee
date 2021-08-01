package com.itheima.demo2_客户端向服务器发送字符串数据;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 10:30
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 客户端:
        // 1.创建Socket对象,指定要连接的服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1",6666);
        System.out.println(socket);// 封装了服务器的ip地址和端口号

        // 2.通过Socket对象获得输出流
        OutputStream os = socket.getOutputStream();

        // 3.写出数据到服务器
        os.write("服务器,你好,今晚约吗?".getBytes());

        // 4.关闭流,释放资源
        socket.close();

    }
}

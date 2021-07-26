package com.itheima.demo15_NIO网络编程收发信息;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 17:19
 */
public class Server {
    public static void main(String[] args)throws Exception {
        // 获得ServerSocketChannel
        ServerSocketChannel ssc = ServerSocketChannel.open();

        // 绑定端口号
        ssc.bind(new InetSocketAddress(6666));

        // 接收请求
        SocketChannel sc = ssc.accept();

        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(1024);

        // 接收客户端写过来的数据
        int len = sc.read(b);
        System.out.println(new String(b.array(),0,len));

        // 释放资源
        ssc.close();
    }
}

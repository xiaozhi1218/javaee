package com.itheima.demo19_AIO同步连接同步读;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Future;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 18:25
 */
public class Server {
    public static void main(String[] args) throws Exception{
        // 同步: 方法一定会有返回值
        // 获取异步服务器通道
        AsynchronousServerSocketChannel assc = AsynchronousServerSocketChannel.open();

        // 绑定端口号
        assc.bind(new InetSocketAddress(6666));

        // 同步等待客户端连接
        System.out.println(1);
        Future<AsynchronousSocketChannel> f1 = assc.accept();
        // 获取异步AsynchronousSocketChannel
        AsynchronousSocketChannel asc = f1.get();

        System.out.println(2);


        // 同步读客户端写过来的数据
        ByteBuffer b = ByteBuffer.allocate(1024);
        Future<Integer> f2 = asc.read(b);

        // 获取读取到的字节个数
        Integer len = f2.get();
        System.out.println(new String(b.array(),0,len));

        // 释放资源
        assc.close();

    }
}

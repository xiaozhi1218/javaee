package com.itheima.demo15_NIO网络编程收发信息;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 17:19
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 获得SocketChannel对象
        SocketChannel sc = SocketChannel.open();

        // 连接服务器
        sc.connect(new InetSocketAddress("127.0.0.1", 6666));

        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(1024);
        // 把数据存储到字节缓冲数组中
        b.put("服务器,你好,今晚约吗?".getBytes());

        // position设置为0,limit设置为之前的position
        b.flip();

        // 写出数据到服务器
        sc.write(b);

        // 释放资源
        sc.close();
    }
}

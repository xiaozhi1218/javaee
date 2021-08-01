package com.itheima.demo14_ServerSocketChannel和SocketChannel创建连接;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 17:08
 */
public class Client {
    public static void main(String[] args) throws Exception{
        /*
            SocketChannel创建连接:
                概述:SocketChannel类用于连接的客户端，它相当于：Socket。
                使用:
                    1.先调用SocketChannel的open()方法打开通道
                    2.调用SocketChannel的实例方法connect(SocketAddress add)连接服务器：
         */
        // 获得通道
        SocketChannel sc = SocketChannel.open();

        // 连接服务器
        sc.connect(new InetSocketAddress("127.0.0.1", 6666));

        // .....

    }
}

package com.itheima.demo17_Selector的常用方法;

import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 17:51
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        /*
             Selector的select()方法:
                作用:  服务器等待客户端连接的方法
                阻塞问题:
                    - 在连接到第一个客户端之前,会一直阻塞
                    - 当连接到客户端后,如果客户端没有被处理,该方法会计入不阻塞状态
                    - 当连接到客户端后,如果客户端有被处理,该方法又会进入阻塞状态
         */
        // 获取3个端口的ServerSocketChannel对象
        ServerSocketChannel ssc1 = ServerSocketChannel.open();
        ServerSocketChannel ssc2 = ServerSocketChannel.open();
        ServerSocketChannel ssc3 = ServerSocketChannel.open();

        // 绑定端口号
        ssc1.bind(new InetSocketAddress(6666));
        ssc2.bind(new InetSocketAddress(7777));
        ssc3.bind(new InetSocketAddress(8888));

        // 设置Channel为非阻塞
        ssc1.configureBlocking(false);
        ssc2.configureBlocking(false);
        ssc3.configureBlocking(false);

        // 获取选择器
        Selector selector = Selector.open();

        // 把Channel注册到选择器上
        ssc1.register(selector, SelectionKey.OP_ACCEPT);
        ssc2.register(selector, SelectionKey.OP_ACCEPT);
        ssc3.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            System.out.println(1);
            // 服务器等待客户端连接
            selector.select();
            System.out.println(2);
            // 处理客户端的请求---->不需要理解
            // 获取所有已连接的Channel通道
            Set<SelectionKey> keys = selector.selectedKeys();
            // 循环遍历已连接的Channel通道
            for (SelectionKey key : keys) {
                // SelectionKey封装ServerSocketChannel
                // 获取客户端要连接的ServerSocketChannel
                ServerSocketChannel channel = (ServerSocketChannel)key.channel();
                // 处理客户端的请求
                SocketChannel sc = channel.accept();
                // ....

            }
        }
    }
}

package com.itheima.demo17_Selector的常用方法;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 18:03
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        /*
            Selector的selectedKeys()方法:
                获取已连接的所有通道集合
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

        while (true){
            System.out.println(1);
            // 服务器等待客户端连接
            selector.select();
            System.out.println(2);
            // 获取已连接的所有通道集合
            Set<SelectionKey> keys = selector.selectedKeys();
            System.out.println("所有已连接的通道个数:"+keys.size());
        }
    }
}

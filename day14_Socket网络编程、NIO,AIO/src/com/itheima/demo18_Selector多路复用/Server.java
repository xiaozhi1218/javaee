package com.itheima.demo18_Selector多路复用;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 18:09
 */
public class Server {
    public static void main(String[] args) throws Exception{
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
            // 循环遍历所有已连接的Channel通道
            /*for (SelectionKey key : keys) {
                // SelectionKey封装了ServerSocketChannel
                // 把key转换为ServerSocketChannel对象
                ServerSocketChannel ssc = (ServerSocketChannel)key.channel();
                // 处理客户端的请求
                SocketChannel sc = ssc.accept();
                // 读取客户端写过来的数据
                ByteBuffer b = ByteBuffer.allocate(1024);
                int len = sc.read(b);
                System.out.println(new String(b.array(),0,len));
                sc.close();

            }*/

            // 获取迭代器
            Iterator<SelectionKey> it = keys.iterator();
            while (it.hasNext()) {
                SelectionKey key = it.next();
                // 把key转换为ServerSocketChannel对象
                ServerSocketChannel ssc = (ServerSocketChannel)key.channel();
                // 处理客户端的请求
                SocketChannel sc = ssc.accept();
                // 读取客户端写过来的数据
                ByteBuffer b = ByteBuffer.allocate(1024);
                int len = sc.read(b);
                System.out.println(new String(b.array(),0,len));
                sc.close();

                // 删除
                it.remove();
            }

        }

        /*
            - 问题: Selector把所有被连接的服务器对象放在了一个Set集合中,但是使用完后并没有删除,导致在遍历集合时,遍历到已经没用的对象,出现了异常
            - 解决办法: 使用完了,应该从集合中删除,由于遍历的同时不能删除,所以使用迭代器进行遍历
                        迭代器

         */
    }
}

package com.itheima.demo20_AIO异步非阻塞连接和异步读;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 18:32
 */
public class Server {
    public static void main(String[] args) throws Exception{
        // 获取异步的服务器通道
        AsynchronousServerSocketChannel assc = AsynchronousServerSocketChannel.open();

        // 绑定端口号
        assc.bind(new InetSocketAddress(6666));

        // 异步非阻塞连接
        System.out.println(1);
        assc.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel asc, Object attachment) {
                // 连接成功
                System.out.println(2);
                // 异步读取客户端写过来的数据
                ByteBuffer b = ByteBuffer.allocate(1024);
                asc.read(b, null, new CompletionHandler<Integer, Object>() {
                    @Override
                    public void completed(Integer len, Object attachment) {
                        // 读成功
                        System.out.println(5);
                        System.out.println(new String(b.array(),0,len));
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        // 读失败
                        System.out.println(6);
                    }
                });

                System.out.println(7);
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                // 连接失败
                System.out.println(3);
            }
        });
        System.out.println(4);

        while (true){

        }
    }
}

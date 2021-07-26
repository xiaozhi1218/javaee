package com.itheima.demo14_ServerSocketChannel和SocketChannel创建连接;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 17:07
 */
public class Server {
    public static void main(String[] args) throws Exception {
        /*
            ServerSocketChannel:
                概述:ServerSocketChannel类用于连接的服务器端，它相当于：ServerSocket
                使用:
                    1.调用ServerSocketChannel的静态方法open()就可以获得ServerSocketChannel对象, 但并没有指定端口号
                    2.用ServerSocketChannel的实例方法bind(SocketAddress add)：绑定本机监听端口。
                        InetSocketAddress是SocketAddress的子类
                    3.用ServerSocketChannel的实例方法accept()：等待连接。
                        默认是阻塞的
                    4.通过ServerSocketChannel的configureBlocking(boolean b)方法设置accept()是否阻塞
                        true:阻塞, false:非阻塞
         */
        // 获得ServerSocketChannel
        ServerSocketChannel ssc = ServerSocketChannel.open();

        // 绑定端口号
        ssc.bind(new InetSocketAddress(6666));

        // 设置非阻塞
        ssc.configureBlocking(false);


        while (true) {
            // 接收客户端连接
            SocketChannel sc = ssc.accept();

            if (sc == null){
                System.out.println("还未连接");
            }else{
                System.out.println("连接成功了!");
                break;
            }
        }
    }
}

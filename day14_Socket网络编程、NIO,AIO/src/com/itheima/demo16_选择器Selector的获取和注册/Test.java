package com.itheima.demo16_选择器Selector的获取和注册;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 17:39
 */
public class Test {
    public static void main(String[] args) throws Exception{
        /*
            作用: 一个Selector可以监听多个Channel发生的事件, 减少系统负担 , 提高程序执行效率
            获取: Selector selector = Selector.open();
            注册: 通过调用 channel对象.register(Selector sel, int ops)方法来实现注册
                  参数1: 选择器
                  参数2: 通过Selector监听Channel时对什么事件感兴趣
                    1. 连接就绪--常量：SelectionKey.OP_CONNECT
                    2. 接收就绪--常量：SelectionKey.OP_ACCEPT      (ServerSocketChannel在注册时只能使用此项)
                    3. 读就绪--常量：SelectionKey.OP_READ
                    4. 写就绪--常量：SelectionKey.OP_WRITE
                注意：
                    1.对于ServerSocketChannel在注册时，只能使用OP_ACCEPT，否则抛出异常。
                    2.对于ServerSocketChannel必须设置为非阻塞
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

    }
}

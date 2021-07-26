package com.itheima.demo1_InetAddress类;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.ServerSocketChannel;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 9:59
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
         /*
            InetAddress类:
                概述: 一个该类的对象就代表一个IP地址对象。
                成员方法:
                    - static InetAddress getLocalHost()   获得本地主机IP地址对象
                    - static InetAddress getByName(String host) 根据IP地址字符串或主机名获得对应的IP地址对象
                    - String getHostName();获得主机名
                    - String getHostAddress();获得IP地址字符串
         */
        // 获得本地主机IP地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1);// DESKTOP-U8Q5F96/192.168.42.80

        // 根据IP地址字符串或主机名获得对应的IP地址对象
        InetAddress ip2 = InetAddress.getByName("DESKTOP-U8Q5F96");
        System.out.println(ip2);// DESKTOP-U8Q5F96/192.168.42.80

        // 获取网络中设备的ip地址对象
        //InetAddress ip3 = InetAddress.getByName("www.baidu.com");
        //System.out.println(ip3);// www.baidu.com/14.215.177.38

        // 获得ip1的主机名
        System.out.println(ip1.getHostName());// DESKTOP-U8Q5F96
        // 获得ip1的ip地址
        System.out.println(ip1.getHostAddress());// 192.168.42.80


    }
}

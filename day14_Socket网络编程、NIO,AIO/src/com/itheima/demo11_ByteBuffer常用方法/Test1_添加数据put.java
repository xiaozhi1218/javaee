package com.itheima.demo11_ByteBuffer常用方法;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 15:03
 */
public class Test1_添加数据put {
    public static void main(String[] args) {
        /*
            - public ByteBuffer put(byte b)：向当前可用位置添加数据。
            - public ByteBuffer put(byte[] byteArray)：向当前可用位置添加一个byte[]数组
            - public ByteBuffer put(byte[] byteArray,int offset,int len)：添加一个byte[]数组的一部分
            - public final byte[] array() 获取封装的byte数组
         */
        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(10);

        // 往字节缓冲数组中添加数据
        b.put((byte)10);
        b.put((byte)20);
        b.put((byte)30);

        // 把b字节缓冲数组转换为byte数组,然后按照指定格式打印输出
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 0, 0, 0, 0, 0, 0, 0]

        // 创建byte数组
        byte[] arr = {10,20,30,40,50};
        b.put(arr);
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 10, 20, 30, 40, 50, 0, 0]


        b.put(arr,2,1);
        System.out.println(Arrays.toString(b.array()));// [10, 20, 30, 10, 20, 30, 40, 50,30, 0]

    }
}

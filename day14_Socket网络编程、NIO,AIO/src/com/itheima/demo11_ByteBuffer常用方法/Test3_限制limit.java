package com.itheima.demo11_ByteBuffer常用方法;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 15:13
 */
public class Test3_限制limit {
    public static void main(String[] args) {
        /*
            限制-limit:
                限制limit是指：第一个不应该读取或写入元素的index索引。
                特点:缓冲区的限制(limit)不能为负，并且不能大于容量。
                方法:
                    - public int limit()：获取此缓冲区的限制。
                    - public Buffer limit(int newLimit)：设置此缓冲区的限制。


         */
        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(10);

        // 容量:10,限制:10
        System.out.println("容量:"+b.capacity()+",限制:"+b.limit());

        // 设置字节缓冲数组的限制
        b.limit(3);
        // 容量:10,限制:3
        System.out.println("容量:"+b.capacity()+",限制:"+b.limit());

        // 往b中添加数据
        b.put((byte)10);
        b.put((byte)20);
        b.put((byte)30);
        System.out.println(Arrays.toString(b.array()));
        //b.put((byte)40);// 报运行异常BufferOverflowException

    }
}

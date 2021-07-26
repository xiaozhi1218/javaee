package com.itheima.demo11_ByteBuffer常用方法;

import java.nio.ByteBuffer;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 15:10
 */
public class Test2_容量capacity {
    public static void main(String[] args) {
        /*
            Buffer的容量(capacity)是指：Buffer所能够包含的元素的最大数量。定义了Buffer后，容量是不可变的。
            public final int capacity(): 获取字节缓冲数组的容量
         */
        // 创建ByteBuffer字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(10);

        // 获取b的容量
        System.out.println("b的容量:"+b.capacity());// b的容量:10,之后不可改变

        byte[] byteArray = {97, 98, 99, 100};
        ByteBuffer b2 = ByteBuffer.wrap(byteArray);
        System.out.println("容量：" + b2.capacity());//4。之后不可改变
    }
}

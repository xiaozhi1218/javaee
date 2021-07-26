package com.itheima.demo10_创建ByteBuffer;

import java.nio.ByteBuffer;

/**
 * @Author：pengzhilin
 * @Date: 2020/9/23 14:54
 */
public class Test {
    public static void main(String[] args) {
        /*
            ByteBuffer类:
                概述:ByteBuffer类内部封装了一个byte[]数组，并可以通过一些方法对这个数组进行操作。
                创建ByteBuffer:
                    方式一：在堆中创建缓冲区：allocate(int capacity)
                    方式二: 在系统内存创建缓冲区：allocatDirect(int capacity)
                    方式三：通过数组创建缓冲区：wrap(byte[] arr)

                    - 在堆中创建缓冲区称为：间接缓冲区  ----------------> 推荐
                    - 在系统内存创建缓冲区称为：直接缓冲区
                    - 间接缓冲区的创建和销毁效率要高于直接缓冲区
                    - 间接缓冲区的工作效率要低于直接缓冲区

         */
        // 方式一: 在堆中创建缓冲区
        ByteBuffer b1 = ByteBuffer.allocate(10);

        // 方式二: 在系统内存创建缓冲区
        ByteBuffer b2 = ByteBuffer.allocateDirect(10);

        // 方式三: 在堆中创建缓冲区
        byte[] bys = new byte[10];
        ByteBuffer b3 = ByteBuffer.wrap(bys);


    }
}
